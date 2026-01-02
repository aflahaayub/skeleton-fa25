public class DoubleUp {
   /**
     * Returns a new string where each character of the given string is repeated twice.
     * Example: doubleUp("hello") -> "hheelllloo"
     */
   public static String doubleUp(String s) {
      String newStr = "";
      for (int i = 0; i < s.length(); i++){
         String c = s.substring(i, i+1);
         newStr = newStr + c + c;
      }
      return newStr;
   }
   
   public static void main(String[] args) {
      String s = doubleUp("hello");
      System.out.println(s);
      
      System.out.println(doubleUp("cat"));
   }
}