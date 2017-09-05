import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    try (Scanner in = new Scanner(System.in)) {
      int n = in.nextInt();
      int result = 0;
      for(int ar_i = 0; ar_i < n; ar_i++){
        result += in.nextInt();
      }
      System.out.println(result);
    }
  }
}
