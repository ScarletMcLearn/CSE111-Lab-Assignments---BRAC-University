import java.util.Scanner;

public class task09 {
  
   public static String toUpperCase(String inputString) {
       String result = "";
       for (int i = 0; i < inputString.length(); i++) {
           char currentChar = inputString.charAt(i);
           char currentCharToLowerCase = Character.toLowerCase(currentChar);
           result = result + currentCharToLowerCase;
       }
       return result;
   }
   
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter an input String: ");
       String inputString = scanner.nextLine();
       System.out.println("Upper Case: " + toUpperCase(inputString));
       
   }
}