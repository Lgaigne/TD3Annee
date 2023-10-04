import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.*;
public class Deplacement {
    public String tourner(int nombre){
        String position = "Nord";
        switch(position){
            case "Nord":
                position = "Est";
                break;
             default:
                 position = "Erreur";
                 break;

        }
        return position;
    }


}
