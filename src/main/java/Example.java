import io.art.logging.module.*;
import static io.art.launcher.Activator.*;
import static io.art.logging.module.LoggingModule.*;

public class Example {
    public static void main(String[] args) {
        activator().module(LoggingActivator.logging()).launch();
        logger(Example.class).info("Hello, ART!");
    }
}
