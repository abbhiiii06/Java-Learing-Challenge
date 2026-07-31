public class Operators{
    public static void main(String[]args){

        //learning about operators in java

        int a=10; //here is the varriable that specifies the value of a

        int b=5; //here is the varriable that specifies the value of b

        //Arithmetic Operators

        System.out.println("Addition: "+(a+b)); //Addition Operator

        System.out.println("Subtraction: "+(a-b)); //Subtraction Operator

        System.out.println("Multiplication: "+(a*b)); //Multiplication Operator

        System.out.println("Division: "+(a/b)); //Division Operator

        System.out.println("Modulus: "+(a%b)); //Modulus Operator

        //Relational Operators

        System.out.println("Equal to: "+(a==b)); //Equal to Operator

        System.out.println("Not Equal to: "+(a!=b)); //Not Equal to Operator

        System.out.println("Greater than: "+(a>b)); //Greater than Operator

        System.out.println("Less than: "+(a<b)); //Less than Operator

        System.out.println("Greater than or Equal to: "+(a>=b)); //Greater than or Equal to Operator

        System.out.println("Less than or Equal to: "+(a<=b)); //Less than or Equal to Operator
         //assignment Operators
        a+=b; //Addition Assignment Operator
        System.out.println("Value of a after addition assignment: "+a);
        a-=b; //Subtraction Assignment Operator
        System.out.println("Value of a after subtraction assignment: "+a);
        a*=b; //Multiplication Assignment Operator
        System.out.println("Value of a after multiplication assignment: "+a);
        a/=b; //Division Assignment Operator
        System.out.println("Value of a after division assignment: "+a);
        a%=b; //Modulus Assignment Operator
        System.out.println("Value of a after modulus assignment: "+a);
        //unary Operators
        a++; //Increment Operator
        System.out.println("Value of a after increment: "+a);
        a--; //Decrement Operator
        System.out.println("Value of a after decrement: "+a);

        //Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("Logical AND: "+(x&&y));
        System.out.println("Logical OR: "+(x||y));
        System.out.println("Logical NOT: "+(!x));
        //Bitwise Operators
        System.out.println("Bitwise AND: "+(a&b));
        System.out.println("Bitwise OR: "+(a|b));
        System.out.println("Bitwise XOR: "+(a^b));
        //ternary Operator
        int c = (a > b) ? a : b;
        System.out.println("Ternary Operator: "+c);
    }

}