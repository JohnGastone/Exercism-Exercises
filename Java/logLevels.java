public class LogLevels {
    public static String message(String logLine) {
        // Task 1: Return the log line's message with leading and trailing white spaces removed
        return logLine.substring(logLine.indexOf(":") + 1).trim();
    }

    public static String logLevel(String logLine) {
        // Task 2: Return the log line's log level in lowercase
        return logLine.substring(1, logLine.indexOf("]:")).toLowerCase();
    }

    public static String reformat(String logLine) {
        // Task 3: Reformat the log line with the message first and log level in parentheses
        String message = message(logLine);
        String logLevel = logLevel(logLine);
        return message + " (" + logLevel + ")";
    }
}
