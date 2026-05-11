import java.time.LocalDateTime;

public class SimpleLogger implements Logger{

    @Override
    public void log(String msg) {
        LocalDateTime dateTime = LocalDateTime.now(); //текущее время

        System.out.println("[" + dateTime + "]" + msg);
    }
}
