import java.util.Scanner;

public class Coeficient {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        //solicitam user-ului sa introduca e integeri
        System.out.println("Enter two integers: ");
        Scanner input = null;
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        System.out.println(number1 + " / " + number2 + "este " + (number1/number2));

        if (number2 != 0)
            System.out.println(number1 + " / " + number2 + " este " + (number1 / number2));
        else
            System.out.println("Împărțitorul/divizorul nu poate fi 0.");
    }
}

