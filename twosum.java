import java.util.*;

public class twosum {
    public static int[] twoSumSimple(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int[] res = twoSumSimple(nums, target);
        if (res.length == 2) {
            System.out.println("Indices: " + Arrays.toString(res));
        } else {
            System.out.println("No two elements sum up to the target.");
        }
    }
}
