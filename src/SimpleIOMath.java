import java.util.Scanner;

/**
 * asks the user questions, does some stuff
 * the jackson five were bangin in their heyday
 * @version 9.15.25
 * @author 28mehta
 * Flint session here: https://app.flintk12.com/chats/5841ae2a-272d-4824-a3d5-88dcf47f1cd5
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

        System.out.print("Question 2: How old are you? ");
        while (!in.hasNextInt()) {
            System.out.print("Please enter a number: ");
            in.next();
        }
        age = in.nextInt();
        System.out.print("Question 3: What is your favorite number? ");
        while (!in.hasNextInt()) {
            System.out.print("Please enter a number: ");
            in.next();
        }
        favNumber = in.nextInt();


    }

    private boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    private int firstPrimeFactor() {
        for (int i = 2; i <= age; i++) {
            if (age % i == 0 && isPrime(i)) {
                return i;
            }
        }
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
        System.out.println("Your name is: "+name);
        System.out.println("Your age is: "+age);
        System.out.println("At your next birthday, you will turn "+(age+1));
        System.out.println("The first prime factor of " +age+" is: "+firstPrimeFactor());
        System.out.println("Your favorite number is: "+favNumber);
        System.out.println("Your favorite number squared is: "+(int) (Math.pow(favNumber,2)));
        System.out.println("You are a " + getAgeCategory());

    }

    private String getAgeCategory() {
        if (age < 13) return "child";
        if (age < 20) return "teen";
        if (age < 30) return "half unc";
        if (age < 60) return "unc";
        return "wise elder";
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
