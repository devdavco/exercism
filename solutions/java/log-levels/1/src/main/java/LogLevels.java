public class LogLevels {
    
    public static String message(String logLine) {

       // throw new UnsupportedOperationException("Please implement the (static) LogLevels.message() method");

        String[] splitLogLine = logLine.split(": ");
        return splitLogLine[1].trim();

    }

    public static String logLevel(String logLine) {
    //    throw new UnsupportedOperationException("Please implement the (static) LogLevels.logLevel() method");

        String[] looooglevel = logLine.toLowerCase().split("\\[");

        String[] looooglevel2 =  looooglevel[1].split("]");

        return looooglevel2[0];
    }

    public static String reformat(String logLine) {
        //throw new UnsupportedOperationException("Please implement the (static) LogLevels.reformat() method");

        String message = message(logLine);
        String logLevel = logLevel(logLine);
        String finalString = message + " (" + logLevel + ")";

        return finalString;

    }
}
