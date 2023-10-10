import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ConvertisseurRomainTest {

    String resultatAttendu;
    ConvertisseurRomain Convertisseur;

    @BeforeEach
    void init_Test(){
        Convertisseur = new ConvertisseurRomain();

    }

    @Test
    void convertir_1_en_I() {
        //GIVEN
            int nombre = 1;
            resultatAttendu = "I";
        //WHEN
        String positionFinal = Convertisseur.convertir(nombre);
        //THEN
        assertThat(positionFinal).isEqualTo(resultatAttendu);
    }

    @Test
    void convertir_2_en_II() {
        //GIVEN
        int nombre = 2;
        resultatAttendu = "II";
        //WHEN
        String positionFinal = Convertisseur.convertir(nombre);
        //THEN
        assertThat(positionFinal).isEqualTo(resultatAttendu);
    }
}