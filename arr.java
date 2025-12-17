public class arr {
  public static void main(String[] args) {
    int[] arr = new int[60];
    for (int i=0 ;i<60 ;i++){
        arr[i] = 3 * (i + 1);
    }
      for (int i=0; i<60; i++)  {
        System.out.print(arr[i] + " ");
      }
  }  
}
