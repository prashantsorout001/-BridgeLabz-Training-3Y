import java.util.Arrays;

public class traspose {
    public static void main(String[] args) {
        int[][] nums = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums[0].length;j++){
                int temp = nums[i][j];
                nums[i][j] = nums[j][i];
                nums[j][i] = temp;
            }
        }

        System.out.println(Arrays.deepToString(nums));
    }
}
