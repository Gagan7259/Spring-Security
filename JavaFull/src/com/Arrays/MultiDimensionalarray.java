package com.Arrays;

public class MultiDimensionalarray {
    public static void main(String[] args) {
        int[][] nums = new int[4][5];

        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = 0; j <= nums.length - 1; j++) {
                nums[i][j] = (int) (Math.random() * 100);
                System.out.println(nums[i][j]);
            }
        }

        System.out.println("**************************");

        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = 0; j <= nums.length - 1; j++) {

                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("*********************");

        for (int n[] : nums) {
            for (int m : n) {
                System.out.println(m + " ");
            }
            System.out.println();
        }
    }
}
