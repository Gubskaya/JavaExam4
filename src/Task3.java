import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        //задание3

        ArrayList<Student> list = new ArrayList<>();

        Student st1 = new Student("Даша", 3, 4.0);
        Student st2 = new Student("Mаша", 2, 3.5);
        Student st3 = new Student("Cаша", 1, 2.9);
        Student st4 = new Student("Паша", 4, 1.3);
        Student st5 = new Student("Яна", 3, 3.7);

        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        Student.printStudents(list, 3);

    }
}
