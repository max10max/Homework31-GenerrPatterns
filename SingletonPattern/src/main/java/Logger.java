import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;

public class Logger {
    private static Logger instance = null;
    protected int num = 1;

    private Logger() {
    }

    public void log(String msg) {
        String timeConsole = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss")
                .format(Calendar.getInstance().getTime());
        System.out.println("[" + timeConsole + " " + num++ + "] " + msg);
    }

    public static Logger getInstance() {
        if (instance == null) instance = new Logger();
        return instance;
    }


}
