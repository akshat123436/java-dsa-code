import java.util.Scanner;

class Sum{
    public static void main(String [] args){
        int a = 0, b = 0;
        System.out.print("Enter the two numbers to take sum : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.print("The sum is : ");
        System.out.print(a + b);
    }
}