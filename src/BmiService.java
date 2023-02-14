public class BmiService {
    public int calculate(int weightKg, double heightM) {
        int index = (int) (weightKg / (heightM * heightM));
        return index;
    }

}
