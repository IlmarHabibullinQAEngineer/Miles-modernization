public class Main {

    public static void main(String[] args) {
        BonusMileService service = new BonusMileService();
        int price = 9_700;
        int miles = service.calculate(price);
        System.out.println(miles);
    }
}
