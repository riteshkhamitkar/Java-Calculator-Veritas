import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner ritesh = new Scanner(System.in);
        System.out.println("Enter numbers");
        
        double n1,n2,n3,n4,n5,n6;
        n1 = ritesh.nextInt();
        n2 = ritesh.nextInt();
        n3 = n1+n2;
        System.out.println("Sum is : "+n3);
        n4 = n1-n2;
        System.out.println("Sub is : "+n4);
        n5 = n1*n2;
        System.out.println("Multi is : "+n5);
        n6=n1/n2;
        System.out.println("division is : "+n6);
        
    }
}
