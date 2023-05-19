package chapter15;
import java.awt.*;
import java.applet.*;
/* applet code = "Banner" width = 300 height = 50>
  </applet>
 */
public class Banner extends Applet implements Runnable {
    String msg = " Java rules the Web ";
    Thread t;
    boolean stopFlag;
    // Инициализировать переменную t значением null
    public void init() {
        t = null;
    }
    // запустить поток
    public void start() {
        t = new Thread(this);
        stopFlag = false;
        t.start();
    }
    // точка входа в поток, выполняющий анимацию баннера
    public void run() {
        for( ; ; ) {
            try {
                repaint();
                Thread.sleep(250);
                if(stopFlag)
                    break;
        }catch (InterruptedException exc) {
            }
        }
    }
    // приостановить выполнение аплета
    public void stop() {
        stopFlag = true;
        t = null;
    }
    // отобразить баннер
    public void paint(Graphics g) {
        char ch;
        ch = msg.charAt(0);
        msg = msg.substring(1, msg.length());
        msg += ch;
        g.drawString(msg, 50, 30);
    }
}
