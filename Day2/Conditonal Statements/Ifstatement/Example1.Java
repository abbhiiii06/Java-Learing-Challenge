import java.util.Scanner;
public class main{
    //Example 1 of if statement check if a number is positive 
    public static void main(String[]args){
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter your Number:");
        int n=SC.nextInt();
        if(n>=1){
            System.out.println("its positive number");
        }

    }
}