import java.util.Scanner;
public class Example2{
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter your Marks");
        int marks=SC.nextInt();
        if (marks>=75) {
            System.out.println("Your are Passed");
        }
    }
}