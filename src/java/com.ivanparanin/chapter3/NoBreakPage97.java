package chapter3;

public class NoBreakPage97 {
    public static void main(String args[]) {
        int i;

        for (i = 0; i <= 5; i++) {
            switch (i) {
                case 0:
                    System.out.println("i равно нулю");
                    //break;
                case 1:
                    System.out.println("i равно единице");
                    //break;
                case 2:
                    System.out.println("i равно двум");
                    //break;
                case 3:
                    System.out.println("i равно трем");
                    //break;
                case 4:
                    System.out.println("i равно четырем");
                    //break;
                    //default:
                    System.out.println("i меньше пяти");
            }
            System.out.println();
        }
    }
}
