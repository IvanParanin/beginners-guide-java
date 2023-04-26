package chapter5;

public class Encode {
    public static void main(String[] args) {
        String msg = "This is a best";
        String enmsg = "";
        String decmsg = "";
        int key = 88;

        System.out.print("Исходное сообщение: ");
        System.out.println(msg);

        // зашифровать сообщение
        for(int i = 0; i < msg.length(); i++);
            // построение зашифрованной строки сообщения
         //   enmsg = enmsg + (char) (msg.charAt(i) ^ key);
        System.out.print("Зашифрованное сообщение: ");
        System.out.println(enmsg);
        //дешифровать сообщение
        for(int i = 0; i < msg.length(); i++)
            // построение дешифрованной строки сообщения
            decmsg = decmsg + (char) (enmsg.charAt(i) ^ key);
        System.out.print("Дешифрованное сообщение: ");
        System.out.println(decmsg);
    }
}
