import java.util.*;
class ABoot1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number :");
        int n=sc.nextInt();
        if(n>0){
            System.out.println("The number is positive.");
        }
        else{
            System.out.println("The number is negative.");
        }
    }
}
