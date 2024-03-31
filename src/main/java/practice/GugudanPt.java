package practice;

public class GugudanPt {
    void print(int n) {
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d X %d = %s\n", n, i, n * i);
        }
    }

    void printFromTo(int n, int n1) {
        for (int i = 1; i <= n1; i++) {
            print(i);
        }
    }

    void printFromTo(int n, int n1, String str) {
        for (int i = 1; i <= n1; i++) {
            print(i);
            System.out.println(str);
        }
    }
}
