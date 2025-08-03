public class JavaBrushUp3 {
    public static void main(String[] args) {
        // string vysvetlovacky

//        String s1 = "Osobitna skola testingu";
//        String s5 = "Ustav pro retardy";


        // new
        String s2 = new String("DoviDopo");
        String s3 = new String("DoviDopo");

        String s = "Osobitna skola testingu";
        String [] splittedString = s.split("skola");

        // vytlacenie prvej a druhej casti stringu s orezanou medzerou - metoda trim
        System.out.println(splittedString[0].trim());
        System.out.println(splittedString[1].trim());

        // vytlacenie stringu po hlaskach
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));

        }
        System.out.println("**********");

        // vytlacenie stringu po hlaskach ale odzadu lebo preco nie
        for (int i = s.length() -1; i>=0; i--) {
            System.out.println(s.charAt(i));
        }
    }
}