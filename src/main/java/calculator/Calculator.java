package calculator;

public class Calculator {
    public int add(int opG, int opD) {
        int resultatAdd = opG + opD;
        return resultatAdd;

    }

    public double divide(int opG, int opD){
        if (opG==0){return 0;}
        double resultatDiv = opG/opD;
        return resultatDiv;
    }
}
