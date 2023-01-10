import java.util.Map;
import java.util.TreeSet;

public class Task5 {
    public static void main(String[] args) {
        //задание 5
        TreeSet<Student> treeSet = new TreeSet<>();
        Student st1 = new Student("Даша", 3, 4.0);
        Student st2 = new Student("Mаша", 2, 3.5);
        Student st3 = new Student("Cаша", 1, 2.9);
        Student st4 = new Student("Паша", 4, 1.3);
        Student st5 = new Student("Яна", 3, 3.7);

        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        treeSet.add(st5);

        for (Student s : treeSet){
            System.out.println(s);
        }


    }
}
