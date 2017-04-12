package tw_training.pos;

import org.springframework.stereotype.Component;
import tw_training.db.Goods;
import tw_training.db.ItemRepo;
import tw_training.db.Promotions;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by tghe on 4/11/17.
 */
@Path("/")
@Component
public class posApi {
    @Path("items")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Goods> getAllItems() {
        return ItemRepo.getAllItems();
    }

    @Path("promotions")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Promotions> getAllPromotion() {
        return ItemRepo.loadPromotions();
    }

//    @Path("order")
//    @POST
//    @Produces(MediaType.APPLICATION_JSON)
//    @Consumes(MediaType.APPLICATION_JSON)
//    public
}
