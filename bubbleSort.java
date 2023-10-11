public class bubbleSort {

  public static void arr(int num[]) {
    for (int i = 0; i < num.length; i++) {
      System.out.print(num[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int num[] = { 8, 4, 6, 9, 3, 1 };
    // Time Complexity o(n^2);
    // bubbleSort
    for (int i = 0; i < num.length - 1; i++) {
      for (int j = 0; j < num.length - i - 1; j++) {
        if (num[j] > num[j + 1]) {
          int temp = num[j];
          num[j] = num[j + 1];
          num[j + 1] = temp;
        }
      }
    }
    arr(num);
  }
}