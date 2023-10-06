import java.util.*;

public class ArrRotation {
  public static void ApproachTemp(int arr[], int k) {
    if (k == 0 || k % arr.length == 0) {
      return;
    }

    k = k % arr.length;
    int temp[] = new int[k];
    for (int i = 0; i < k; i++) {
      temp[i] = arr[i];
    }
    for (int i = 0; i < arr.length - k; i++) {
      arr[i] = arr[k + i];
    }
    int j = 0;
    for (int i = arr.length - k; i < arr.length; i++) {
      arr[i] = temp[j++];
    }
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5 };
    int k = 3;
    System.out.println(Arrays.toString(arr));
    ApproachTemp(arr, k);
    System.out.println(Arrays.toString(arr));

  }

}
