package calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchException;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calcul;
    @BeforeEach
    void init_Test(){
        calcul = new Calculator();
    }
    @AfterEach
    void delete_Test(){
        calcul = null;

    }

    @Test
    void Test_add() {
        //GIVEN
        int opD = 1;
        int opG = 1;

        //WHEN
        int resultatAdd = calcul.add(opG,opD);

        //THEN
        assertThat(resultatAdd).isEqualTo(2);
    }

    @Test
    void Test_divide_correct() {
        //GIVEN
        Calculator division = new Calculator();
        int opD = 1;
        int opG = 1;

        //WHEN
        double resultatDivBon = calcul.divide(opG,opD);

        //THEN
        assertThat(resultatDivBon).isEqualTo(1);
    }

    @Test
    void Test_divide_0() throws RuntimeException {
        //GIVEN
        int opD = 0;
        int opG = 0;

        //WHEN
        try {
            double resultatDiv0 = calcul.divide(opG, opD);
        }
        catch(Exception e){
            //THEN
            assertThat(e.getMessage()).isEqualTo("Division par 0");
        }

    }
    @ParameterizedTest
    @CsvSource({"0,1,1","1,2,3","-2,2,0","0,0,0","-1,-2,-3"})
    void Test_plusieursValeurs(int opG,int opD,int ResultatAttendu)
    {
        int plsResultatAdd = calcul.add(opG,opD);

        //THEN
        assertThat(plsResultatAdd).isEqualTo(ResultatAttendu);
    }


}