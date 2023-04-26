package chapter5;

public class ArrayDemo {
    public static void main(String[] args) {
        /*int[] sample = new int[10];
        int i;
        for(i = 0; i < 10; i += 1)
        sample[i] = i;
        for(i = 0; i < 10; i += 1)
            System.out.println("Элемент [" + i + "]: " + sample[i]);
    }
}

         */

        int[] nums = new int[67];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
            System.out.println("Элемент [" + i + "]: " + nums[i]);
        }
    }
}