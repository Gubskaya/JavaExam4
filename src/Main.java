import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //задание1
        HashMap<String, String> toys = new HashMap<>();
        toys.put("Боб", "Плюшевый медведь");
        toys.put("Барби", "Кукла");
        toys.put("Хаги Ваги", "Плюшевая игрушка");
        toys.put("Джо", "Кукла");
        toys.put("Ярик", "Кукла");

        for (Map.Entry<String, String> entry : toys.entrySet()){
            System.out.println(entry.getKey() + "- " + entry.getValue() );
        }
        for (Map.Entry<String, String> entry : toys.entrySet()){
            System.out.println(entry.getValue());
        }
        for (Map.Entry<String, String> entry : toys.entrySet()){
            System.out.println(entry.getKey());
        }


    }
}