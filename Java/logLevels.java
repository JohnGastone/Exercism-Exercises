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

// Certainly! Below is the code for the given tasks:

// Explanation:

// 1. **`message(String logLine)` method:**
// - It extracts the message from the log line by finding the substring after
// the colon (`:`).
// - Leading and trailing white spaces are removed using the `trim()` method.

// 2. **`logLevel(String logLine)` method:**
// - It extracts the log level from the log line by finding the substring
// between the square brackets (`[]`).
// - The log level is converted to lowercase using the `toLowerCase()` method.

// 3. **`reformat(String logLine)` method:**
// - It calls the `message` and `logLevel` methods to get the message and log
// level.
// - It then reformat the log line with the message first and the log level in
// parentheses.

// Here's an example of how you might use these methods:

```java

public class Main {
    public static void main(String[] args) {
        String logLine = "[ERROR]:   Something went wrong!";

        // Task 1
        String message = LogLevels.message(logLine);
        System.out.println("Message: " + message);

        // Task 2
        String level = LogLevels.logLevel(logLine);
        System.out.println("Log Level: " + level);

        // Task 3
        String reformatted = LogLevels.reformat(logLine);
        System.out.println("Reformatted: " + reformatted);
    }
}```

This would output:

```Message:
Something went wrong!
Log Level:
error
Reformatted:
Something went wrong!(error)```

// The Java class `LogLevels` is designed to process log lines according to
// specific formatting rules. Each log line follows the format `"[<LEVEL>]:
// <MESSAGE>"`, where `<LEVEL>` represents the log level (INFO, WARNING, ERROR),
// and `<MESSAGE>` is the log message. The class contains three static methods
// to handle distinct tasks involving log lines. Let's examine each method's
// functionality and how they achieve their objectives:

// ### `message(String logLine)` Method

// - **Objective**: Extract the message from a log line, removing any leading or
// trailing whitespace.
// - **Implementation**: This method uses `substring` to isolate the message
// part of the log line. It does this by finding the index of the colon `":"`
// (which separates the log level from the message), adds 1 to move past the
// colon, and then trims any whitespace from the resulting substring. This
// effectively removes both the log level and any leading or trailing whitespace
// from the message.

// ### `logLevel(String logLine)` Method

// - **Objective**: Extract the log level from a log line and return it in
// lowercase.
// - **Implementation**: The method again uses `substring` but this time to
// isolate the log level. It starts from index 1 to skip the initial bracket
// `"["` and ends at the index of `"]: "`, which marks the end of the log level
// and the start of the message. The extracted log level is then converted to
// lowercase using `toLowerCase()`. This ensures the method returns the log
// level in a consistent format regardless of its case in the input.

// ### `reformat(String logLine)` Method

// - **Objective**: Reformat the log line to put the message first, followed by
// the log level in parentheses.
// - **Implementation**: This method utilizes the previous two methods to
// extract the message and log level separately. It then concatenates these
// pieces into a new format where the message comes first, followed by the log
// level enclosed in parentheses. This reformatting changes the structure of the
// log line for readability or other processing needs.

// ### Summary

// The `LogLevels` class provides a structured approach to handling and
// manipulating log lines. By separating the concerns into distinct methods, it
// offers flexibility in how log lines can be processed, whether that's
// extracting specific parts or reformating the entire line. The use of
// `substring` and `trim` methods demonstrates effective string manipulation
// techniques in Java, while the static method design allows for easy calling
// without needing to instantiate the class.