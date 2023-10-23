import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionException {
    static int x = 20;
    static int y;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println(" Enter a number");
            y = scanner.nextInt();

            System.out.println(x / y);

        }


        catch (ArithmeticException  e)
        {
            System.out.println(e);
        }
        catch (InputMismatchException e)
        {
            System.out.println(e);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("test fina");
        }


    }
}
