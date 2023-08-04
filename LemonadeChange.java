import java.util.ArrayList;
import java.util.Arrays;

public class LemonadeChange {
    public static boolean lemonadeChange(int[] bills) {
//        ArrayList[] store =  new ArrayList[21];
        ArrayList<Integer> store = new ArrayList<>(21);
        for(int i =0;i<bills.length;i++){
            store.set(bills[i], store.get(bills[i]) + 1);
            int val = bills[i];
            int j = bills[i];
            while(val !=0 && j>0){

            }
        }
        return true;
    }

    public static void main(String[] args) {
        int [] bills = new int[]{5, 5, 5, 10, 20};
        System.out.println(lemonadeChange(bills));
    }
}
