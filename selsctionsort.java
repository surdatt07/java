//Selection sort is a sorting algorithm that selects the smallest element from an unsorted list in each iteration and places that element at the beginning of the unsorted list

// Time comeplexity is 0(n^2)


public class selsctionsort {

    public static void printArray(int arr[]){
        for( int i =0 ; i<arr.length; i++){
            System.out.print(arr[i]+ " " );
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};

        //selction sort
        for(int i = 0; i< arr.length-1; i++){
            int smallest = i;
            for(int j= i+1 ; j< arr.length; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j ;
                }
            }
            int temp = arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        printArray(arr);

    }
    
}


