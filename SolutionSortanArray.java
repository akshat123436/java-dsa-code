import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SolutionSortanArray {
    public static int f(int[] nums, int low, int high){
        int pivot = nums[low];
        int i = low;
        int j = high;

        while(i<j){
            while(nums[i] <= pivot && i < high) i++;
            while(nums[j] > pivot && j>0) j--;
            if(i<j && nums[i] > pivot && nums[j] <= pivot){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
                j--;
            }
        }
        int temp = nums[j];
        nums[j] = nums[low];
        nums[low] = temp;
        return j;
    }
    public static void quickSort(int [] nums, int low, int high){
        if(low < high){
            int pivotIndex = f(nums, low, high);
            quickSort(nums, low, pivotIndex-1);
            quickSort(nums, pivotIndex+1, high);
        }
    }
    public static void sortArray(int[] nums) {
        int low = 0;
        int high = nums.length;
        quickSort(nums, low, high-1);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i =0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        sortArray(nums);
        System.out.print(Arrays.toString(nums));
    }
}
