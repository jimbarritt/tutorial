package org.jimbarritt.tutorial.javascript.nuskool;

import javax.script.*;
import java.io.*;

public class ExecuteJavascript {

    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");

        executeJs(engine, "./src/test/js/nu_skool_testing/example_javascript_from_jvm.js");

    }

    private static void executeJs(ScriptEngine engine, String jsFile) {
        FileReader reader = null;
        try {
            reader = new FileReader(jsFile);
            engine.eval(reader);

        } catch (Throwable t) {
            t.printStackTrace();
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