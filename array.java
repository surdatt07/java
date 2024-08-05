// public class array {
//     //Arrays are the list of same type .
//     // The syntax of the array is 
//     // type[]arrayName =new type[size];
//     public static void main1(String[] args) {
//         int[] marks = new int[3];// here we have wrote the syntax of the array and decribed the size of the array.
//         marks[0] =99;// stored marks of a physics.
//         marks[1] =98;//stored marks of a chemistry.
//         marks[2] =97;//stored marks of maths.
//         System.out.println(marks[0]);//to know the marks of subject physics
//         System.out.println(marks[1]);
//         System.out.println(marks[2]);
//         

        
//     }

    
// }

// if there are 100 subject how we print? then use the looping

// public class array{
//     public static void main(String[] args) {
//         int marks[] = {55,56,54,53};//we can define the array like this also
//         for(int i=0;i<4;i++){
//             System.out.println(marks[i]);
//         }

//     }

// }


// when we crete a array then what happens in memory?
// as we created the array of the int datatype the one subject marks are stored in 4bytes because the size of int datatype is 4 bytes

// import java.util.*;

// public class array{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int numbers[] = new int[size];

//         for(int i =0; i<size; i++){
//             numbers[i]= sc.nextInt();
//         }
         

//         for(int i= 0; i<6; i++)
//         System.out.println(numbers[i]);
//     }
// }
//the output of this will be zeros like if we give 6 as the input for this then it will print 6 zeros because of we took the integer
//if we have taken the float datatype then it will be printed six 0.0 as the output

import java.util.*;

public class array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for(int i =0; i<size; i++){
            numbers[i]= sc.nextInt();
        }

        int x = sc.nextInt();

    for(int i= 0; i<numbers.length; i++){
        if(numbers[i]== x){
            System.out.println(" x found at index : +i");
        }

    }
        
  }
}


