package org.jimbarritt.tutorial.javascript.nuskool;

import java.io.*;

class JsException extends RuntimeException {

    private String filename;
    private int lineNumber;

    public JsException(String filename, int lineNumber) {
        this.filename = filename;
        this.lineNumber = lineNumber;
    }

    @Override public StackTraceElement[] getStackTrace() {
        return super.getStackTrace();
    }

    @Override public void printStackTrace() {
        System.out.println(createJsStacktrace());
    }

    @Override public void printStackTrace(PrintStream printStream) {
        printStream.append(createJsStacktrace());
    }

    @Override public void printStackTrace(PrintWriter printWriter) {
        printWriter.print(createJsStacktrace());
    }

    private String createJsStacktrace() {
//        return "at:\n\t some_path/to/the/js. (" + filename + ":" + lineNumber + ")";
        return "(some_file.js) \n\t at " + new File("./src/test/js/nu_skool_testing/example_javascript_from_jvm.js").getAbsolutePath() + ":38";
    }
}