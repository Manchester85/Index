public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 63;
        double height = 1.67;
        double index = service.calculate(63, 1.67);
        System.out.printf("%.1f", index);
    }
}
