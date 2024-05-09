public class Main {

    public static void main(String[] args) {
        CycleService service = new CycleService();
    int count = service.calculate(10_000, 3_000, 20_000);
    System.out.println(count);
    }
}