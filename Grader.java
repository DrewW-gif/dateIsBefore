public class Grader {
   public static int grade(String userName, String shoeColor) {
   int score = 0;
   String vowels = "AEIOUaeiou";
   char lastChar  = userName.charAt(userName.length()-1);
   if (shoeColor == "white") {
   score = 0;
   }
   else if (vowels.indexOf(userName.substring(0, 1)) <= 1) {
   score += 50;
   }
   if ((lastChar < 105) || (shoeColor != "white")) {
   score += 3000;
   }
   return score;
   }
   public static void main(String[] args) {
   System.out.println(grade("EasyPeasy", "black"));
   System.out.println(grade("APeace", "white"));
   System.out.println(grade("WhirledPeas", "white"));
   System.out.println(grade("Oscar", "red"));
   System.out.println(grade("Amy", "white"));
   System.out.println(grade("Ben", "blue"));
   }
}