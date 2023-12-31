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

        Object[] arrInt = {1, 2, 3, 5, 7, 6, 9};
        Object[] arrFloat = {1.57f, 7.654f, 9.986f};
        Object[] arrString = {"a", "ab", "B", "ABC"};

        task1(arrInt);
        task1(arrFloat);
        task1(arrString);
        task4(arrInt);
    }

    public static void task1(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.print(array[i] + ", ");
            } else System.out.print(array[i]);
        }
        System.out.println();
    }

    public static void task4(Object[] array){
        for (int i = 0; i < array.length; i++) {
            if ((int)array[i] % 2 != 0) array[i]=(int)array[i]+1;
        }
        System.out.println(Arrays.toString(array));
    }
}