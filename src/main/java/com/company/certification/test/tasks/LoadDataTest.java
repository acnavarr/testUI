package com.company.certification.test.tasks;


import com.company.certification.test.model.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static com.company.certification.test.util.manager.Manager.obtenerFechaSistema;


public class LoadDataTest implements Task {

    private static final Logger LOGGER = LogManager.getLogger(LoadDataTest.class.getName());
    private List<Map<String, Object>> dataTest;

    public LoadDataTest(List<Map<String, Object>> datosPrueba) {
        this.dataTest = datosPrueba;
    }

    @Override
    @Step("{0} Cargo los datos de la prueba para la automatización #datosPrueba")
    public <T extends Actor> void performAs(T actor) {
        if (!dataTest.isEmpty()) {
            Set<Map.Entry<String, Object>> setMapaAux = dataTest.get(0).entrySet();
            Map<String, Object> mapAuxiliar = setMapaAux.stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
            if (Data.getMap() == null) {
                Data.setMap(mapAuxiliar);
                Data.getMap().put("horaTransaccion", obtenerFechaSistema("HHmmss"));
                Data.getMap().put("fechaTransaccion", obtenerFechaSistema("yyyyMMdd"));
            } else {
                Data.getMap().putAll(mapAuxiliar);
            }
        } else {
            actor.remember("", new HashMap<>());
            LOGGER.info("La lista se encuentra vacia");
        }
    }
}
