package chapter3;

public class FindFacPage124__ {
    public static void main(String args[]) {

        for(int i = 2; i < 7; i++) {
            System.out.print("Делители " + i + ": ");
            for(int j = 2; j < i; j++)
                if((i % j) == 0) System.out.print(j + " ");
            System.out.println(); // TODO
        }
    }
}
// вложенные циклы для нахождения делителей числел от 2 до 100