package tw_training.db;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by tghe on 4/11/17.
 */
public class ItemRepo {

    public static List<Goods> getAllItems() {
        List<Goods> itemsRepo = new LinkedList<>();
        itemsRepo.add(new Goods("ITEM000000","可口可乐","瓶",3.00));
        itemsRepo.add(new Goods("ITEM000001","雪碧","瓶",3.00));
        itemsRepo.add(new Goods("ITEM000002","苹果","斤",5.50));
        itemsRepo.add(new Goods("ITEM000003","荔枝","斤",15.00));
        itemsRepo.add(new Goods("ITEM000004","电池","个",2.00));
        itemsRepo.add(new Goods("ITEM000005","方便面","袋",4.50));
        return itemsRepo;
    }

    public static List<Promotions> loadPromotions() {
        List<Promotions> allPromotions = new LinkedList<>();
        List<String> barcodes = new LinkedList<>();
        barcodes.add("ITEM000000");
        barcodes.add("ITEM000001");
        barcodes.add("ITEM000005");
        allPromotions.add(new Promotions("BUY_TWO_GET_ONE_FREE",barcodes));
        return allPromotions;
    }
}
