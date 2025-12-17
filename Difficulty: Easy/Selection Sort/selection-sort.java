class Solution {
    void selectionSort(int[] arr) {
        // code here
        for(int i = 0; i<arr.length; i++){
            int minInd = i;
            for(int j = i; j<arr.length; j++){
                if(arr[j] < arr[minInd])
                    minInd = j;
            }
            int temp = arr[i];
            arr[i] = arr[minInd];
            arr[minInd] = temp;
        }
    }
}