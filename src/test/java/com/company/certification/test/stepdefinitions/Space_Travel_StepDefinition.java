package com.company.certification.test.stepdefinitions;

import com.company.certification.test.exceptions.ExpectedResultErr;
import com.company.certification.test.questions.VerifyExpectedResultOk;
import com.company.certification.test.questions.VerifyExpectedResultError;
import com.company.certification.test.tasks.ClearFiles;
import com.company.certification.test.tasks.Travel;
import com.company.certification.test.tasks.TravelDestination;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

import static com.company.certification.test.exceptions.ExpectedResultErr.EXPECTED_RESULT;
import static com.company.certification.test.tasks.LoadData.loadDataTestWithTheFollowing;
import static com.company.certification.test.tasks.OpenBrowser.thePageSite;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Space_Travel_StepDefinition {

    @Before(order = 1)
    public void configuracionInicial() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Before(order = 2)
    public void clearFiles() {
        Actor customer = Actor.named("customerName");
        customer.attemptsTo(ClearFiles.inTheAplication());
    }

    @Given("^(.*) visit the test page$")
    public void i_visit_the_test_page(String actorName) {
        theActorCalled(actorName).wasAbleTo(thePageSite());
    }


    @When("^(.*) search in the application for a value with this information of traveler$")
    public void i_search_in_the_application_for_a_value_with_this_information(String actorName, List<Map<String, Object>> information) {
        theActorCalled(actorName).wasAbleTo(loadDataTestWithTheFollowing(information));
        theActorInTheSpotlight().attemptsTo(Travel.inTheAplication());
        theActorInTheSpotlight().attemptsTo(TravelDestination.inTheAplication());
    }



    @Then("^I verify the information required for the successful case$")
    public void i_verify_the_required_information() {
        theActorInTheSpotlight().should(
                seeThat(VerifyExpectedResultOk.inAplication())
                        .orComplainWith(ExpectedResultErr.class, EXPECTED_RESULT));
    }

    @Then("^I verify the information required for the alternate case$")
    public void i_verify_the_required_information_alternate() {
        theActorInTheSpotlight().should(
                seeThat(VerifyExpectedResultError.inAplication())
                        .orComplainWith(ExpectedResultErr.class, EXPECTED_RESULT));
    }

}
