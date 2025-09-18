import java.util.Scanner;
import java.util.Random;
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
    System.out.println("LLLLLLLLLLL      SSSSSSSSSSSSS");
    System.out.println("LLLLLLLLLLLL      SSSSSSSSSSS");
    String inputChar;
    double tempF;
    Random generator = new Random();
    Scanner keyInput = new Scanner(System.in);
    System.out.println("Please enter a 5-character string:");
    inputChar = keyInput.nextLine();
    System.out.println("");
    System.out.println("Please enter a number in Fahrenheit:");
    tempF = keyInput.nextDouble();
    System.out.println("");
    System.out.println( "Random number generated. Continuing...");
    System.out.println("");
    System.out.print( "Your new string is ");
    System.out.print(((tempF - 32) / 1.8));
    System.out.print(inputChar.charAt(3));
    System.out.print(inputChar.charAt(2));
    System.out.print(inputChar.charAt(1));
    System.out.println(generator.nextInt());
  }}
