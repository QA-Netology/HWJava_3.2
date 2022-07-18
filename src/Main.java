public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int growth = 165;
        int weight = 65;
        int bodyMassIndex = service.calculate(growth , weight);
        System.out.println("Индекс массы тела: " + bodyMassIndex);
    }
}
