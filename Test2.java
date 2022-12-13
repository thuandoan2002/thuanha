package controller.internship;

public class Test2 {
    public static void main(String[] args) {

        int[] checkArr = {1,2,3,4,5,69,9 ,9 ,9};
        System.out.println(checkNumberExit(checkArr,9));
    }

    public static int checkNumberExit(int[] arr, int numberToCheck){
        int count = 0;
        for (int element : arr) {
            if (numberToCheck == 9) {
                count++;
            }
        }
        return count;
    }
}
