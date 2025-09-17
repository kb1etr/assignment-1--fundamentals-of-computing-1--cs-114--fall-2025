import java.util.Scanner;

public class Assignment1Program1 {
  public static void main(String[] args) {
    
    System.out.println("LL                 SSSSSSSSSSSS");
    System.out.println("LL                SSSSSSSSSSSSSS");
    System.out.println("LL               SS");
    System.out.println("LL              SS");
    System.out.println("LL               SS");
    System.out.println("LL                 SSSSSSSSS");
    System.out.println("LL                 SSSSSSSSS");
    System.out.println("LL                           SS");
    System.out.println("LL                            SS");
    System.out.println("LL                           SS");
    System.out.println("LLLLLLLLLLLL     SSSSSSSSSSSSS");
    System.out.println("LLLLLLLLLLLL      SSSSSSSSSSS");
  
    String message;
    String tempF;
    
    Scanner string = new Scanner(System.in);

    System.out.println("Please enter a 5-character string:");
    message = string.nextLine();
    System.out.println("");

    System.out.println("Please enter a number in Fahrenheit:");
    tempF = string.nextLine();
    System.out.println("");

    System.out.println( "Random number generated. Continuing...");
    System.out.println("");

    System.out.print( "Your new string is ");

    System.out.print(message.charAt(3));
    System.out.print(message.charAt(2));
    System.out.println(message.charAt(1));
    

  }}
