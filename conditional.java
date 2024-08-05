// // // // import java.util.*;

// // // // public class conditional {
// // // //     public static void main(String[] args) {
// // // //         //take ip from the user and print adult if if age is greater than 18
// // // //         Scanner sc = new Scanner(System.in);
// // // //         System.out.println("Enter the age of a person");
// // // //         int age = sc.nextInt();

// // // //         if(age>18){
// // // //             System.out.println("The persom is adult");
// // // //         }else{
// // // //             System.out.println("The person is not adult");
// // // //         }
// // // //     }
    
// // // // }

// // import java.util.*;

// // public class conditional{
// //     //taking the ip from the user and chaking the given number is even or odd
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.println("Enter the number");
// //         int num = sc.nextInt();
// //         sc.close();

// //         if(num%2==0){
// //             System.out.println("The number is even");
// //         }else{
// //             System.out.println("The number is odd");
// //         }
    
// //     }
// // }


// // import java.util.*;

// // public class conditional{
// //      public static void main(String[] args){
// //         Scanner sc = new Scanner(System.in);
// //         int a = sc.nextInt();
// //          int b = sc.nextInt();
// //          sc.close();

// //         if( a==b){
// //             System.out.println("Equal");
// //         }else{
// //             if( a>b){
// //                 System.out.println("a is greater than b");
// //             }else{
// //                 System.out.println("a is lesser");
// //             }
// //         }

// //     }
// // }




// //the above cod can be written in a simple moden by using if else statements
//  // import java.util.*;
//  import java.util.*;

// public class conditional{
//      public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//          int b = sc.nextInt();
//          sc.close();

//         if( a==b){
//             System.out.println("Equal");
//         }else if(a>b){
//            System.out.println("a is greater than b");
//             }else{
//                 System.out.println("a is lesser");
//             }
//         }
// }



//Switch statements
//swich statements are used to reduce the code and write the code neatly

import java.util.*;

public class conditional{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        sc.close();

        switch(button){
            case 1 : System.out.print("Hello");
            break;
            case 2 : System.out.println("Namste");
            break;
            case 3 : System.out.println("bye");
            break ;
            default : System.out.println("Invalid buttons");
       }
    }
}