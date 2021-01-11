package genericsandcollections;

public class GenericClass<T extends Number >{
    public void print(T obj){
        System.out.println(obj);
    }

    public static void main(String[] args) {
        GenericClass<Integer> generic = new GenericClass<>();
       generic.print(6);

        }
    }

