package com.company.certification.test.tasks;


import com.company.certification.test.interactions.DayDeparting;
import com.company.certification.test.interactions.DayReturning;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.company.certification.test.model.Data.obtain;
import static com.company.certification.test.userinterface.Space_Page.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Travel implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        Integer adults = Integer.valueOf(obtain("adults")) + 1;
        Integer children = Integer.valueOf(obtain("children")) + 1;
        actor.attemptsTo(
                WaitUntil.the(DEPARTING, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(DEPARTING)
        );
        actor.attemptsTo(DayDeparting.inAplication());
        actor.attemptsTo(
                Click.on(RETURNING)
        );
        actor.attemptsTo(DayReturning.inAplication());
        actor.attemptsTo(
                Click.on(ADULTS),
                Click.on(ADULTS_LIST.of((adults.toString()))),
                Click.on(CHILDREN),
                Click.on(CHILDREN_LIST.of((children.toString()))),
                Click.on(SELECT_DESTINATION)
        );
    }

    public static Travel inTheAplication() {
        return instrumented(Travel.class);
    }
}
