package coef;
import java.util.*;


class CoeficientCuExceptie {

    public static int coeficient (int number1, int number2){
        if (number2 == 0)
            throw new ArithmeticException("Împărțitorul/divizorul nu poate să fie zero.");

        return number1 / number2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do {
            try {

                System.out.println("Enter two integers: ");
                int number1 = input.nextInt();
                int number2 = input.nextInt();

                int rezultat = coeficient(number1, number2);
                System.out.println(number1 + " / " + number2 + " este " + rezultat);
                continueInput = false;
            } catch (ArithmeticException ex) {
                System.out.println("Exceptie: un integer nu poate fi împărțit la zero.");
            } catch (java.util.InputMismatchException ex) {
                System.out.println("Incercati din nou. (Introducere incorectă: este necesar un număr întreg)");
                input.nextLine();
            }
        } while (continueInput);

        System.out.println("Executia continuă ...");
    }
}
