package generic_;
import java.util.*;
public class Homework01 {
    public static void main(String[] args) {
        System.out.println();
        DAO<User> dao = new DAO<>();
        dao.save("haha", new User(114, 24, "yarimasune"));
        dao.save("aaaa", new User(514, 23, "hai"));
        dao.save("gaga", new User(10000, 999, "paimon"));
        dao.save("xixi", new User(112312, 9393, "caonima"));
        System.out.println(dao.list());

        System.out.println(dao.getClass());
    }
}

class DAO<T> {
    private Map<String, T> map;

    public DAO() {
        map = new HashMap<>();
    }

    public void save(String id, T entity) {
        map.put(id,entity);
    }

    public T get(String id) {
        return map.get(id);
    }
    public void update(String id, T entity) {
        map.put(id, entity);
    }
    public List<T> list() {
        return new ArrayList<>(map.values());
    }

    public void delete(String id) {
        map.remove(id);
    }
}

class User {
    private int id;
    private int age;
    private String name;

    public User() {
    }

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
