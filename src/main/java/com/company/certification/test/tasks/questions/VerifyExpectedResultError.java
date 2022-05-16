package com.company.certification.test.tasks.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.company.certification.test.model.Data.obtain;
import static com.company.certification.test.userinterface.Destination_Page.PLANET_COLOR;
import static com.company.certification.test.util.constant.ConstantManager.PLANET_BABAHOYO;

public class VerifyExpectedResultError implements Question<Boolean> {

  public static VerifyExpectedResultError inAplication() {
    return new VerifyExpectedResultError();
  }

  @Override
  public Boolean answeredBy(Actor actor) {
      boolean verifyExpectedResult = false;
      String expectedData = obtain("expectedResult");
      String expectedFront = PLANET_COLOR.of(PLANET_BABAHOYO).resolveFor(actor).getText().trim();
      verifyExpectedResult = !expectedFront.equals(expectedData);

      return verifyExpectedResult;
  }

}
