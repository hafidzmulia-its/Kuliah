public class FindDistance {
    public static void main(String[] args) {
        String a;
        String[] nama = new String[1];
        try{
            System.out.println(1/0);
            nama[2] = "Lindia";
            //statement2
        }catch (ArithmeticException ex1) {
            System.out.println(ex1);
        }catch (Exception ex2) {
            System.out.println(ex2);
        } finally {
            System.out.println("bakso");
        }
        System.out.println("rawon");
    }
}