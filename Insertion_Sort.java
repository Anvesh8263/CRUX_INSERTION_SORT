public class Insertion_Sort1 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,8,9,4};
        // Insert_Last_Element(arr,arr.length-1);
        sort(arr);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void sort(int [] arr) {
        for(int i =1;i<arr.length;i++){
            Insert_Last_Element(arr,i);
        }
    }
    public static void Insert_Last_Element(int [] arr , int i) {
        int v = arr[i];
        int j = i-1;
        while(j>=0 && arr[j]>v){
            arr[j+1]=arr[j];
            arr[j]=v;
            j--;
        }
        //index number last element j+1
        
    }
}
