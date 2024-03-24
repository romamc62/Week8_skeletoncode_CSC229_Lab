/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {
    
    public static long getSumOfPrimes(int n){
        long sum = 0;

        boolean isPrime = true;
        for (int i = 2; i <= n; i++) {
            isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += i;
            }
        }

        return sum;
    }
    //          Analyze its space and time
    //Time is O(N sqrt n), space is O(1)
    public static void main(String[] args) {
        int n = 20;

        long sum = getSumOfPrimes(n);

        System.out.println("Sum of numbers between 1 and " + n + ": " + sum);

    }
}
