package Patterns;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightPattern {
    public static void main(String[] args) {
        FlyWeightGarage flyWeightGarage = new FlyWeightGarage();
        Mercedes mercedes = flyWeightGarage.getMercrdes("red");
        Mercedes mercedes2 = flyWeightGarage.getMercrdes("red");
        System.out.println(mercedes.color);
    }
}
class Mercedes{
    String color;
}
class FlyWeightGarage {
    Map<String, Mercedes> map = new HashMap<>();
    Mercedes getMercrdes(String color){
        Mercedes mercedes = map.get(color);
        if (mercedes == null){
            mercedes = new Mercedes();
            mercedes.color = color;
            map.put(color, mercedes);
        }
        return mercedes;
    }
}