public class ConvertisseurRomain {
    public String convertir(int Nombre){
        String lettreRomain = "I";

        if (Nombre>1){
            lettreRomain = "II";
        }

        return lettreRomain;
    }
}
