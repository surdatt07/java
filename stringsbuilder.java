// Firstly we know that strings are immutable so that is why we cannot delete or add something in the string . so there is string builder concept by using it we can add or delete some things from the strings
// 
import java.util.*;

public class stringsbuilder {
    public static void main(String[] args) {
        //stringbuilder declaration
        StringBuilder sb = new StringBuilder("Surdatt");//here we defined the string first and we can make changes from it
        System.out.println(sb);  
        
        // // charAt index 0
        // System.out.println(sb.charAt(1));

        // //set char at index 0
        // sb.setCharAt(0 ,'G');  // here we made changes and now we have to print
        // System.out.println(sb);

        // //insert
        // sb.insert(0 , 'S');
        // System.out.println(sb);

        //delete
        // sb.delete(2,3);
        // System.out.println(sb);

        //append means to join the things ar the end

        sb.append("h");
        sb.append("e");
        sb.append("r");
        sb.append("o");
        System.out.println(sb);

        }
    


}
