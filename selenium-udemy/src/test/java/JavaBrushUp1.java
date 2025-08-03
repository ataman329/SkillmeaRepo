import java.util.ArrayList;

public class JavaBrushUp1 {
    public static void main(String[] args) {
        int myNum = 5;
        String website = "This is my string";
        char letter = 'r';
        double dec = 5.99;
        boolean myCard = true;

        System.out.println(myNum +" is the value stored in myNum variable");
        System.out.println(website);
        //Arrays
        int[] arr = new int[5]; // 5, 10
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 6;

        int[] arr2 = {1, 2, 4, 5, 6, 7, 8, 9, 10, 122};

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] % 2 == 0) {
                System.out.println(arr2[i]);
                break;
            } else
            {
                System.out.println(arr2[i] + "is not multiple of 2");
            }
        }

        ArrayList a = new ArrayList<>();

    }
}