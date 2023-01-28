import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа. Mассив 1");
        System.out.println("Задача 1");
        int[] weight = new int[3];
        for (int i = 0; i < weight.length; i++) {
            weight[i] = i + 1;
            System.out.println(weight[i]);
        }
        double[] number = {1.57, 7.654, 9.986};
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
        boolean[] booleans = {true, false};
        for (int i = 0; i < booleans.length; i++) {
            System.out.println(booleans[i]);
        }
        System.out.println("Задача 2");
        for (int i = 0; i < weight.length; i++) {
            System.out.print(weight[i]);
            if (i != weight.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println();
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]);
            if (i != number.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println();
        for (int i = 0; i < booleans.length; i++) {
            System.out.print(booleans[i]);
            if (i != booleans.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println();
        System.out.println(" Задача 3 ");
        for (int i = weight.length - 1; i >= 0; i--) {
            System.out.print(weight[i]);
            if (i != 0) {
                System.out.print(" , ");
            }
        }
        System.out.println();
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(number[i]);
            if (i != 0) {
                System.out.print(" , ");
            }
        }
        System.out.println();
        for (int i = booleans.length - 1; i >= 0; i--) {
            System.out.print(booleans[i]);
            if (i != 0) {
                System.out.print(" , ");
            }
        }
        System.out.println();
        System.out.println(" Задача 4 ");
        for (int i = 0; i < weight.length; i++) {
           if (weight[i] %2 == 1) {
               weight[i]++;
           }
            System.out.println(weight[i]);
           if (i != weight.length -1) {
               System.out.print(" , ");
           }
           }

           }

    }





