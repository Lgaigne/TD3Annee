import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.*;

class DeplacementTest {
    String resultatAttendu;
    Deplacement DeplacementPosition;

    @BeforeEach
    void init_Test(){
         DeplacementPosition = new Deplacement();

    }
    @Test
    void Test_tourner_0(){
        //GIVEN
        int nombreTour = 0;
        resultatAttendu = "Nord";
        //WHEN
        String positionFinal = DeplacementPosition.tourner(nombreTour);
        //THEN
        assertThat(positionFinal).isEqualTo(resultatAttendu);
    }

    @Test
    void Test_tourner_1(){
        //GIVEN
        int nombreTour = 1;
        resultatAttendu = "Est";
        //WHEN
        String positionFinal = DeplacementPosition.tourner(nombreTour);
        //THEN
        assertThat(positionFinal).isEqualTo(resultatAttendu);
    }
    @Test
    void Test_tourner_2(){
        //GIVEN
        int nombreTour = 2;
        resultatAttendu = "Sud";
        //WHEN
        String positionFinal = DeplacementPosition.tourner(nombreTour);
        //THEN
        assertThat(positionFinal).isEqualTo(resultatAttendu);
    }
    @Test
    void Test_tourner_3(){
        //GIVEN
        int nombreTour = 3;
        resultatAttendu = "Ouest";
        //WHEN
        String positionFinal = DeplacementPosition.tourner(nombreTour);
        //THEN
        assertThat(positionFinal).isEqualTo(resultatAttendu);
    }

}