// public class invertedhalfpyramid {
//     public static void main(String[] args) {
//       for(int i = 4;  i  >= 1; i--){
//         for(int j =1; j <=i; j++ ){
//             System.out.print("*");
//         }
//         System.out.println();
//       }
//     }
// }

import java.util.*;

public class invertedhalfpyramid   {
   public static void main(String args[]) {
       int n = 4;


       for(int i=0; i<=n; i++) {
           //spaces
           for(int j=1; j<=n-i; j++) {
               System.out.print(" ");
           }


           //numbers
           for(int j=1; j<=i; j++) {
               System.out.print(" ");
           }
           System.out.println();
       }
   }   
}


