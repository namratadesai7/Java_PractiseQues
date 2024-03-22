package array2;

import java.util.Scanner;

public class maxmin {
    //Find the maximum & minimum number in an array of integers. 
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int size= sc.nextInt();
            int number []= new int[size];

             //input
             for(int i=0; i<size; i++){
                number[i]=sc.nextInt();
            }    
            
            //output
            for(int i=0; i<size; i++){
                System.out.println("number " +(i+1)+" is "+ number[i]);
            }
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;

            for(int i=0; i<size; i++){
                if(number[i]< min){
                    min=number[i];
                }
                if(number[i]> max){
                    max=number[i];
                }
               
            }
            System.out.println("max is "+max);
            System.out.println("min is "+ min);
        }
    }
    }

