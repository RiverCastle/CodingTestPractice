public class Solution {
    public int[] changeArr(int[] arr) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                temp[i] = arr[i] / 2;
            } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                temp[i] = arr[i] * 2 + 1;
            } else {
                temp[i] = arr[i];
            }
        }
        return temp;
    }

    public boolean judge(int[] arr, int[] temp) { //같으면 true / 다르면 false
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != temp[i]) {
                return false;
            }
        }
        return true;
    }

    public int solution(int[] arr) {
        int answer = 0;
        int[] temp = changeArr(arr);


        while (!judge(arr, temp)) {
            /*
            System.out.printf("arr = ");
            System.out.println(Arrays.toString(arr));
            System.out.printf("temp = ");
            System.out.println(Arrays.toString(temp));
            System.out.println("answer = " + answer);
            */
            
            arr = temp;
            temp = changeArr(arr);
            answer += 1;
        }
        return answer;
    }
    /*
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 100, 99, 98};
        Solution181881 solution181881 = new Solution181881();
        System.out.println(solution181881.solution(arr));
    }
     */
}