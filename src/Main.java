import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
//        Task 1 - String variables
//        String name ="Bala" ;
//        String firstName = "Kiruthika";
//        String lastName = "ganapathy";
//        System.out.println(firstName+" "+name+lastName);
        //Task 2 - Numbers
//        float num1,num2;
//        num1=10;
//        num2=3;
//        System.out.println(num1+num2);
//        float result = num1/num2;
//        System.out.println(result);
//        int num3 = 8;
//        System.out.println(num3++);
//        System.out.println(num3);
//        System.out.println(++num3);

        //Task 3 - User input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name:");
        String firstName= scanner.next();
        System.out.println("Enter last name:");
        String lastName= scanner.next();
        System.out.println("Welcome "+firstName+" "+lastName+" Happy to see you here!!");
    }
}


