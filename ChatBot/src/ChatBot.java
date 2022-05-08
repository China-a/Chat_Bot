import java.util.Scanner;


public class ChatBot {

    public static void main(String[] args) 
    {
        greet();
        remindName();
        guessAge();
        count();
        test();
    }

    static void greet() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! I'm Mavis the Chat Bot.");
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        System.out.println("Nice to meet you" + name);
 
    }

    static void remindName() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Aww, sorry I wasn't to add your name to my storage properly. Can you tell me again? ");
        String name = scanner.nextLine();

        System.out.println("What a great name you have, " + name + "!");
  
    }

    static void guessAge() {
        Scanner scanner = new Scanner(System.in);

    System.out.println("Let me guess your age.");
    System.out.println("Input the remainders of dividing your age by 3, 5 and 7.");
       
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("It looks like your age is " + age);
        
    
    }

    static void count() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Now I will prove to you that I can count to any number you want.");
        int numberToCountFrom = scanner.nextInt();
        for (int i = 0; i <= numberToCountFrom; i++) 
        {
            System.out.println(i);
        }
    }

       

    static void test(){   
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Which type casting and it's type conversion is correct?");
        System.out.println("A) Explicit, byte -> short -> long -> int -> float -> double \n" +
                           "B) Widening, double -> float -> long -> short -> int -> byte \n" +
                           "C) Implicit, byte -> short -> int -> long -> float -> double \n" +
                           "D) Narrowing, double -> long -> float -> short -> int -> byte");
        while (true) {
            System.out.print("");
            String correctAnswer = scanner.next();

            if (correctAnswer.equalsIgnoreCase("C")) {
                
                System.out.println("CORRECT!!! :) \n" +
                "Your session has timed out. Have a wonderful day! Goodbye");
                break;
            } else {
            System.out.println("Incorrect! Please, try again.");
            }
        }   
    }
}

