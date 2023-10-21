package org.example.Algoritmus.HW1;

public class Main {
    public static void main(String[] args) {

        int[] arr = { 1,1, 2, 2, 3, 3, 4, 5, 5, 6, 6, 7, 7, 8,8};
        int result = findSingleElement(arr);
        System.out.println("Искомый элемент через простой поиск: " + result);
        int result1 = findSingleElementBinary(arr);
        System.out.println("Искомый элемент через Бинарный поиск: " + result1);
    }

    public static int findSingleElement(int[] arr) {
        if(arr.length == 0){
            return -1;
        }
        if (arr.length == 1) {
            return arr[0];
        }
        for (int i = 1; i < arr.length; i += 2) {
                if (arr[i-1] != arr[i]) {
               return arr[i-1];
                }
        }
        return -2;///keine number
    }
/*
else if  (arr[i - 1] == arr[i]) {
               arr[i-1] +=2;
            }
 */
    //2*. через бинарный поиск
    public static int findSingleElementBinary(int[] arr) {
        if(arr.length == 0){
            return -1;
        }
        if (arr.length == 1) {
            return arr[0];
        }

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {  // int mid = 1+(10-1) /2
            int mid = left + (right - left) / 2; //     // для нечетн //Even чет ,not Even нечет int mid = (left + right)/2
            if (mid == 0 || mid == arr.length-1) {  // von -5 bis 5 mid =?
              return arr[mid]  ;
            }
            if (arr[mid]!= arr[mid-1] && arr[mid]!= arr[mid+1]) {
                    return arr[mid];
            } else if (arr[mid] == arr[mid-1]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}


