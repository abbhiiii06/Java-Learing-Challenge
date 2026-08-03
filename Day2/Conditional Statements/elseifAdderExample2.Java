import java.util.Scanner;
public class Example2{
    public static void main(String[]args){
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter your current Speed");
        int Speed=SC.nextInt();
        if(Speed>=80){
            System.out.println("Your going too fast");
        }else if(Speed>=60){
            System.out.println("Your going in moderate");
        }else{
            System.out.println("Your going slowly");
        }
    }
}