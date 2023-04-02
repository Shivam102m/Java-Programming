import java.util.*;
public class ABoot3 {
    static int sum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;      

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=sc.nextInt();
        int sum=sum(n);
        System.out.println("Sum of all integers from 1 to n is : "+n );
    }

}
