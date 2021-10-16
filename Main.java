import java.util.Arrays;

//Insertion sort
class Main {
  public static void main(String[] args) {

    int[] arr = {4,3,2,1};

    for(int j = 1; j<arr.length;j++){
      int key = arr[j];
      int i = j -1;
      while(i >= 0 && arr[i] > key){
        arr[i+1] = arr[i];
        i = i-1;
      }
      arr[i+1] = key;
    }
  System.out.println(Arrays.toString(arr));
  }
}
