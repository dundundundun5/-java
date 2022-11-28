package generic_;
import java.util.*;
public class GenericExercise {
    public static void main(String[] args) {
        Student[] students = new Student[3];

        HashSet<Student> hashSet = new HashSet<>();
        HashMap<String, Student> hashMap = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            students[i] = new Student("stu" + i);
            hashSet.add(students[i]);
            hashMap.put(students[i].getName(), students[i]);
        }
        for (Student student : hashSet) {
            System.out.println(student);
        }
        Iterator<Map.Entry<String, Student>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Student> next =  iterator.next();
            System.out.println(next.getKey() + "-" + next.getValue());

        }
        Iterator<String> iterator1 = hashMap.keySet().iterator();
        while (iterator1.hasNext()) {
            String next =  iterator1.next();
            System.out.println(next + "---" + hashMap.get(next));
        }
    hashMap.forEach((key,value) -> {
        System.out.println(key + "------" + value);
    });

    }
}


class Student {
    private String name;
    public Student() {
        this.name = "null";
    }
    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}