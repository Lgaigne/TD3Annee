package calculator;

import java.util.HashSet;
import java.util.Set;

public class Calculator {
    public int add(int opG, int opD) {
        int resultatAdd = opG + opD;
        return resultatAdd;
    }

    public double divide(int opG, int opD) {
        if (opD == 0) {
            throw  new IllegalArgumentException("Division par 0");
        } else {
            double resultatDiv = opG / opD;
            return resultatDiv;
        }
    }
    public Set<Integer> ensembleChiffres(int pNombre){
        Set<Integer> list = new HashSet<Integer>();
        int absPNombre=Math.abs(pNombre);
        String ChiffreEnLettre = String.valueOf(absPNombre);

        for(int i=0;i<ChiffreEnLettre.lenght())


    }
}