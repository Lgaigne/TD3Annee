import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.*;
public class Deplacement {
    public String tourner(int nombre){
        String position = "Nord";
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
                default:
                    position = "Erreur";
                    break;

            }
        }
        return position;
    }


}
