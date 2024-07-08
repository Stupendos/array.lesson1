import java.sql.SQLOutput;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        int number1 = numbers[0];
        int number2 = numbers[1];
        int number3 = numbers[2];
        float[] fractions = new float[3];
        fractions[0] = 1.57f;
        fractions[1] = 7.654f;
        fractions[2] = 9.986f;
        int[] arbitrary = new int[10];
        //
        System.out.println("Задача 2");
        System.out.print(numbers[0] + ", " + numbers[1] + ", " + numbers[2]);
        System.out.println();
        System.out.print(fractions[0] + ", " + fractions[1] + ", " + fractions[2]);
        System.out.println();
        for (int index = 0; index < arbitrary.length; index++) {
            arbitrary[index] = index + 1;
            if (arbitrary[index] == arbitrary.length - 1) {
                System.out.println(arbitrary[index]);
                break;
            }
            System.out.print(arbitrary[index] + ", ");
        }
        //
        System.out.println("Задача 3");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (float arr = fractions.length - 1; arr >= 0; arr--) {
            System.out.print(fractions[(int) (int) arr]);
            if (arr > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int index = arbitrary.length - 1; index >= 0; index--) {
            System.out.print(arbitrary[index]);
            arbitrary[index] = index + 1;
            if (index > 0) {
                System.out.print(", ");
            }
        }
        //
        System.out.println();
        System.out.println("Задача 4");
        for (int o = 0; o < numbers.length; o++) {
            if (numbers[o] % 2 == 1) {
                numbers[o] = numbers[o] + 1;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}