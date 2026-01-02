public class StarTriangle5 {
   /**
     * Prints a right-aligned triangle of stars ('*') with 5 lines.
     * The first row contains 1 star, the second 2 stars, and so on. 
     */
//   public static void starTriangle5() {
//      String star = "*";
//      for(int i =0; i<5; i++){
//         for(int j = 5; j != i; j--){
//            System.out.print(" ");
//         }
//         System.out.println(star);
//         star += "*";
//      }
//   }

   /**
    * Prints a right-aligned triangle of stars ('*') with 5 lines.
    * The first row contains 1 star, the second 2 stars, and so on.
    */
   public static void starTriangle5() {
      int n = 5; // Total number of rows

      for (int i = 1; i <= n; i++) {
         // 1. Print the leading spaces
         for (int j = 1; j <= n - i; j++) {
            System.out.print(" ");
         }

         // 2. Print the stars
         for (int k = 1; k <= i; k++) {
            System.out.print("*");
         }

         // 3. Move to the next line
         System.out.println();
      }
   }
   
   public static void main(String[] args) {
      starTriangle5();
   }
}