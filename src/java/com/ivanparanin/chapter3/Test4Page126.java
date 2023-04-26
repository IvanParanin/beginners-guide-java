package chapter3;

public class Test4Page126 {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch, ignore;
        int read, count = 0; // TODO

        System.out.println("Введите строчную или прописную букву: ");
        do {

            System.out.println();
            read = System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
            if (read >= 97 & read <= 122) {
                    read -= 32;
                    ch = (char) read;
                    System.out.println(ch);
                    count++;
                } else if (read >= 65 & read <= 90) {
                    read += 32;
                    ch = (char) read;
                    System.out.println(ch);
                    count++;
                } else if(read == '.'){
                    System.out.println("Stop");
                }
           // while (count > 0) { // TODO
                //int i = 0;  // TODO
                //i += count; // TODO
               // count++; // TODO
                System.out.println(count); // TODO
           // }

        }while (read != '.') ;
    }
}

