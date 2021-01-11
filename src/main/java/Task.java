
import java.util.*;

public class Task {
    private String name;
    private int age;

    public Task(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Set<Task> set = new TreeSet<>((t1,t2)-> t1.getAge()- t2.getAge());

        set.add(new Task("kajal", 34));
        set.add(new Task("nayan", 36));
        set.add(new Task("keerthi", 28));
        set.add(new Task("rashmika", 22));
        set.add(new Task("nivetha", 25));
//        set.add("kajal");
//        set.add("keerthi");
//        set.add("tammana");
//        set.add("nivetha");
//        set.add("monal");

        System.out.println(set);
        Queue<Task> queue = new ArrayDeque<>();
        Task t1 = new Task("vijay",45);
        Task t2 = new Task("surya",44);
        Task t3 = new Task("Ajith",48);
        Task t4 = new Task("rajini",70);
        queue.add(t1);
        queue.add(t2);
        queue.add(t3);
        queue.add(t4);
        System.out.println(queue);

        Queue<Task> queueing = new PriorityQueue<>((p1,p2)->p1.getName().compareTo(p2.getName()));
          queueing.add(t1);
        queueing.add(t2);
        queueing.add(t3);
        queueing.add(t4);

    }
}
