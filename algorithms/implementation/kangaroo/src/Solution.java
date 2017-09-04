import java.util.Scanner;

public class Solution {

    private static String kangaroo(int x1, int v1, int x2, int v2) {

        String result;
        if ((x2 > x1) && (v2 >= v1)) {
            result = "NO";
        }
        else {
            while (x2 > x1) {
                x1 += v1;
                x2 += v2;
            }

            result = (x2 == x1) ? "YES" : "NO";
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
