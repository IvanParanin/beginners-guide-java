package chapter5;

class NotDemo {
    public static void main(String args[]) {
        byte b = -34;

        for (int t = 128; t > 0; t = t / 2) {
            if ((b & t) != 0) System.out.print("1 ");
            else System.out.print("O ");
            System.out.println();
            // Обратить состояние всех битов
            b = (byte) ~ b;
            for (int i = 128; t > 0; t = t / 2) {
                if ((b & t) != 0) System.out.print("1 ");
                else System.out.print("O ");
            }
        }
    }
}