/* I have neihter given nor received any unauthorized aid on this piece of work */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Sum of two integers
        Scanner scanner = new Scanner(System.in);
        System.out.println("I am going to add two integers of your choice. What is the first integer?");
        int a = scanner.nextInt();
        System.out.println("What is the second integer?");
        int b = scanner.nextInt();
        int resultOne = add(a,b);
        System.out.println("The sum of the two integers is " + resultOne);

        //Greeting
        System.out.println("\nI am going to greet you. What is your name?");
        String userName = scanner.next();
        String resultTwo = greeting(userName);
        System.out.println(resultTwo);

        //Sum of four integers
        System.out.println("\nI am going to add four integers of your choice. What is the first integer?");
        a = scanner.nextInt();
        System.out.println("What is the second integer?");
        b = scanner.nextInt();
        System.out.println("What is the third integer?");
        int c = scanner.nextInt();
        System.out.println("What is the fourth integer?");
        int d = scanner.nextInt();
        int resultThree = add(a,b,c,d);
        System.out.println("The sum of the four integers is " + resultThree);

        //Print String
        System.out.println("\nI can print any string. What string would you like me to print?");
        String str = scanner.next();
        printMe(str);

    }

    public static int add(int numOne, int numTwo)
    {
        return numOne + numTwo;
    }

    public static String greeting(String name)
    {
        return "Bonjour, " + name + "!";
    }

    public static int add(int numOne, int numTwo, int numThree, int numFour)
    {
        int sum1 = add(numOne,numTwo);
        int sum2 = add(numThree, numFour);
        return sum1 + sum2;
    }

    public static void printMe(String toBePrinted)
    {
        System.out.println(toBePrinted);
    }



}
