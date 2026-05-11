public class Main {
    static void main() {
        SimpleLogger simpleLogger = new SimpleLogger();
        simpleLogger.log(" текущая дата ");
        SmartLogger smartLogger = new SmartLogger();
        smartLogger.log("error");
        smartLogger.log("INFO");
    }
}
