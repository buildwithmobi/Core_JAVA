package Dsa;

public class selectionSort {
    public static void main(String[] args) {

        int[] numbers = {3, 6, 4, 39, 9, 1};
        System.out.println("UN-SORTED ARRAY");
        for (int num : numbers){
            System.out.print(num + " ");
        }
        System.out.println();

        int temp = 0;
        int minIndex = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            int changesForMin = 0; 

            minIndex = i;

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                    changesForMin++;
                }
            }

            temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;

            for (int num : numbers){
                System.out.print(num + " ");
            }
            System.out.print(" Changes occured : "  +changesForMin);
            System.out.println();
        }

        System.out.println("SORTED ARRAY");
        for (int num : numbers) {
            System.out.print(num+ " ");
        }
    }
}



