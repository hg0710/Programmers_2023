// import java.util.*;
// class Solution {
//     public int[] solution(int[] array, int[][] commands) {
//         int[] answer = new int[commands.length];
        
//         for(int i =0 ; i<commands.length;i++){
//             int[] arr1 = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            
//             Arrays.sort(arr1);
            
//             answer[i] = arr1[commands[i][2] - 1];
//         } 
//         return answer;
//     }
// }
import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i =0 ; i<commands.length;i++){
            int[] arr1 = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            
            bubbleSort(arr1,arr1.length);
            
            answer[i] = arr1[commands[i][2] - 1];
        } 
        return answer;
    }
    private void bubbleSort(int[] arr, int size) {

        for (int i = 1; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }
    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}