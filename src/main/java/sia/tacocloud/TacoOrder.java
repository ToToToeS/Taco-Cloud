package sia.tacocloud;

import java.util.ArrayList;
import java.util.List;

public class TacoOrder {

    private String deliveryName;
    private String deliveryStreet;
    private String deliveryCity;
    private String deliveryState;
    private String deliveryZip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;

    private List<Taco> tacos = new ArrayList<Taco>();

    public void addTaco(Taco taco) {
        this.tacos.add(taco);
    }
}
