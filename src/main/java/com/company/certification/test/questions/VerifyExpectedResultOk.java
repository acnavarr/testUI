package com.company.certification.test.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.company.certification.test.model.Data.obtain;
import static com.company.certification.test.userinterface.Destination_Page.PLANET_COLOR;
import static com.company.certification.test.util.constant.ConstantManager.PLANET_BABAHOYO;


public class VerifyExpectedResultOk implements Question<Boolean> {

    public static VerifyExpectedResultOk inAplication() {
        return new VerifyExpectedResultOk();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean verifyExpectedResult = false;
        String expectedData = PLANET_BABAHOYO;
        String expectedFront = PLANET_COLOR.of(obtain("expectedResult")).resolveFor(actor).getText().trim();
        verifyExpectedResult = expectedFront.equals(expectedData);

        return verifyExpectedResult;
    }

}
