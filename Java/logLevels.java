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
//    - It extracts the message from the log line by finding the substring after the colon (`:`).
//    - Leading and trailing white spaces are removed using the `trim()` method.

// 2. **`logLevel(String logLine)` method:**
//    - It extracts the log level from the log line by finding the substring between the square brackets (`[]`).
//    - The log level is converted to lowercase using the `toLowerCase()` method.

// 3. **`reformat(String logLine)` method:**
//    - It calls the `message` and `logLevel` methods to get the message and log level.
//    - It then reformat the log line with the message first and the log level in parentheses.

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
}
```

This would output:

```
Message: Something went wrong!
Log Level: error
Reformatted: Something went wrong! (error)
```