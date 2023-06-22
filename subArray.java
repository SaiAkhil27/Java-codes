import java.util.*;

import javax.sound.sampled.SourceDataLine;

public class subArray {

  public static void pairsAr(int num[]) {

    int ts = 0;

    for (int i = 0; i < num.length; i++) {
      int start = i;
      int sum = 0;
      for (int j = i; j < num.length; j++) {
        int end = j;
        sum = sum + num[j];
        for (int k = start; k <= end; k++) {
          System.out.print(num[k] + " ");// just to print subArray

        }
        ts++;
        System.out.println();
        System.out.println(" the sum of following is : " + sum);
      }
      System.out.println();

    }
    System.out.println("Total number of sbarrays are" + ts);

  }

  public static void main(String[] args) {
    int num[] = { 1, 5, 7, 9, 6, 4 };
    pairsAr(num);
  }
}
