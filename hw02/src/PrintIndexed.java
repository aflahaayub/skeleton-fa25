public class PrintIndexed {
   /**
     * Prints each character of a given string followed by the reverse of its index.
     * Example: printIndexed("hello") -> h4e3l2l1o0
     */
   public static void printIndexed(String s) {
      String newStr = "";
      for(int i = 0; i < s.length(); i++){
         newStr += s.substring(i,i+1);
         newStr += s.length()-(i+1);
      }
      System.out.println(newStr);
   }

   public static void main(String[] args) {
      printIndexed("hello");
      printIndexed("cat"); // should print c2a1t0
   }
}