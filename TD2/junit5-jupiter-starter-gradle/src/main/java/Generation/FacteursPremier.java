package Generation;
import java.util.HashSet;
import java.util.*;

public class FacteursPremier {
    public List generate(int nombre){
        List list = new ArrayList<Integer>();
        if(nombre > 1){
            list.add(2);
        }
        return list;
    }


        public static void main(String[] args) {
            System.out.printf("Hello World");
        }
}
