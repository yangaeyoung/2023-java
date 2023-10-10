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
        int[] s = new int[score[0].length];//배열로 국영수 자리 설정

        System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t");
        System.out.println("--------------------------------");
        for (int i = 0; i < score.length; i++) {//열의 for문
            System.out.printf("%d", i + 1); //번호 출력
            int sum = 0; // 1~5번의 각 총점을 구하기에 sum 초기화 시키기
            for (int z = 0; z < score[i].length; z++) {
                int val = score[i][z];
                s[z] += val; // 맨 밑의 총점을 구함
                sum += val; // 1~5 사람들의 총점
                System.out.printf("\t%d", val);
            }
            float avg = (float) sum / score[i].length;
            System.out.printf("\t%d\t%.1f\n", sum, avg);
        }
        System.out.println("-----------------------------");
        System.out.print("총점");
        for (int y : s) {
            System.out.printf("\t%d", y);
        }
        System.out.println();
    }
}

//        선생님
//        float avg = 0.0f;
//        int[] sumArr = new int[score[0].length];
//        System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
//        System.out.println("------------------------------");
//        for (int i = 0; i < score.length; i++) {
//            System.out.printf("%d", i + 1);
//            int sum = 0;
//            for (int z = 0; z < score[i].length; z++) {
//                sum += score[i][z];
//                System.out.printf("\t%d", score[i][z]);
//            }
//            avg = (float) sum / score[i].length;
//            System.out.printf("\t%d\t%.1f\n", sum, avg);
//
//        }
//        System.out.println("------------------------------");
//        System.out.print("총점\t");
//
//        for (int i = 0; i < score[i].length; i++) {
//            int total =0;
//            for (int z = 0; z < score.length; z++) {
//               total += score[z][i];
//            }
//                System.out.printf("%d\t", total);
//        }





