import java.util.HashMap;
import java.util.Map;

public class Cars {
    public static void main(String[] args) {
        Map<String,Integer> cars = new HashMap<>();
        cars.put("Honda",2012);
        cars.put("lexus",2010);
        cars.put("BMW",2020);
        System.out.println(cars.entrySet());
    }
}