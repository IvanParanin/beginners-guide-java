package chapter16;
import javax.swing.*;
public class SwingDemo {
    SwingDemo() {
        // создать контейнер JFrame
        JFrame jfrm = new JFrame("A simple Swing Application");
        // установить начальные размеры фрейма
        jfrm.setSize(275, 100);
        // завершить работу программы, когда пользователь закрывает приложение
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // создать текстовую метку
        JLabel jlab = new JLabel(" Swing defines the modern Java GUI.");
        // добавить метку в панель содержимого
        jfrm.add(jlab);
        // отобразить фрейм
        jfrm.setVisible(true);
    }
    public static void main(String[] args) {
        // создать фрейм в потоке диспетчеризации событий
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingDemo();
            }
        });
    }
}
