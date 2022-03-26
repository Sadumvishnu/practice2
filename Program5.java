import java.util.*;
public class Program5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            System.out.println("the num is");
             int num = sc.nextInt();
        int i=1 , fact=1;
        for(i=1; i<=num; i++){
            fact = fact*i;
        }
        System.out.println("factorial is" +fact );

    }
}