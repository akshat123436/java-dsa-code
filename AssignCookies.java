import java.util.Arrays;
import java.util.PriorityQueue;

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        PriorityQueue <Integer> pq = new PriorityQueue<>();

        for (int j : g) {
            pq.add(j);
        }
        int ans = 0;
        Arrays.sort(s);
        for(int a : s){
            if(!pq.isEmpty() && pq.peek() <= a){
                ans++;
                pq.remove();
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] g = new int[]{1,2};
        int [] s = new int[]{1,2,3};
        AssignCookies obj = new AssignCookies();

        System.out.println(obj.findContentChildren(g,s));
    }
}
