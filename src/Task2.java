import java.util.HashSet;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 20 чисел:");

        for (int i = 0; i < 20; i++) {
            set.add(scanner.nextLine());
        }
        System.out.println("------");
        System.out.println(set);
    }
}
