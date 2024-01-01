package org.example;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(3);
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(findIdx(arr, 8));
    }

    /**
     * Test
     * @param arr f
     * @param val f
     * @return f
     */
    public static int findIdx(int[] arr, int val) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == val) return i;
        }
        System.out.println("We did it lol");
        return -1;
    }
}