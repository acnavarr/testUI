package com.company.certification.test.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClearFiles implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("logs/app-info.log");
            PrintWriter pw = new PrintWriter(fw);
            pw.write("");
            pw.flush();
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ClearFiles inTheAplication() {
        return instrumented(ClearFiles.class);
    }
}
