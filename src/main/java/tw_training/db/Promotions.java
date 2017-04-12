package tw_training.db;

import java.util.List;

/**
 * Created by tghe on 4/11/17.
 */
public class Promotions {
    private String type = "";
    private List<String> barcodes;

    public Promotions(String type, List<String> barcodes) {
        this.type = type;
        this.barcodes = barcodes;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getBarcodes() {
        return barcodes;
    }

    public void setBarcodes(List<String> barcodes) {
        this.barcodes = barcodes;
    }
}
