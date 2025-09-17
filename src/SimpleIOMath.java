import java.util.Scanner;

/**
 * asks the user questions, does some stuff
 * the jackson five were bangin in their heyday
 * @version 9.15.25
 * @author 28mehta
 * Flint session here:
 */
public class SimpleIOMath {
    private String name;
    private int age;
    private int favNumber;

    /**
     * as the user answer some questions using scanner
     */
    public void promptUser(){
        Scanner in=new Scanner (System.in);
        System.out.print("Question 1: What is your name? ");
        name=in.nextLine();
        //TODO: fix this so JC won;t break my program
        System.out.print("Question 2: How old are you? ");
        age=in.nextInt();
        System.out.print("Question 3: What is your favorite number? ");
        favNumber=in.nextInt();


    }

    private boolean isPrime(int n) {
        // Handle edge cases
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }


        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    private int firstPrimeFactor() {
        // Handle edge case
        if (age <= 1) {
            return -1; // or throw an exception
        }

        // Check all numbers from 2 up to age
        for (int i = 2; i <= age; i++) {
            if (age % i == 0 && isPrime(i)) {
                return i;
            }
        }

        // This should never be reached for valid input
        return age;
    }
    /**
     * Summarize the conversation
     */
    public void printInfo(){
        System.out.print("I'm gonna teach you how to sing it out\n" +
                "Come on, come on, come on \n" +
                "Let me tell you what it's all about Reading, writing, arithmetic\n" +
                "Are the branches of the learning tree \n");
        System.out.println("Your name is "+name);
        System.out.println("Your age is "+age);
        System.out.println("Your next birthday is "+(age+1));
        System.out.println("The first prime factor of " +age+" is: "+firstPrimeFactor());
        System.out.println("Your favorite number is "+favNumber);
        System.out.println("Your favorite number squared is "+(int) (Math.pow(favNumber,2)));

    }
    /**
     * Main method for class SimpleIOMath
     * @param args command line arguments, if needed
     */
    public static void main(String[] args){
        SimpleIOMath app=new SimpleIOMath();
        System.out.println("* Sit yourself down, take a seat * ");
        System.out.println("* All you gotta do is repeat after me * ");
        app.promptUser();
        app.printInfo();
        System.out.println("* end of program *");

    }
}
