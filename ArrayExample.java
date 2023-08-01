import java.util.Scanner;

class ArrayExample{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int x;
        System.out.print("Enter the number to search : ");
        x = sc.nextInt();
        int i = 0;
        for(;i<n;i++){
            if(arr[i] == x) break;
        }
        if(i!=n)
        System.out.print("The index of the number is : " + i);
        else System.out.println("The number doesn't exist in the array!");
    }
}