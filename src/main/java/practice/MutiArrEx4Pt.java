package practice;

import java.util.Scanner;

public class MutiArrEx4Pt {
    public static void main(String[] args) {
        String[][] words = {
                {"chair", "의자"}
                , {"computer", "컴퓨터"}
                , {"integer", "정수"}
                , {"double", "실수"}
        };
        /*
        Q1. chair의 뜻은? >> dmlwk
            틀렸습니다. 정답은 의자입니다.

        Q2. computer의 뜻은? >> zjavbxj
           틀렸습니다. 정답은 컴퓨터입니다.

        Q3. inter의 뜻은? >> 정주
           틀렸습니다. 정답은 정수입니다.
         */

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < words.length; i++) {
            System.out.printf("Q%d. %s의 뜻은? >> ", i + 1, words[i][0]);
            String answer = scanner.next();
            if (answer.equals(words[i][1])) {
                System.out.println("정답");
            } else {
                System.out.printf("오답. %s입니다.\n", words[i][1]);
            }
        }
        System.out.println("끝");
    }
}
