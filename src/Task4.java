import java.util.HashMap;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {
        //задание 4
        HashMap<String, Pet> map = new HashMap<>();

        Pet dog = new Dog("Собака");
        Pet cat = new Cat("Кошка");
        Pet parrot = new Parrot("Попугай");

        map.put("Бобик", dog);
        map.put("Барсик", cat);
        map.put("Кеша", parrot);

        for (String key: map.keySet()){
            System.out.println(map.get(key));
        }
    }
}
