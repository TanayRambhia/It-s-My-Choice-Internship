public class SearchStringEmp{
   public static void main(String[] args) {
      String strOrig = "Hello readers, I am Tanay";
      int intIndex = strOrig.indexOf("Tanay");
      
      if(intIndex == - 1) {
         System.out.println("Tanay not found");
      } else {
         System.out.println("Found Tanay at index " + intIndex);
      }
   }
}
