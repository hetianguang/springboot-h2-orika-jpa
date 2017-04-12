package tw_training;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.awt.*;

/**
 * Created by tghe on 4/10/17.
 */
@Component
@Path("hello")
public class Hello {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        System.out.println("hellp");
        return  "Got it!";
    }
}
