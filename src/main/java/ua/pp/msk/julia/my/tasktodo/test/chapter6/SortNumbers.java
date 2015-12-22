/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.pp.msk.julia.my.tasktodo.test.chapter6;

/**
 *
 * @author ynahorna
 */
public class SortNumbers {

    public static void sort(double[] nums) {

        for (int i = 0; i < nums.length; i++) {
            

            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                double tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {

        double[] nums = new double[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.random() * 100;
        }
        sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        System.out.println("Minimal value is :" + nums[0]);
    }
}
