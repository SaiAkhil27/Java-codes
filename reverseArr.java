public class reverseArr {
  public static void main(String[] args) {
    int arr[] = { 1, 9, 8, 3, 5 };
    reverAr(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
    }
    System.out.println();
  }

  public static void reverAr(int arr[]) {
    int first = 0, last = arr.length - 1;
    while (first < last) {
      int temp = arr[last];
      arr[last] = arr[first];
      arr[first] = temp;

      first++;
      last--;

    }
  }

}
