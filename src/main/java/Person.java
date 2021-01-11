import java.util.HashSet;
import java.util.Set;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }



//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }

    public static void main(String[] args) {
//        Set<String> names = new HashSet<>();
//        Person person = new Person("Subash", 25);
//        Person person2 = new Person("Subash", 25);
//        System.out.println(person.hashCode());
//        System.out.println(person2.hashCode());

        Set<String> sets = new HashSet<>();
        sets.add("subash");
        sets.add("subash");
        sets.add("subash");
        sets.add("hi");
        sets.add("hi");
        sets.add("how");
        sets.add("are you");
        System.out.println(sets);
    }
}
