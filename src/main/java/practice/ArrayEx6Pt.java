package practice;

public class ArrayEx6Pt {
    public static void main(String[] args) {
        int[] score = {79, 88, 91, 33, 100, 55, 95};

        //score안에서 min값과 max값을 찾아서 출력해
        int max = score[0];
        int min = score[0];

        for (int i=1; i<score.length; i++) {
            if (max < score[i]) {
                max = score[i];
            }
            if (min > score[i]) {
                min = score[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
