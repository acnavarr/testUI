package com.company.certification.test.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.util.List;

import static com.company.certification.test.model.Data.obtain;
import static com.company.certification.test.userinterface.Space_Page.BUTTON_OK;
import static com.company.certification.test.userinterface.Space_Page.SELECTION_DAY;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DayDeparting implements Interaction {

    public static DayDeparting inAplication() {
        return instrumented(DayDeparting.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> listaValores = SELECTION_DAY.resolveAllFor(actor);
        for (int iterador = 0; iterador < listaValores.size(); iterador++) {
            String datoUI = listaValores.get(iterador).getText();
            String datoDeparting = obtain("departing").substring(0,2).trim();
            boolean datoEnable = listaValores.get(iterador).isEnabled();
            if((datoUI.equals(datoDeparting) && datoEnable)){
                SELECTION_DAY.resolveAllFor(actor).get(iterador).click();
                BUTTON_OK.resolveFor(actor).click();
                break;
            }
        }
    }
}
