import java.util.Scanner;
public class Assignment1Program2 {
  public static void main(String[] args) {
  
  int inputBase;
  int inputBaseTen;
  int maxNub;
  int base1;
  int modbase1;
  int base2;
  int modbase2;
  int base3;
  int modbase3;


  Scanner keyInput = new Scanner(System.in);
  
  System.out.println("Base Conversion Program");
  System.out.println();

  System.out.print("Please enter a base (2 – 9):");
  inputBase = keyInput.nextInt();

  maxNub = (int) (Math.pow((inputBase),4) - 1);

  System.out.println();
  System.out.println("The maximum, 4-digit, base 10 number in base " +  inputBase + " is " + maxNub + ".");
  System.out.print("Now, enter a base 10 number in the range 0 to " + maxNub + " to convert: ");
  inputBaseTen = keyInput.nextInt();
  
  base1=(inputBaseTen/inputBase);
  modbase1=(inputBaseTen%inputBase);

  base2=(inputBaseTen/base1);
  modbase2=(inputBaseTen%base1);

  base3=(inputBaseTen/base2);
  modbase3=(inputBaseTen%base2);
  
  
  System.out.println();
  System.out.println(inputBaseTen + " (base 10) =" + " (base " + inputBase + ")");

 System.out.println();
 System.out.println("B1-"+base1);
 System.out.println("M1-"+modbase1);
 System.out.println("B2-"+base2);
 System.out.println("M2-"+modbase2);
 System.out.println("B3-"+base3);
 System.out.println("M3-"+modbase3);


  }

}
