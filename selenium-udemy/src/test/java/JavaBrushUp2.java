import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaBrushUp2 {
    public static void main(String[] args) {


        System.out.println();
        int[] arr2 = {1, 2, 4, 5, 6, 7, 8, 9, 10, 122};

        for (int j : arr2) {
            if (j % 2 == 0) {
                System.out.println(j);
                break;

            } else {
                System.out.println(j + "is not multiple of 2");
            }
        }
        ArrayList<String> a = new ArrayList<String>();
        a.add("traktor");
        a.add("vlecka");
        a.add("kuna");
        a.add("hnojivo");
        System.out.println(a.get(3));

        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
        System.out.println("**********");
        for (String val : a) {
            System.out.println(val);
        }

        //item is present in ArrayList
        System.out.println(a.contains("hnojivo"));
        String [] name = {"traktor", "vlecka", "hnojivo"};
        List <String> nameArraylist = Arrays.asList(name);
        nameArraylist.contains("hnojivo");
    }
}