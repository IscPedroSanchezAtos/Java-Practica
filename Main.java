public class Main {
    public static void main(String[] args) {
        Fail f = new Fail();

        try {
            f.fail();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
