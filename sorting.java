
import java.util.*;

public class Sorting{

    //bubble sort
    // public static void bubbleSort(int numbers[]){
    //     int n=numbers.length;

    //     for(int turn=0; turn<n-1; turn++){
    //         int swap=0;
    //         for(int j=0;j<n-turn-1;j++){
    //             if(numbers[j]>numbers[j+1]){
    //                 int temp=numbers[j];
    //                 numbers[j]=numbers[j+1];
    //                 numbers[j+1]=temp;
    //             }
    //             swap++;
    //         }
    //         System.out.println("Total swaps= "+ swap);
    //     }
        
    // }
    // public static void main(String[] args) {
    //     int numbers[]={5, 4, 2, 1, 3};
    //     System.out.println("The initial array was: ");
    //     for(int i=0;i<numbers.length;i++){
    //         System.out.print(numbers[i]+ " ");
    //     }
    //     System.out.println();
    //     System.out.println("The sorted array is: ");
    //     bubbleSort(numbers);
    //     for(int i=0;i<numbers.length;i++){
    //         System.out.print(numbers[i]+ " ");
    //     }
    // }

//selection sort

    // public static void selectionSort(int numbers[]){

    //     for(int i=0; i<numbers.length-1; i++){
    //         int minPos=i;
    //         for(int j=i+1; j<numbers.length; j++){
    //             if(numbers[minPos]>numbers[j]){
    //                 minPos=j;
    //             }
    //         }
    //         //swap
    //         int temp=numbers[minPos];
    //         numbers[minPos]=numbers[i];
    //         numbers[i]=temp;
    //     }
    // }
    // public static void main(String[] args) {
    //     int numbers[]={5, 3, 4, 2, 1};
    //     selectionSort(numbers);
    //     for(int i=0; i<numbers.length;i++){
    //         System.out.print(numbers[i] + " ");
    //     }
    // }

//insertion sort
    // public static void insertionSort(int arr[]){
    //     for(int i=1; i<arr.length; i++){
    //         int curr= arr[i];
    //         int prev=i-1;

    //         while(prev>=0 && arr[prev]>curr){
    //             arr[prev+1]=arr[prev];
    //             prev--;
    //         }
    //         arr[prev+1]=curr;
    //     }
    // }
    // public static void main(String[] args) {
    //     int arr[]={5, 4, 1, 2, 3};
    //     insertionSort(arr);
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i] + " ");
    //     }
    // }

//counting sort
    public static void countingSort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest=Math.max(largest, arr[i]);
        }

        int count[]= new int[largest+1];
        for(int i=0; i<arr.length;i++){
            count[arr[i]]++;
        }

        int j=0;
        for(int i=0; i<count.length;i++){
            while (count[i]>0) {
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={1, 4, 1, 3, 2, 4, 3, 7};
        countingSort(arr);
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
