package chapter6;

/*public class ErrorMsg {
    String[] msgs = {
            "Ошибка вывода",
            "Ошибка ввода",
            "Отсутствует место на диске",
            "Выход индекса за границы диапазона"
    };
    String getErrorMsg(int i) { // возврат объекта String
         if(i >= 0 & i < msgs.length)
             return msgs[i];
         else
             return "Несуществующий код ошибки";
    }
}
class ErrMsg {
    public static void main(String[] args) {
        ErrorMsg err = new ErrorMsg();
        System.out.println(err.getErrorMsg(2));
        System.out.println(err.getErrorMsg(19));
    }
}
 */
class Err {
    String msg; // сообщение об ошибке
    int severity; // уровень серьезности ошибки
    Err(String m, int s) {
        msg = m;
        severity = s;
    }
}
class ErrorInfo {
    String[] msgs = {
            "Ошибка вывода",
            "Ошибка ввода",
            "Отстутствует место на диске",
            "Выход индекса за границы диапазона"
    };
    int[] howbad = {3, 3, 2, 4};
    Err getErrorInfo(int i) { // Возврат объекта Err
         if(i >= 0 & i < msgs.length)
             return new Err(msgs[i], howbad[i]);
         else
             return new Err("Несуществующий код ошибки", 0);
    }
}

class ErrInfo {
    public static void main(String[] args) {
        ErrorInfo err = new ErrorInfo();
        Err e;
        e = err.getErrorInfo(2);
        System.out.println(e.msg + " уровень: " + e.severity);
        e = err.getErrorInfo(19);
        System.out.println(e.msg + " уровень: " + e.severity);
    }
}