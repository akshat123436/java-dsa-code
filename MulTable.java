import java.util.Scanner;

class MulTable{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to print table : ");
        int n = sc.nextInt();
        for(int i = 1;i<=10;i++){
            System.out.print(n);
            System.out.print(" x ");
            System.out.print(i);
            System.out.print(" = ");
            System.out.println(i * n);
        }
    }
}