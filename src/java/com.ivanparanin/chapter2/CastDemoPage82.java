package chapter2;

/*public class CastDemoPage82 {
    public static void main(String args[]) {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;
        i = (int) (x / y); // в данном случае теряется дробная часть числа от double к int
        System.out.println("Целочисленный результат деления x / y: " + + i);

        i = 100;
        b = (byte) i; // информация не теряется/ тип byte может содержать значение 100
        System.out.println("Значение b: " + b);

        i = 257;
        b = (byte) i; // информация теряется/ byte не может содержать значение 251
        System.out.println("Значение b: " + b);

        b = 88;
        ch = (char) b; // представление символа X в коде ASCII
        System.out.println("ch: " + ch);
     }
}

 */




public class CastDemoPage82 {
    public static void main(String args[]) {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;
        i = (int) (x / y); // в данном случае теряется дробная часть числа от double к int
        System.out.println("Целочисленный результат деления x / y: " + + i);

        i = 100;
        b = (byte) i; // информация не теряется/ тип byte может содержать значение 100
        System.out.println("Значение b: " + b);

        i = 257;
        b = (byte) i; // информация теряется/ byte не может содержать значение 251
        System.out.println("Значение b: " + b);

        b = 88;
        ch = (char) b; // представление символа X в коде ASCII
        System.out.println("ch: " + ch);
    }
}
