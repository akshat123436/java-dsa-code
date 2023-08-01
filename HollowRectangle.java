import java.util.Scanner;

class HollowRectangle {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");

        int n = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int m = sc.nextInt();

        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(j == 0 || j == n-1) System.out.print("*");
                else if(i == 0 || i == n-1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
