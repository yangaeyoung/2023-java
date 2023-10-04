package com.green.day4.ch4;

public class Abs {
    public static void main(String[] args) {
        int num = -10;
        //10는(은) 절대값 10
        //-9는(은) 절대값 9
        //-6는(은) 절대값 6

        if ( num < 0 ) {
            System.out.printf("%d는(은) 절대값 %d\n", num, -num);
        } else if ( num > 0 ) {
            System.out.printf("%d는(은) 절대값 %d\n", num, num);

        }
        }
    }
     class Abs2 {
        public static void main(String[] args) {
            int n = -10;
            int i = n < 0 ? -n : n;
            {
                System.out.printf("%d는(은) 절대값 %d\n", n, i);

                System.out.printf("%d는(은) 절대값 %d\n"
                        , n, n < 0 ? -n : n);
            }
        }
    }

