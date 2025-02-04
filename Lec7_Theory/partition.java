package U.Lec7_Theory;

public class partition {
    static void swap(int[] arr , int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void Partition(int arr[] , int pivot) {
       int i = 0 , j = 0;
       while(i < arr.length){
           if(arr[i] > pivot){
               i++;
           }else{
               swap(arr , i , j);
               i++;
               j++;
           }
       }
    }

    public static void main(String[] args) {
        int[] arr = {7,9,4,8,3,6,2,1};
        int pivot = 5;
        Partition(arr , pivot);
        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
