// Bubble sort algorithm is known as the simplest sorting algorithm.

// In bubble sort algorithm, array is traversed from first element to last element. Here, current element is compared with the next element. If current element is greater than the next element, it is swapped.

// Int this we do n-1 comparisons and n is total no. of array elements
// Time compexity of theis sort is 0(n^2)



import java.util.*;

public class bubblesort {

    public static void printArray(int arr[]){
        for( int i =0 ; i<arr.length; i++){
            System.out.print(arr[i]+ " " );
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int arr[] = {7, 8, 3, 1, 2};   //delaclaring array which has to be sorted

        //this outer loops counts n-1 ittrations
        for(int i = 0; i < arr.length-1; i++){
            //here we did -i bcoz after first loop the one array element is sorted
            for(int j =0;  i <arr.length-i-1; j++ ){ 
                if(arr[j] > arr[j+1])   {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp ;
                }

            }

        }  

        printArray(arr);



        
    }
    
}


