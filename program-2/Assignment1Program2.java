import java.util.Scanner;
public class Assignment1Program2 {
  public static void main(String[] args) {
  
  int inputBase, inputBaseTen, maxNub; 
  int base1, modbase1, base2, modbase2, base3, modbase3, base4, modbase4;

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

  base2=(base1/inputBase);
  modbase2=(base1%inputBase);

  base3=(base2/inputBase);
  modbase3=(base2%inputBase);

  base4=(base3/inputBase);
  modbase4=(base3%inputBase);

  
  System.out.println();
  System.out.println(inputBaseTen + " (base 10) = " + modbase4 + modbase3 + modbase2 + modbase1 + " (base " + inputBase + ")");
  }

}
