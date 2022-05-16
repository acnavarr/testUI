package com.company.certification.test.tasks.tasks;


import com.company.certification.test.tasks.interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.company.certification.test.userinterface.Destination_Page.LABEL_NEXT_DESTINATION;
import static com.company.certification.test.userinterface.Destination_Page.LOAD_MORE;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class TravelDestination implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LABEL_NEXT_DESTINATION, isVisible()).forNoMoreThan(5).seconds(),
                Scroll.to(LOAD_MORE),
                Click.on(LOAD_MORE),
                Wait.aTime(3000)
        );
        actor.attemptsTo(Wait.aTime(5000));
    }

    public static TravelDestination inTheAplication() {
        return instrumented(TravelDestination.class);
    }
}
