import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList numbers = new ArrayList();
        System.out.println(numbers.size()); // 0 vericek
        numbers.add(1);
        numbers.add(10);
        System.out.println(numbers.size());
        numbers.add("Ankara");
        System.out.println(numbers.size());
        System.out.println(numbers.get(2)); // 2. indexdeki elementi döner ->Ankara
        numbers.set(2,"istanbul"); //--> ankarayı istanbul yaptık
        System.out.println(numbers);
        numbers.remove(1);
        System.out.println(numbers);

//        numbers.clear();
//        System.out.println("asdas"+ numbers);

        for(Object a : numbers){ // Arraylist obje tuttugu için obje yazmak lazım
            System.out.println(a);
        }


    }
}