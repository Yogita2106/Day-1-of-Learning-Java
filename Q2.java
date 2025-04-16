import java.util.*;

public class Q2{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);


        //input the values

        System.out.println("To print int float double boolean(true/false) values.");
        System.out.println("Enter Integer value is:");
        int n1=input.nextInt();
        System.out.println("Enter Float value is:");
        Float n2=input.nextFloat();
        System.out.println("Enter Double value is:");
        Double n3=input.nextDouble();
        System.out.println("Enter Character:");
        String n4=input.next();
        System.out.println(" Enter Boolean value either true or false:");
        boolean n5=input.nextBoolean();
       
         //output th values

        System.out.println("\nThe output is:");
        System.out.println("Int is : "+ n1);
        System.out.println("Float is : "+ n2);
        System.out.println("Double is : "+ n3);
        System.out.println("Character is : "+ n4.charAt(0));
        System.out.println("Boolean is : "+ n5);
    } 
    
}
