import java.util.HashMap;

public class Person {
    String name;

    public static HashMap<Integer, Person> personPool = new HashMap<>();

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    public static Person buildPerson(String name) {
        Person p = personPool.get(name.hashCode());
        if (p == null) {
            p = new Person(name);
            personPool.put(name.hashCode(), p);
        }
        return p;
    }

    Person(String name) {
        this.name = name;
    }

    public Person intern() {
        Person p = personPool.get(name.hashCode());
        if (p == null) {
            personPool.put(name.hashCode(), this);
            return this;
        } else {
            return p;
        }
    }
}
