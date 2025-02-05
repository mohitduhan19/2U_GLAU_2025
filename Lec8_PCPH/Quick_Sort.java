package U.Lec8_PCPH;

public class Quick_Sort {
    public static void swap(int[]arr ,int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int part(int[] arr , int pivot , int l , int h){
        int i = l , j = l;

        while(i <= h){
            if(arr[i] <= pivot){
                swap(arr , i , j);
                i++;
                j++;
            }else{
                i++;
            }
        }
        return j-1;
    }
    public static void quicksort(int[] arr , int l , int h){
        if(l >= h)return;

        int pivot = arr[h];
        int pivot_idx = part(arr , pivot , l , h);
        quicksort(arr , l , pivot_idx-1);
        quicksort(arr , pivot_idx+1 , h);
    }
    public static void main(String[] args) {
        int[] arr = {8,5,2,3,4,1,6};
        quicksort(arr , 0 , arr.length-1);
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
