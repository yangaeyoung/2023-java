package practice;


public class GugudanTestPt {
    public static void main(String[] args) {
        GugudanPt gugudan = new GugudanPt();
        gugudan.print(4);


        gugudan.printFromTo(4, 7);//4~7단 출력
        System.out.println("----------");
        gugudan.printFromTo(3, 4);
        System.out.println("----------");

        gugudan.printFromTo(1, 3, "-----");
    }
}
