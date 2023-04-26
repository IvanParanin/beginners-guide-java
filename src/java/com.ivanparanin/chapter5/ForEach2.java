package chapter5;

public class ForEach2 {
    public static void main(String[] args) {
        int sum = 0;
        int[][] nums = new int[3][5];

        // ввести ряд значений в массив nums
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 5; j++)
                nums[i][j] = (i + 1) * (j + 1);

        //использовать расширенный цикла for для суммирования и отображения значений
        for(int x[]: nums) {
            for(int y: x) {
                System.out.println("Значение: " + y);
                sum += y;
            }
        }
        System.out.println("Сумма: " + sum);
    }
}
