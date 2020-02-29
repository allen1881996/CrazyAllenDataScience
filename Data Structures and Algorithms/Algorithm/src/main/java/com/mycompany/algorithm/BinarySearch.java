/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.algorithm;
import java.util.Scanner;
/**
 *
 * @author hkmac
 */
public class BinarySearch {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("How many numbers you want to sort: ");
        int n = s.nextInt();
        int i,number;
        int[] arr = new int[n];
        for(i = 0; i < n; i++){
            System.out.print("Please enter your number: ");
            number = s.nextInt();
            arr[i] = number;
        }

    }
    
    public static int binarySearch(int[] array,int value){
        int mid = 0,index = -1;
        while(array[mid] != value){
            if(array.length%2.0 == 0){
                mid = array.length/2;
            }
            else{
                mid = (array.length + 1)/2;
            }
            if(array[mid] == value){
                index = mid;
                break;
            }
            if(array[mid] > value){
                if(mid%2.0 == 0){
                    mid = mid/2;
                    continue;
                }
                else{
                    mid = (mid + 1)/2;
                    continue;
                }
            }
            if(array[mid] < value){
                if((array.length - mid)%2.0 == 0){
                    mid = (array.length - mid)/2;
                } 
                else{
                    mid = (array.length - mid + 1)/2;
                }
            }
        }       
        return index;
    }
    
}
