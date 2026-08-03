import java.util.Scanner;
public class Example1{
    //if else example1 vote eligible
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=SC.nextInt();
        if(age>=18){
            System.out.println("Your are eligible for vote");
        }else{
            System.out.println("Your not Eligible for vote");
        }
    }
}