package com.company.certification.test.tasks;

import com.company.certification.test.exceptions.TestException;
import com.company.certification.test.util.properties.TestProperties;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenBrowser implements Task {


    public static Performable thePageSite() {
        return Tasks.instrumented(OpenBrowser.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            String url = TestProperties.getUrlFront();
            actor.attemptsTo(Open.url(url));
        } catch (Exception e) {
            throw new TestException(e);
        }
    }
}
