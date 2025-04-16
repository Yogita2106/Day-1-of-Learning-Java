import java.lang.*;
public class Q1{
    static int b=7;     // static variable
    int num=2;              // non-static variable
    public static void main(String[] args){
        System.out.println(b);
        Q1 obj=new Q1();
        System.out.println(obj.num);
    }
}
