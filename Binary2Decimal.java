import java.util.Scanner;

class Binary2Decimal
{
 public static int bin2Dec(String binaryString) throws NumberFormatException 
 {
  int decimal = 0;
  int strLength=binaryString.length();
  for (int i = 0; i < strLength; i++) 
  {
   if (binaryString.charAt(i) < '0' || binaryString.charAt(i) > '1')
   {
    throw new NumberFormatException("Not a binary number...");
   }
   
   decimal += (binaryString.charAt(i)-'0') * Math.pow(2, strLength-1-i);
  }
  return decimal;
 } 
 public static void main(String[] args) 
 {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter Binary Value : ");
  String str = input.nextLine();
  try
  {
   System.out.println("Value = " + bin2Dec(str));
  }
  catch(NumberFormatException e)
  {
   System.out.println(e);
  }
 }
}
