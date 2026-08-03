import java.util.Scanner;
public class Example2{
    //Build an User Friendly  ATM Interface by Using Switch Case
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        int balance=10_000;
        System.out.println("====MENUU====");
        System.out.println("1)Check Balance");
        System.out.println("2)Deposit Money");
        System.out.println("3)Wuthdraw");
        System.out.println("4)Exit");
        System.out.println("Enter yout Option:");
        int Option=SC.nextInt();
        switch (Option){
            case 1 -> System.out.println("Current Balance:"+balance);
            case 2 -> {
                System.out.println("Enter Your Deposit Amount");
                int deposit=SC.nextInt();
                balance=balance+deposit;
                System.out.println("Your Amount deposit Succesfully:"+balance);
            }
            case 3 -> {
                System.out.print("Enter Withdraw Amount:");
                int withDraw=SC.nextInt();
                if(withDraw>balance){
                    System.out.println("Insufficient Funds");
                }else{
                balance=balance-withDraw;
                System.out.println("Current Balance:"+balance);
                }
            }
            case 4 -> System.out.println("Thankyou");
            default -> System.out.println("Invalid selection");

        }
    }
    
}