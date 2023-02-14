public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int weightKg = 56;
        double heightM = 1.65;
        int index = service.calculate(weightKg, heightM);
        System.out.println("Мой ИМТ:" + index);

    }
}