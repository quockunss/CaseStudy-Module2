import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Ferb",20,"HN");
        Student student2 = new Student("Kae",18,"LA");
        Student student3 = new Student("Harras",12,"TB");


        Map<Integer,Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(18,student1);
        studentMap.put(28,student2);
        studentMap.put(88,student3);
        studentMap.put(888,student1);

        for (Map.Entry<Integer,Student> student : studentMap.entrySet()){
            System.out.println(student.toString());
        }

        System.out.println(".........Set");
        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);

        for (Student student : students){
            System.out.println(Student.toString());
        }
    }

}
