package RetoTecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class JoinToday {
    public static final Target JOIN_TODAY = Target.the("start registration")
            .located(By.linkText("Join Today"));

    public static final Target FIRST_NAME = Target.the("Enter name")
            .located(By.id("firstName"));

    public static final Target LAST_NAME = Target.the("Enter Last name")
            .located(By.id("lastName"));

    public static final Target EMAIL = Target.the("Enter Email address")
            .located(By.id("email"));

    public static final Target SELECT_MONTH = Target.the("Select birth month")
            .located(By.id("birthMonth"));

    public static final Target SELECT_DAY = Target.the("Select birth day")
            .located(By.id("birthDay"));

    public static final Target SELECT_YEAR = Target.the("Select birth year")
            .located(By.id("birthYear"));

    public static final Target SELECT_LANGUAGES = Target.the("Select languages Spanish")
            .located(By.xpath("//input[@type='search']"));

    public static final Target BOTTOM_NEXT_LOCATION = Target.the("Click bottom next location")
            .located(By.xpath("//section[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[2]/a"));

    public static final Target CITY = Target.the("Search city and select").located(By.id("city"));

    public static final Target POSTAL_CODE = Target.the("Enter postal code").located(By.name("zip"));

    //public  static final Target COUNTRY = Target.the("Search and select country")
            //.located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));

    public static final Target BOTTOM_NEXT_DEVICES = Target.the("Click bottom next devices")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a/span"));

    public static final Target BOTTOM_NEXT_LAST_STEP = Target.the("Click bottom next last step")
            .located(By.xpath("//section[@id='regs_container']/div/div[2]/div/div[2]/div/div[2]/div/a/span"));

    public static final Target PASSWORD = Target.the("Insert password")
            .located(By.id("password"));

    public static final Target CONFIRM_PASSWORD = Target.the("Confirm password")
            .located(By.id("confirmPassword"));

    public static final Target CHECK_UNO = Target.the("Select first check")
            .located(By.cssSelector(".error:nth-child(4)"));

    public static final Target CHECK_DOS = Target.the("Select second check")
            .located(By.cssSelector(".error"));

    public static final Target COMPLETE_SETUP = Target.the("Complete setup")
            .located(By.xpath("//a[@id='laddaBtn']/span"));

    public static final Target TEXT_CONFIRMATION = Target.the("confirm successful registration")
            .located(By.xpath("//h1[contains(text(),'Welcome to the world's largest community of freelance software testers!')]"));

}