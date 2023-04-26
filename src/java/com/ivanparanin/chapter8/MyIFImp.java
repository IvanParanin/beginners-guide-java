package chapter8;

 interface MyIF {
    // ообъявление "обычного" метода интерфейса, которое не включает
    // определение реализации по умолчанию
    int getUserID();
    // объявление метода по умолчанию, включающее его реализацию
    default int getAdminID() {
        return 1;
    }
}
public class MyIFImp implements MyIF{
    // реализации подлежит лишь метод getUserID()
    // интерфейса MyIF. Делать это для метода getAdminID() необязательно
    // поскольку при необходимости может быть использована его реализация,
    // заданная по умолчанию
    public int getUserID() {
        return 100;
    }
}
// использование интерфейсного метода по умолчанию
class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();
        // вызов метода getUserID() возможен, помкольку он явно не
        // реализован классом NyIFImp
        System.out.println("Идентификатор пользователя " + obj.getUserID());
        // вызов метода getAdminID() так же возможен, поскольку
        // предоставляется его реализация по умолчанию
        System.out.println("Идентификатор администратора " + obj.getAdminID());
    }
}
