import static java.lang.Math.pow;

public class BmiService {
    public int calculate(int weightKg, double heightM) {

        double doubleHeightM = Math.pow(heightM, 2);
        int index = (int) (weightKg / doubleHeightM);
        return index;
    }


}
