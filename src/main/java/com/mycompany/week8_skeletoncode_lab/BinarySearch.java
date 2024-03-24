/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class BinarySearch {

    public static int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13};
        int key = 7;
        int low = 0;
        int high = sortedArray.length - 1;
        int index = runBinarySearchIteratively(sortedArray, key, low, high);
        if (index != Integer.MAX_VALUE) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    // provide time and space analysis
        //Time complexity is O(log n), Space is O(1)

}
