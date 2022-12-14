import java.util.Scanner;

public class Main {

        private static Scanner scanner = new Scanner(System.in);
        public static void main(String[] args){
            int[] myIntegers = getIntegers(5);
            for(int i = 0; i < myIntegers.length; i++) {
                System.out.println("Element " + i + " is " + myIntegers[i]);
            }
            System.out.println("The average of the numbers is " + getAverage(myIntegers));
        }
        public static int[] getIntegers(int number){
            System.out.println("Enter " + number + " integer values.\n ");
            int[] values = new int[number];

            for (int i = 0; i < number; i++){
                values[i] = scanner.nextInt();
            }

            return values;
        }
        public static double getAverage(int[] array){
            int sum = 0;
            for(int i = 0; i < array.length; i++){
                sum += array[i];
            }
            return (double) sum /(double) array.length;
        }
}
