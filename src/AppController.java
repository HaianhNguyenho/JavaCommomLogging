import java.text.MessageFormat;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class AppController {
    private static final Log log = LogFactory.getLog(AppController.class);

    public static void main(String[] args) {
        log.debug("Debug log message");

        divide(4, 2);

        divide(4, 0);

        log.fatal("Fatal log message");
    }


    public static void divide(int number1, int number2){
        try {
            int number = number1 / number2;
            log.info("Ìno: {} / {} = {}");
        } catch (Exception e) {
            String message = MessageFormat.format("Error: Cannot divide two number {0}/{1}", number1, number2);
            log.error(message, e);
            
        }
    }
    
}
