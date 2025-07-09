package Dsa;
// abstract data type
import java.util.Arrays;
public class array {
        public static void main (String[]args){
            int[] num = {5, 6, 7, 8};

            // Store the value at index 1 in a temporary variable
            int temp = num[1];

            // Shift elements to the right starting from the end
            for (int i = num.length - 1; i > 1; i--) {
                num[i] = num[i - 1];
            }

            // Insert the new value at index 1
            num[1] = 55;

            // Insert the stored value at index 2
            num[2] = temp;

            System.out.println(Arrays.toString(num)); // Print the updated array
        }
    }
