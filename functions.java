// import java.util.*;

// public class functions {
//     public static void printMyName(String name){                // yaha pe humne function ko declare kiya hai
//         System.out.println(name);
//         return;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String name = sc.next();

//         printMyName(name);          // yaha pe hum apne function ko call kr rahe hai

        
//     }
    
// }
//  //syntax of the function is 
//     // returnType functionName(type arg1,type arg2..){
//         //operation
//     //}

// make a function to add the sum of the two numbers
// import java.util.*;

// public class functions{
//     public static int calculateSum(int a , int b){
//         int sum = a + b;
//         return sum;
        
//     }
//         public static void main(String[] args) {
//             Scanner sc = new Scanner(System.in);
//             int a = sc.nextInt();
//             int b = sc.nextInt();
//             sc.close();

//             int sum = calculateSum(a, b);
//             System.out.println(sum);
        
//     }
// }


//make a function to multiply two numbers and return the product
// import java.util.*;

// public class functions{
//     public static int calculateProduct(int a , int b){
//       return a * b;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
        

       
//         System.out.println("product :"+calculateProduct(a, b));
        
//     }
// }


//  find a factorial of a number
import java.util.*;

public class functions{

    public static int printFactorial(int a){
        //loop
        int factorial = 1;
        for(int i =a; i>=1; i--){
            factorial = factorial * i;

        }

        System.out.println(factorial);
        return 1;

    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        printFactorial(a);


    }
        
}
