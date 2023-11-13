import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задача1
        int[] arrayInt = new int[]{1, 2, 3, 5, 7, 6, 9};
        float[] arrayFloat = {1.57f, 7.654f, 9.986f};
        char[] arrayChar = new char[]{'a', 'b', 'c', 'd'};
        //Задача2
        for (int i = 0; i < arrayInt.length; i++) {
            if (i < arrayInt.length - 1) {
                System.out.print(arrayInt[i] + ", ");
            } else System.out.print(arrayInt[i]);
        }
        System.out.println();
        for (int i = 0; i < arrayFloat.length; i++) {
            if (i < arrayFloat.length - 1) {
                System.out.print(arrayFloat[i] + ", ");
            } else System.out.print(arrayFloat[i]);
        }
        System.out.println();
        for (int i = 0; i < arrayChar.length; i++) {
            if (i < arrayChar.length - 1) {
                System.out.print(arrayChar[i] + ", ");
            } else System.out.print(arrayChar[i]);
        }
        System.out.println();
        System.out.println();
        //Задача3
        for (int i = arrayInt.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(arrayInt[i] + ", ");
            } else System.out.print(arrayInt[i]);
        }
        System.out.println();
        for (int i = arrayFloat.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(arrayFloat[i] + ", ");
            } else System.out.print(arrayFloat[i]);
        }
        System.out.println();
        for (int i = arrayChar.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(arrayChar[i] + ", ");
            } else System.out.print(arrayChar[i]);
        }
        System.out.println();
        System.out.println();
        //Задача4
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] % 2 != 0) arrayInt[i]++;
        }
        System.out.println(Arrays.toString(arrayInt));
    }
}