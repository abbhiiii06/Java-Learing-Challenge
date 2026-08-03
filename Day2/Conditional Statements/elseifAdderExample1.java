//if else adder example Biggest of three numbers
import java.util.Scanner;
public class Example1{
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter A's value:");
        int A=SC.nextInt();
        System.out.println("Enter B's Value");
        int B=SC.nextInt();
        System.out.println("Enter C's Value");
        int C=SC.nextInt();
        if(A>B && A>C){
            System.out.println("A is big");
        }else if(B>A && B>C){
            System.out.println("B is big");
        }
    
    }
}