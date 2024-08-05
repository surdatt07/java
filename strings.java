 //Strings is non primitive datatype.
 // In strings spaces are also valid characters
 //Strings are immutable no change are allowed if we want to do so then we have to make new string
 
// //  public class strings {
//     public static void main(String args[]){
//         String name ="Tony";
//         String fullname = "Tony Staark";
//         String sentence = "My name is Tony Stark";
//         System.out.println(fullname);

//     }

//  }




// import java.util.*;

// public class strings{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String name = sc.next();// if we use only next then it will print single word but if we use nextline tehn it will ptint entire line.
//         System.out.println("Your name is: " + name);
//     }
// }



//concatenation means to merge two strings

import java.util.*;

public class strings{
    public static void main(String[] args) {
        //concatenation
        // String name = "Surdatt";
        // String surname = "Nimbal";
        // String fullname = name + surname; // if we wanna have space is these name we have to do ""
        // System.out.println(fullname.length()); // we are using here .length() to know the length of the string
        

        // //charAt
        // for(int i =0; i<fullname.length();i++){
        //     System.out.println(fullname.charAt(i)); // charAt will print all teh letters of the fullname one by one
       
        
        //comapre   
        // String name1 ="Surdatt";
        // String name2 = "Surdatt";

        //s1 > s2 ; +ve value
        //s1== s2 ; 0
        //s1< s2 ; -ve value

        // if(name1.compareTo(name2)==0){
        //     System.out.println("Strings are equal");

        // }else{
        //     System.out.println("strings are not equal");
        // }
        String sentence =" My name is tony";
        String name =  sentence.substring(11 , sentence.length());
        System.out.println(name);

    
       }
   
    }







