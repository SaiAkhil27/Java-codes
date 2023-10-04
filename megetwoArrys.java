public class megetwoArrys {

  public static int[] mergeTwoSortedArrays(int[] arr, int arr1[]){
    int[] res = new int[arr.length+arr1.length];
    int i = 0;
    int j = 0;
    int k = 0;

    while(i<arr.length&&j<arr1.length){
      if(arr[i]<arr1[j]){
        res[k]=arr[i];
        i++;
        k++;
      }else{
        res[k]=arr1[j];
        j++;
        k++;
      }
    }
    while(i<arr.length){
      res[k]=arr[i];
        i++;
        k++;
    }
    while(j<arr1.length){
      res[k]=arr1[j];
        j++;
        k++;
    }
  return res;
  }

  public static void main(String[] args) {

    int arr[] = { 2, 6, 4, 7, 9 };
    int arr1[] = { 1, 3, 5, 6, 8, 9 };

    System.out.println(mergeTwoSortedArrays(arr, arr1));
  }
}
