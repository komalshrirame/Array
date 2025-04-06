package Array;

public class MultiDimensionalArray {

    public static void main(String[] args) {
        int nums[][] = new int[3][4];
        int random = 0; //math is class in java and random vale is in double less than 1
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int) (Math.random() * 100);
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        for (int n[]:nums)
        {
            for (int m:n)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}