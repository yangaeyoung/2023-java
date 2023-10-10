package com.green.day9.ch5;

public class ArrayEx19 {
    public static void main(String[] args) {
        int[][] score = {
                // 국   영   수
                {101, 102, 103} //0 → 1
                , {21, 22, 23} //1 → 2
                , {31, 32, 33} //2 → 3
                , {41, 42, 43} //3 → 4
                , {51, 52, 53} //4 → 5
        };
        /*
        번호  국어  영어  수학  총점  평균
        -------------------------------
        1    101   102  103  306  102.0 \t
        ...
        5     51    52   53   ??   ??
        -------------------------------
        총점  ??    ??    ??  ??    ??
         */

        float avg = 0.0f;
        int[] sumArr = new int[score[0].length];
        System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
        System.out.println("------------------------------");
        for (int i = 0; i < score.length; i++) {
            System.out.printf("%d", i + 1);
            int sum = 0;
            for (int z = 0; z < score[i].length; z++) {
                sum += score[i][z];
                System.out.printf("\t%d", score[i][z]);
            }
            avg = (float) sum / score[i].length;
            System.out.printf("\t%d\t%.1f\n", sum, avg);

        }
        System.out.println("------------------------------");
        System.out.print("총점\t");

        for (int i = 0; i < score[i].length; i++) {
            int total =0;
            for (int z = 0; z < score.length; z++) {
               total += score[z][i];
            }
                System.out.printf("%d\t", total);
        }

    }

}


