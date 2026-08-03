import java.util.Scanner;
public class Example{
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        double orderTotal=SC.nextDouble();
        boolean isVip=SC.nextBoolean();
        double finalAmount=(isVip)? orderTotal/0.8:orderTotal/0.95;
        System.out.println("finalAmount");
    }

}