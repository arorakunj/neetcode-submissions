class Solution {
    public int[] replaceElements(int[] arr) {
        int biggestElement = arr[arr.length - 1];

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < biggestElement) {
                arr[i] = biggestElement;
            } else if (arr[i] > biggestElement) {
                int temp = arr[i];
                arr[i] = biggestElement;
                biggestElement = temp;
            }
        }

        arr[arr.length - 1] = -1;

        return arr;
    }
}