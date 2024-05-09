public class Main {

    public static void main(String[] args) {
        CycleService service = new CycleService();
    int count = service.calculate(100_000, 60_000, 150_000);
    System.out.println(count);
    }
}