// 2d arrays means two dimensional arrays. and it contains some rows and columns.
//the syantax of this aarays is :
//type[][]arrayName = new type[rows][columns];
//int[][]numbers =new int [3][5];
//in these arrays we are going to use the nested loops . in which the outer loops is for controlling the rows and the inner loops are used for controlling the columns


import java.util.*;

public class twodarrays{
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in); // we are making a scanner object
        int rows =sc.nextInt();         //we are taking rows and columns as a input
        int columns =sc.nextInt();

        int[][]numbers = new int[rows][columns]; //deeclared teh arrys

        //now we are using loops for input section
        //input
        //to control rows
        for(int i =0; i<rows; i++){
            //to control columns
            for(int j =0;j<columns; j++){
                numbers[i][j]= sc.nextInt();//we taking the numbers which are stored in the arrays

            }

        }

        //for output
        //control rows
        for(int i=0;i<rows; i++){
            //controls columns"
            for(int j=0;j<columns; j++){
                System.out.print(numbers[i][j] + " ");
            } 
            System.out.println();

        }

    }
}
