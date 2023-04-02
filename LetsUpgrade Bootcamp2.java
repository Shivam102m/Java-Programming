import java.util.*;
public class ABoot2 {
    static int sum(int x,int y){
        int z=x+y;
        return z;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter X: ");
        int x=sc.nextInt();
        System.out.print("Enter Y: ");
        int y=sc.nextInt();
        int z=sum(x,y);
        System.out.println("Sum of x + y is : "+z);
    }
}
