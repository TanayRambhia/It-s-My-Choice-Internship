import java.util.*;
class Reverse
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);

    String originalStr;

    System.out.println("Enter A String:");
    originalStr = sc.nextLine();

    String reversedStr = "";
    System.out.println("Original string: " + originalStr);
        
    for (int i = 0; i < originalStr.length(); i++) 
    {
      reversedStr = originalStr.charAt(i) + reversedStr;
    }
    
    System.out.println("Reversed string: "+ reversedStr);
  }
}

