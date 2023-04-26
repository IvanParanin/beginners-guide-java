package chapter2;

public class ModDemoPage73 {
    public static void main(String args[]) {
        int iresult, irem;
        double dresult, drem;

        iresult = 10 / 3;
        irem = 10 % 3;

        dresult = 10.0 / 3.0;
        drem = 10.0 % 3.0;

        System.out.println("Результат от деления 10 / 3: " + iresult + " " + irem);
        System.out.println("Рещультат от деления 10.0 / 3.0: " + dresult + " " + drem);
    }
}
