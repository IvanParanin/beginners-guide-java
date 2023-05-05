package chapter13;

public class GenericMethodDemo {
    // Определить, совпадает ли содержимое двух массивов
    static <T extends Comparable<T>, V extends T> boolean
    arraysEqual(T[] x, V[] y) {
        // массивы, имеющие разную длину, не могут быть одинаковыми
        if(x.length != y.length) return false;
        for(int i = 0; i < y.length; i++)
            if(!x[i].equals(y[i]))
                return false; // массивы отличаются
        return true; // содержимое массивов совпадает
    }
    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5};
        Integer[] nums2 = {1, 2, 3, 4, 5};
        Integer[] nums3 = {1, 2, 3, 4, 5};
        Integer[] nums4 = {1, 2, 3, 4, 5, 6};
        if(arraysEqual(nums, nums))
            System.out.println("nums эквивалентен nums");
        if(arraysEqual(nums, nums2))
            System.out.println("nums эквивалентен nums2");
        if(arraysEqual(nums, nums3))
            System.out.println("nums эквивалентен nums3");
        if(arraysEqual(nums, nums4))
            System.out.println("nums эквивалентен nums4");
        // создать массив типа Double
        //Double[] dvals = {1.1, 2.2, 3.3, 4.4, 5.5};
        // следующая строка не будет скомплилирована,
        // так как типы массивов nums и dvals не совпадают
        //if(arraysEqual(nums, dvals))
           // System.out.println("nums эквивалентен dvals");
    }
}
