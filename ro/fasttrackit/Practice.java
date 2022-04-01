package ro.fasttrackit;

import java.util.Random;
import java.util.regex.Pattern;

public class Practice {
    public static void main(String[] args) {
        System.out.println("====Exercise 1====");
        int[] ar = {3, 4, 7, 5};
        int x = ar.length;
        System.out.println(product(ar, x));
        System.out.println("====Exercise 2====");
        int[] z = {3, 4, 27, 2, 1, 40};
        int size = z.length;
        System.out.println(oddNumbers(z, size));
        System.out.println("====Exercise 3====");
        System.out.println(smallerNumbers(new int[]{1, 13, 4, 12, 10, 8, 5}, 10));
        System.out.println("====Exercise 4====");
        System.out.println(donations(3520));
        System.out.println("====Exercise 5====");
        System.out.println(partTwoDonations(2505, 107));
        System.out.println("====Exercise 6====");
        System.out.println(separate("Dau foc la cer sa fac lumina. Sa-mi tina de urat pe drum. Azi ma uit la stele si le spun. Promit sa-ncerc sa fiu mai bun."));

    }

    public static int product(int[] ar, int x) {
        int result = 1;
        for (int i = 0; i < x; i++) {
            result = result * ar[i];
        }
        return result;
    }

    public static int oddNumbers(int[] z, int size) {
        int i;
        int rezultat = 0;
        for (i = 0; i < size; i++) {
            rezultat = rezultat ^ z[i];
        }
        return rezultat;
    }

    public static String smallerNumbers(int[] arr, int findBelow) {
        String s = "";
        System.out.println("Numbers below " + findBelow + " are: ");
        for (int j : arr) {
            if (j < findBelow) {
                System.out.print(j + " ");
            }
        }
        return s;
    }


    public static String donations(int goalToAchieve) {
        int maxDonations = 0;
        Random x = new Random();

        while (maxDonations < goalToAchieve) {
            maxDonations = maxDonations + (x.nextInt(50) + 1);
        }
        return "Succes ! Donations amount " + maxDonations;
    }

    public static String partTwoDonations(int limitOfTarget, int maxDonations) {
        int donations = 0;
        Random s = new Random();
        int i = 0;
        while (i <= maxDonations) {
            if (donations <= limitOfTarget) {
                donations = donations + (s.nextInt(100) + 1);
                System.out.println(donations);
            } else {
                return "Campaign ended with " + i + " donations.";
            }
            i++;
        }
        return "Max donations reached in: " + donations;
    }

    public static String separate(String phrase) {
        String empty = " ";
        String[] longPhrase = phrase.split(Pattern.quote("."));
        for (String a : longPhrase) {
            System.out.println(a);
        }
        return empty;
    }
}