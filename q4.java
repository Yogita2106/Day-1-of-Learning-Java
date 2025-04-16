//area of rectangle
import java.util.Scanner;
public class q4{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter length : ");
        int l=sc.nextInt();
        System.out.println("Enter width: ");
        int w=sc.nextInt();
        int area=l*w;
        System.out.println("Area is : "+ area);
    }
}