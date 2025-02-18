import java.lang.Math;
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World!");
        int iniInt = 10000;
        byte iniByte = 100;
        float iniFloat = 100F;

        char iniChar = 'D';
        String name = "Nabil";
        boolean nabilTrue = true;
        boolean nabilFalse = false;

        int x = 3, y = 5, z = 10;
        System.out.println("max is " + Math.abs(-7.9));


//        System.out.println(iniInt);
//        System.out.println(nabilFalse);
//        System.out.println(nabilTrue);
//        System.out.println(x + y + z);
//        System.out.println(name);
//        System.out.println(iniChar);
//        System.out.println(iniByte);
//        System.out.println(iniFloat);

        int a = 10;
        a <<= 50;
        System.out.println(a);


        // Create variables of different data types
        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';

        // Print variables
        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + costPerItem + currency);
        System.out.println("Total cost = " + totalCost + currency);

        // Set the maximum possible score in the game to 500
        int maxScore = 500;

        // The actual score of the user
        int userScore = 423;

        /* Calculate the percantage of the user's score in relation to the maximum available score.
        Convert userScore to float to make sure that the division is accurate */
        float percentage = (float) userScore / maxScore * 100.0f;

        System.out.println("User's percentage is " + percentage);
    }

}