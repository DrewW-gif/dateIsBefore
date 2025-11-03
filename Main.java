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
      System.out.println(compareDate(6, 3, 9, 20));
      System.out.println(compareDate(10, 1, 2, 25));
      System.out.println(compareDate(8, 15, 8, 15));
      System.out.println(compareDate(8, 15, 8, 16));
   }
}