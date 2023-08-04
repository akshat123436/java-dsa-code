import java.util.Scanner;

class NaturalSum {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, n;
        System.out.print("Enter the number till which sum is needed : ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);

    }
}