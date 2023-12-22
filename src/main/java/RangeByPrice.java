import java.util.ArrayList;
import java.util.List;

public class RangeByPrice {
    public List<Vegetables> sortByPrice (Salad salad , int price ){
        List<Vegetables> res  = new ArrayList<>();
        for(Vegetables vegetables : salad.getVegetables()){
            if (vegetables.getPricePer1kg() <= price){
                res.add(vegetables);
            }
        }

        return res;
    }

}
