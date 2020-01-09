/*
 *  14/02/2019
 */
package nether.experimental;

import java.util.Arrays;

public class PrintNumbers {

    public static int[] numbers() {
        int num[] = new int[75];

        int i;
        int j = 0;

        for (i = 2700; i < 2774; i++) {

            num[j] = i;
            j += 1;
        }

        return num;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(numbers()));
    }

}
