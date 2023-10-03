import Generation.FacteursPremier;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.*;


import static org.junit.jupiter.api.Assertions.*;

class FacteursPremierTest {
    List<Integer> resultatAttendu;
    @BeforeEach
    void init_Test(){
        resultatAttendu = new ArrayList<Integer>();

    }

    @Test
    void Test_generation_2(){
        //GIVEN
        int nombre = 2;
        resultatAttendu.add(2);

        FacteursPremier generationPremier = new FacteursPremier();
        //WHEN
         List nbPremier = generationPremier.generate(nombre);
        //THEN
        assertThat(nbPremier).isEqualTo(resultatAttendu);

    }
    @Test
    void Test_generation_1(){
        //GIVEN
        int nombre = 1;


        FacteursPremier generationPremier = new FacteursPremier();
        //WHEN
        List nbPremier = generationPremier.generate(nombre);
        //THEN
        assertThat(nbPremier).isEqualTo(resultatAttendu);

    }
    @Test
    void Test_generation_4(){
        //GIVEN
        int nombre = 4;
        resultatAttendu.add(2);
        resultatAttendu.add(2);


        FacteursPremier generationPremier = new FacteursPremier();
        //WHEN
        List nbPremier = generationPremier.generate(nombre);
        //THEN
        assertThat(nbPremier).isEqualTo(resultatAttendu);

    }
    @Test
    void Test_generation_2310(){
        //GIVEN
        int nombre = 2310;
        resultatAttendu.add(2);
        resultatAttendu.add(3);
        resultatAttendu.add(5);
        resultatAttendu.add(7);
        resultatAttendu.add(11);


        FacteursPremier generationPremier = new FacteursPremier();
        //WHEN
        List nbPremier = generationPremier.generate(nombre);
        //THEN
        assertThat(nbPremier).isEqualTo(resultatAttendu);

    }

}