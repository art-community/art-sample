import io.art.logging.module.*;
import static io.art.launcher.Activator.*;
import static io.art.logging.module.LoggingActivator.*;
import static io.art.logging.module.LoggingModule.*;

public class Example {
    public static void main(String[] args) {
        activator().module(logging(LoggingInitializer::colored)).quiet(true).launch();
        logger(Example.class).info("Hello, ART!");
    }
}
