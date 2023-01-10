import java.util.List;
import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private int course;
    private double jpa;

    public Student(String name, int course, double jpa) {
        this.name = name;
        this.course = course;
        this.jpa = jpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getJpa() {
        return jpa;
    }

    public void setJpa(double jpa) {
        this.jpa = jpa;
    }

    public static void increaseCourse(List<Student> students){
        for (Student s : students){
            if (s.jpa > 3){
                s.course++;
            }
        }

    }

    public static void removeStudents(List<Student> students){
        for (Student s : students){
            if (s.jpa < 3){
                students.remove(s);
            }
        }
    }
    public static void printStudents(List<Student> students, int course){
        for (Student s : students){
                if (s.course == course){
                    System.out.println(s);
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Double.compare(student.jpa, jpa) == 0 && Objects.equals(name, student.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, course, jpa);
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                ", jpa=" + jpa +
                '}';
    }
}
