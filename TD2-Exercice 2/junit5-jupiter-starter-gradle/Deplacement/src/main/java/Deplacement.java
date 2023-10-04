import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.*;
public class Deplacement {
    String position = "Nord";
    public String tourner(int nombre){

        for(int i =0;i< nombre;i++) {
            switch (position) {
                case "Nord":
                    position = "Est";
                    break;
                case "Est":
                    position = "Sud";
                    break;
                case "Sud":
                    position = "Ouest";
                    break;
                case "Ouest":
                    position = "Nord";
                    break;
                default:
                    position = "Erreur";
                    break;

            }
        }
        return position;
    }


}
