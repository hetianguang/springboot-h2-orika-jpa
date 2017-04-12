package tw_training;

/**
 * Created by tghe on 4/10/17.
 */
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;


@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        packages("tw_training");
    }
}
