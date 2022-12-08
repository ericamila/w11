package erica.negocio;

/**
 *
 * @author erica
 */
public class Consumo {

    public String calcMaior(Integer m1, Integer m2, Integer m3, Integer m4, Integer m5, Integer m6, Integer m7, Integer m8,
            Integer m9, Integer m10, Integer m11, Integer m12) {
        int meses[] = {m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12};
        int maiors = 0;
        int indiceMaior = -1;
        for (int i = 0; i < 12; i++) {
            if (meses[i] > maiors) {
                maiors = meses[i];
                indiceMaior = i;
            }
        }
        return Mes(indiceMaior);
    }

    public String calcMenor(Integer m1, Integer m2, Integer m3, Integer m4, Integer m5, Integer m6, Integer m7, Integer m8,
            Integer m9, Integer m10, Integer m11, Integer m12) {
        int meses[] = {m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12};
        int menors = 99999;
        int indiceMenor = 0;
        for (int i = 0; i < 12; i++) {
            if (meses[i] < menors) {
                menors = meses[i];
                indiceMenor = i;
            }
        }
        return Mes(indiceMenor);
    }

    public Integer calcTotal(Integer m1, Integer m2, Integer m3, Integer m4, Integer m5, Integer m6, Integer m7, Integer m8,
            Integer m9, Integer m10, Integer m11, Integer m12) {
        int meses[] = {m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12};

        int totals = 0;
        for (int i = 0; i <= 11; i++) {
            totals += meses[i];
        }
        return totals;
    }

    public String Mes(Integer m) {
        switch (m) {
            case 0:
                return "Janeiro";
            case 1:
                return "Fevereiro";
            case 2:
                return "Março";
            case 3:
                return "Abril";
            case 4:
                return "Maio";
            case 5:
                return "Junho";
            case 6:
                return "Julho";
            case 7:
                return "Agosto";
            case 8:
                return "Setembro";
            case 9:
                return "Outubro";
            case 10:
                return "Novembro";
            case 11:
                return "Dezembro";
            default:
                return "Dezembro";
        }
    }

}
