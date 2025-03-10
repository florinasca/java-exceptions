package coef;

import java.util.Scanner;

public class coeficientCuExceptie {
    public static int coeficient (int number1, int number2){
        if (number2 == 0)
            throw new ArithmeticException("Împărțitorul/divizorul nu poate să fie zero.");

        return number1 / number2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Solicitam user-ului sa introduca 2 integeri
        System.out.println("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        try {
            int rezultat = coeficient(number1, number2);
            System.out.println(number1 + " / " + number2 + " este " + rezultat);
        } catch (ArithmeticException ex) {
            System.out.println("Exceptie: un integer " + "nu poate fi împărțit la zero.");
        }

        System.out.println("Executia continuă ...");
    }
}