
//print the sum first n odd numbers.
import java.util.*;

public class question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the limit");
        int n = sc.nextInt();
        int sum = 0;
        for(int i =1; i<=n; i++){
            if(i%2 ==1)
            sum = sum +i;
        }
        System.out.println(+sum);

    }
    
}
