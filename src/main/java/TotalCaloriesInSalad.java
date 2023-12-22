import java.util.ArrayList;
import java.util.List;

public class TotalCaloriesInSalad {
    int result = 0;
    public int calculateCaloriesInSalad (Salad salad ){
        List<Vegetables> total = new ArrayList<>();
        for (Vegetables vegetables : salad.getVegetables()){
            result = result + vegetables.getCaloriesPer100g();


        }
        return result;
    }
}
