import java.util.ArrayList;
import java.util.List;

public class Salad {
    private List<Vegetables> vegetables;

    public Salad() {
        this.vegetables = new ArrayList<>();
    }

    public void addVegetable(Vegetables vegetable) {
        vegetables.add(vegetable);
    }

    public List<Vegetables> getVegetables() {
        return vegetables;
    }
}
