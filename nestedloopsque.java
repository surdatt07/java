// //print the pattern of solid rectangle
// import java.util.*;

// public class nestedloopsque {
//     public static void main(String[] args) {
//         int n = 4;//we defined the 4 stars in vertical column
//         int m = 5;//we defined 5 stars in horizontal column
//          for(int i = 1; i<=n; i++) {  //this for vertical line of stars      rows is for outer loops 
//             for(int j = 1; j<=m; j++) { //this is for horizontal five stars rows
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
    
// }

// //the output of above question is 
// //*****
// // *****
// // *****
// // *****
import java.util.*;

public class nestedloopsque{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

        for(int i=1; i <=n; i++){
            for(int j = 1; j<=m; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

