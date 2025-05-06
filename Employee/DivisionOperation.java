package Employee;

public class DivisionOperation {
    public static void main(String[]args){
        int a=10;
        int b=0;
        try{
            int div = a/b;
            System.out.println("Division :"+div);
        }
        catch(ArithmeticException e){
            System.out.println("Erroer: Cannot divide by zero.");
        }
    }
}
