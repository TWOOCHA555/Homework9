//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("________");
        System.out.println("Задача 1:");
        int[] inputArray1 = {15000, 23000, 8000, 32000, 19000};
        double[] outputArray1 = new double[4];

        int sum = 0;
        int max = inputArray1[0];
        int min = inputArray1[0];

        for (int payment : inputArray1) {
            sum += payment;
            if (payment > max) {
                max = payment;
            }
            if (payment < min) {
                min = payment;
            }
        }

        outputArray1[0] = sum;
        outputArray1[1] = max;
        outputArray1[2] = min;
        outputArray1[3] = (double) sum / inputArray1.length;

        System.out.print("inputArray1: ");
        for (int i = 0; i < inputArray1.length; i++) {
            System.out.print(inputArray1[i]);
            if (i < inputArray1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.print("outputArray1: ");
        for (int i = 0; i < outputArray1.length; i++) {
            if (outputArray1[i] == (long) outputArray1[i]) {
                System.out.print((long) outputArray1[i]);
            } else {
                System.out.print(outputArray1[i]);
            }
            if (i < outputArray1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("________");
        System.out.println("Задача 2:");
        int[] inputArray2 = {45000, 62000, 38000, 71000, 53000};
        double[] outputArray2 = new double[inputArray2.length];

        for (int i = 0; i < inputArray2.length; i++) {
            outputArray2[i] = inputArray2[i] * 0.13;
        }

        System.out.print("inputArray2: ");
        for (int i = 0; i < inputArray2.length; i++) {
            System.out.print(inputArray2[i]);
            if (i < inputArray2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        System.out.print("outputArray2: ");
        for (int i = 0; i < outputArray2.length; i++) {
            double rounded = Math.round(outputArray2[i] * 100.0) / 100.0;
            System.out.print(rounded);
            if (i < outputArray2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        System.out.println("________");
        System.out.println("Задача 3:");
        int[] inputArray3 = {3200, 6100, 4900, 7500, 5000};

        boolean[] outputArray3 = new boolean[inputArray3.length];

        for (int i = 0; i < inputArray3.length; i++) {
            outputArray3[i] = inputArray3[i] > 5000;
        }

        System.out.print("inputArray3: ");
        for (int i = 0; i < inputArray3.length; i++) {
            System.out.print(inputArray3[i]);
            if (i < inputArray3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        System.out.print("outputArray3: ");
        for (int i = 0; i < outputArray3.length; i++) {
            System.out.print(outputArray3[i]);
            if (i < outputArray3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        System.out.println("________");
        System.out.println("Задача 4:");
        int[] inputArray4 = {12000, 9500, -300, 8000, 7000};

        boolean[] outputArray4 = new boolean[1];

        boolean noDelinquency = true;
        for (int balance : inputArray4) {
            if (balance < 0) {
                noDelinquency = false;
                break;
            }
        }
        outputArray4[0] = noDelinquency;

        System.out.print("inputArray4: ");
        for (int i = 0; i < inputArray4.length; i++) {
            System.out.print(inputArray4[i]);
            if (i < inputArray4.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.print("outputArray4: ");
        System.out.println(outputArray4[0]);

        System.out.println("________");
        System.out.println("Задача 5:");
        int[] inputArray5 = {120000, -30000, 85000, 0, 40000};

        int[] outputArray5 = new int[1];

        int profitableMonths = 0;
        for (int profit : inputArray5) {
            if (profit > 0) {
                profitableMonths++;
            }
        }
        outputArray5[0] = profitableMonths;

        System.out.print("inputArray5: ");
        for (int i = 0; i < inputArray5.length; i++) {
            System.out.print(inputArray5[i]);
            if (i < inputArray5.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.print("outputArray5: ");
        System.out.println(outputArray5[0]);
    }
}