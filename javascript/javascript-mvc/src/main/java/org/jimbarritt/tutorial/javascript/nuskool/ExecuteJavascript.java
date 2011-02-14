package org.jimbarritt.tutorial.javascript.nuskool;

import javax.script.*;
import java.io.*;

public class ExecuteJavascript {

    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");

        String jsFile = "./src/test/js/nu_skool_testing/example_javascript_from_jvm.js";

        executeJs(engine, jsFile);
    }

    private static void executeJs(ScriptEngine engine, String jsFile) {
        FileReader reader = null;
        try {
            reader = new FileReader(jsFile);
            engine.eval(reader);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            tryToClose(reader);
        }
    }

    private static void tryToClose(FileReader reader) {
        if (reader != null) {
            try {
                reader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}