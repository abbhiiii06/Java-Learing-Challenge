import java.util.Scanner;
public class Example2{
    public static void main(String[] args) {
    Scanner SC=new Scanner(System.in);
    System.out.println("Enter your temperature:");
    int temperature=SC.nextInt();
    String SystemAlert;
        SystemAlert = (temperature>100) ? "Critical":
                (temperature<100 && temperature>75) ? "Warning":
                (temperature<75 && temperature >15) ?"Normal":
                (temperature<15) ? "FREZZING":
                "Enter correcttemperature";
    System.out.println(SystemAlert);
    }
}