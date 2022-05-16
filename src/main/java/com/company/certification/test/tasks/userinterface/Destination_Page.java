package com.company.certification.test.tasks.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static com.company.certification.test.util.constant.ConstantManager.CLASE_INTERFAZ_USUARIO;

public class Destination_Page {



    public static final Target LABEL_NEXT_DESTINATION = Target.the("launch").located(By.xpath("//*[@id=\"app\"]/div/section[2]/div[2]/h2"));
    public static final Target LOAD_MORE = Target.the("load more").located(By.xpath("//*[@id=\"app\"]/div/section[2]/div[6]/button"));
    public static final Target PLANET_COLOR = Target.the("planet color").locatedBy("//*[@class='theme__title___35Wsy'][text()='{0}']");


    private Destination_Page() {
        throw new IllegalStateException(CLASE_INTERFAZ_USUARIO);
    }
}