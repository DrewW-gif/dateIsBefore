public class Main {
   public static boolean compareDate(int M, int D, int m, int d) {
      boolean before = false;
      if (M < m) {
      before = true;
      }
      else if ((M == m) && (D < d)) {
      before = true;
      }
      else {
      before = false;
      }
      return before;
      }
      public static void main(String[] args) {
      System.out.print(compareDate(2, 7, 6, 17));
   }
}