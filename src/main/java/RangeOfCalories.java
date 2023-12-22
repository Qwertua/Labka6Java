import java.util.ArrayList;
import java.util.List;

public class RangeOfCalories {
    public List<Vegetables> findVegetablesByCaloriesRange(Salad salad, int minCalories, int maxCalories) {
        List<Vegetables> result = new ArrayList<>();
        for (Vegetables vegetables : salad.getVegetables()) {
            if (vegetables.getCaloriesPer100g() >= minCalories && vegetables.getCaloriesPer100g() <= maxCalories) {
                result.add(vegetables);
            }
        }

        return result;
    }
}
