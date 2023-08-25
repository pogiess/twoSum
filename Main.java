public class Main {
    public static void main(String[] args) {
        int[] arr = {3,5,4,5};
        int target = 9;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                if(arr[i] + arr[j] == target) {
                    System.out.println("[" + j + " , " + i + "]");
                }
            }
        }
    }
}