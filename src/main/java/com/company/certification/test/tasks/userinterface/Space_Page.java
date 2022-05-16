package com.company.certification.test.tasks.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static com.company.certification.test.util.constant.ConstantManager.CLASE_INTERFAZ_USUARIO;

public class Space_Page {

    public static final Target DEPARTING = Target.the("departing").located(By.xpath("//*[@id=\"app\"]/div/section[1]/div[3]/div/div[1]/div/div/input"));
    public static final Target RETURNING = Target.the("returning").located(By.xpath("//*[@id=\"app\"]/div/section[1]/div[3]/div/div[2]/div/div/input"));
    public static final Target SELECTION_DAY = Target.the("selection day").located(By.xpath("//*[@class='theme__days___3kAIy']//span"));
    public static final Target BUTTON_OK = Target.the("button ok").located(By.xpath("/html/body/div[2]/div/div[2]/nav/button[2]"));
    public static final Target ADULTS = Target.the("departing").located(By.xpath("//*[@id=\"app\"]/div/section[1]/div[3]/div/div[3]/div/input"));
    public static final Target CHILDREN = Target.the("children").located(By.xpath("//*[@id=\"app\"]/div/section[1]/div[3]/div/div[4]/div/input"));
    public static final Target ADULTS_LIST = Target.the("adults list").locatedBy("//*[@id=\"app\"]/div/section[1]/div[3]/div/div[3]/ul/li[{0}]");
    public static final Target CHILDREN_LIST = Target.the("children list").locatedBy("//*[@id=\"app\"]/div/section[1]/div[3]/div/div[4]/ul/li[{0}]");
    public static final Target SELECT_DESTINATION = Target.the("Select Button").located(By.xpath("//*[@id=\"app\"]/div/section[1]/div[4]/button"));


    private Space_Page() {
        throw new IllegalStateException(CLASE_INTERFAZ_USUARIO);
    }
}