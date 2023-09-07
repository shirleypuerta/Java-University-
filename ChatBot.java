import java.util.Scanner;

public class ChatBot{
   public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    
    System.out.println("Hello What is your name?");
    String nombre=scan.nextLine();
    
    System.out.println("Hi "+nombre+" I'am Javabot. Where are you from?");
    String ciudad=scan.nextLine();

    System.out.println("I hear it's beautiful at "+ciudad+" I'm from a place called Oracle");
    System.out.println("How old are you?");
    int edad=scan.nextInt();
    scan.nextLine();

    System.out.println("So you are "+edad+ " I'm 400 years old");
    int times = 400/edad;
    System.out.println("This mean I am "+times+" older than you");

    System.out.println("What is your favorite language?");
    String lenguaje=scan.nextLine();

    System.out.println(lenguaje+" that`s great! Nice chatting with you "+nombre+" I have to log off now. See ya!");
    scan.close();
   }
}