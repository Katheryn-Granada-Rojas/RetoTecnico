package RetoTecnico.tasks;

import RetoTecnico.userinterface.JoinToday;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

public class Register implements Task {
    private String firstName;
    private String lastName;
    private String email;
    private String month;
    private String day;
    private String year;
    private String language;
    private String city;
    private String postalCode;
    //private String country;
    private String password;
    private String confirmPassword;

    public Register(String firstName, String lastName, String email, String month, String day, String year,
                    String language, String city, String postalCode, /*String country*/ String password, String confirmPassword) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.month = month;
        this.day = day;
        this.year = year;
        this.language = language;
        this.city = city;
        this.postalCode = postalCode;
        //this.country = country;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public static Performable onThePage(String firstName, String lastName, String email, String month, String day,
                                        String year, String language, String city, String postalCode, String country,
                                        String password, String confirmPassword) {
        return Tasks.instrumented(Register.class,firstName,lastName,email,month,day,year,language,city,postalCode,/*country*/
                password,confirmPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(JoinToday.JOIN_TODAY),
                Enter.theValue(firstName).into(JoinToday.FIRST_NAME),
                Enter.theValue(lastName).into(JoinToday.LAST_NAME),
                Enter.theValue(email).into(JoinToday.EMAIL),
                SelectFromOptions.byVisibleText(month).from(JoinToday.SELECT_MONTH),
                SelectFromOptions.byVisibleText(day).from(JoinToday.SELECT_DAY),
                SelectFromOptions.byVisibleText(year).from(JoinToday.SELECT_YEAR),
                Click.on(JoinToday.SELECT_LANGUAGES),
                Enter.theValue(language).into(JoinToday.SELECT_LANGUAGES),
                Click.on(JoinToday.BOTTOM_NEXT_LOCATION),
                Click.on(JoinToday.CITY),
                Enter.theValue(city).into(JoinToday.CITY).thenHit(Keys.ARROW_DOWN).thenHit(Keys.ENTER),
                Click.on(JoinToday.POSTAL_CODE),
                Enter.theValue(postalCode).into(JoinToday.POSTAL_CODE),
                //Click.on(JoinToday.COUNTRY),
                //SelectFromOptions.byValue(country).from(JoinToday.COUNTRY),
                //Enter.theValue(country).into(JoinToday.COUNTRY),
                Click.on(JoinToday.BOTTOM_NEXT_DEVICES),
                Click.on(JoinToday.BOTTOM_NEXT_LAST_STEP),
                Enter.theValue(password).into(JoinToday.PASSWORD),
                Enter.theValue(confirmPassword).into(JoinToday.CONFIRM_PASSWORD),
                Click.on(JoinToday.CHECK_UNO),
                Click.on(JoinToday.CHECK_DOS),
                Click.on(JoinToday.COMPLETE_SETUP));

    }
}
