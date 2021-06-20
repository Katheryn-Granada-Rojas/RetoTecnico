package RetoTecnico.stepdefinitions;

import RetoTecnico.model.RegisterUser;
import RetoTecnico.questions.ConfirmRegistration;
import RetoTecnico.tasks.OpenPage;
import RetoTecnico.tasks.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.List;

public class StepDefinitions {
    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());}

    @Given("^than the user wants to register on the platform$")
    public void thanTheUserWantsToRegisterOnThePlatform() {
        OnStage.theActorCalled("the user").wasAbleTo(OpenPage.thePage());
    }


    @When("^the user press the Join Today button on the platform$")
    public void theUserPressTheJoinTodayButtonOnThePlatform(List<RegisterUser> registerUser) throws Exception {
        OnStage.theActorCalled("the user").wasAbleTo(Register.onThePage(registerUser.get(0).getFirstName(),
                registerUser.get(0).getLastName(),registerUser.get(0).getEmail(),registerUser.get(0).getMonth(),
                registerUser.get(0).getDay(),registerUser.get(0).getYear(),registerUser.get(0).getLanguage(),
                registerUser.get(0).getCity(),registerUser.get(0).getPostalCode(),registerUser.get(0).getCountry(),
                registerUser.get(0).getPassword(),registerUser.get(0).getConfirmPassword()));


    }

    @Then("^it should allow you to register on the platform$")
    public void itShouldAllowYouToRegisterOnThePlatform(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ConfirmRegistration.toThe(question)));
    }
}
