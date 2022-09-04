import java.util.Scanner;

public class binary {

   public static String intToReverseBinary(int integerValue) {
      String binary = "";
      while (integerValue > 0) {
         binary += (char) ('0' + (integerValue % 2));
         integerValue /= 2;
         }
      return binary;
    }

   public static String stringReverse(String inputString) {
      String result = "";
      for (int i = 0; i < inputString.length(); ++i) {
         result += inputString.charAt(inputString.length() - i - 1);
      }
      return result;
   }

   // Take input from the user
   public static void main(String[] args) {
      Scanner userWord = new Scanner(System.in);
      System.out.println(stringReverse(intToReverseBinary(userWord.nextInt())));
      userWord.close();
   }
}
//My first commit
