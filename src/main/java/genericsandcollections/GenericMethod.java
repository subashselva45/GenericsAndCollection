package genericsandcollections;

public class GenericMethod {
    public <T extends Number> void print(T obj){
        System.out.println(obj);
    }

    public static void main(String[] args) {
        GenericMethod generic = new GenericMethod();
        generic.print(2);
    }
}
