package RetoTecnico.questions;

import RetoTecnico.userinterface.JoinToday;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ConfirmRegistration implements Question<Boolean> {
    private String question;

    public ConfirmRegistration(String question){
        this.question = question;
    }

    public static ConfirmRegistration toThe(String question) {
        return new ConfirmRegistration(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String texConfirmation = Text.of(JoinToday.TEXT_CONFIRMATION).viewedBy(actor).asString();
        if (question.equals(texConfirmation)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }

}
