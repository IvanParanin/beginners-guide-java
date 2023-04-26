package chapter4;

public class Test4 {
    void start() {
        System.out.println("Введите строчную или прописную букву: ");
    }
    void choice(int r, char ch) {
        if (r >= 97 & r <= 122) {
            r -= 32;
            ch = (char) r;
            System.out.println(ch);
        } else if (r >= 65 & r <= 90) {
            r += 32;
            ch = (char) r;
            System.out.println(ch);
        } else if (r == '.') {
            System.out.println("Stop");
        }
    }
}

class TestStart {
        public static void main(String[] args)
                throws java.io.IOException {
            char ch = ' ', ignore;
            int read; // TODO
            Test4 test = new Test4();
            test.start();
            do {
                System.out.println();
                read = System.in.read();
                test.choice(read, ch);
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            }while (read != '.') ;
        }
    }
