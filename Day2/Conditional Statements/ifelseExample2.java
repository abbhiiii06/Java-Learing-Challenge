import java.util.Scanner;
public class Example2{
    public static void main(String[]args){
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter your height in centemeters");
        int height=SC.nextInt();
        if(height>=160){
            System.out.println("Your Are physically fit");
        }else{
            System.out.println("Your are fit");

        }
    }

}