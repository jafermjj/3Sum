/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3sum;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author almuallimj
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] input = {-1, 0, 1, 2, -1, -4};
        Main m = new Main();
        m.threeSum(input);
        
    }
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> myList = new ArrayList<List<Integer>>();
        
        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length ;j++){
                for(int k = j; k<nums.length;k++){
                    if ( i != j && j != k && i != k && (nums[i] + nums[j] + nums[k] == 0)){
                        System.out.println(" i=" + i + " j=" + j + " k=" + k);
                    }
                }
            }
        }
        
        return myList;
    }
    
}
