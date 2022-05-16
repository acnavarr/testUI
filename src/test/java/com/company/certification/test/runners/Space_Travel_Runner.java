package com.company.certification.test.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/space_travel_.feature",
        glue = { "com.company.certification.test.stepdefinitions" },
        snippets = SnippetType.CAMELCASE)

public class Space_Travel_Runner {}
