package com.bms.mca.basics;
public class Exceptions {
    public static void main(String[] args) {
        int i,j,k=0;
        i = 10;
        j = 2;
        try {
            k = i / j;
            int[] arr = {1,2,3};
            System.out.println(arr[5]);
        }catch (ArithmeticException e){
            System.out.println("Error");
            e.printStackTrace(); // Detailed view
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index");
        }
        finally {
            System.out.println("End of execution. Thank You");
        }
        System.out.println("The value of k is: " + k);
    }
}
