package Generation;
import java.util.HashSet;
import java.util.*;

public class FacteursPremier {
    public List generate(int nombre){
        List list = new ArrayList<Integer>();
        int diviseur = 2;
        while (nombre > 1) {
            if (nombre % diviseur == 0) {
                list.add(diviseur);
                nombre /= diviseur;
            } else {
                diviseur++;
            }
        }
        return list;
    }


        public static void main(String[] args) {
            System.out.printf("Hello World");
        }
}
