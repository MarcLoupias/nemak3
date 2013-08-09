package fr.nemak3.tools;

import java.io.PrintWriter;
import java.io.StringWriter;

public class LoggerUtils {
    public static String throwableToString(Throwable t) {
        StringWriter writer = new StringWriter();
        t.printStackTrace(new PrintWriter(writer));
        return writer.toString();
    }
}
