package chapter3;

public class MyWork {
    public static void main(String[] args)
            throws java.io.IOException {
        char choice, ignore;
        for (; ; ) {

            do {
                System.out.println("Добрый день!\nВыберите операцию.");
                System.out.println("1.Проверить баланс карты.");
                System.out.println("2.Перевести на другой счет.");
                System.out.println("3.Снять наличные.");
                System.out.println("4.Сменить пароль карты.");
                System.out.println("q.Выйти.");

                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');

            } while (choice < '1' | choice > '4' & choice != 'q');

            if (choice == 'q') break;
            System.out.println('\n');

            switch (choice) {
                case '1':
                    System.out.println("Остаток на вашей карте\n\t10000 рублей.");
                    break;
                case '2':
                    System.out.println("Услуга перевода в данный момент недоступна.\nПросим прощение за технические неполадки.");
                    break;
                case '3':
                    System.out.println("Привышен лимит снятие по вашей карте в сутки.");
                    break;
                case '4':
                    System.out.println("Для смены пароля подтвердите старый пароль.");
                    break;
            }
            System.out.println();
        }
    }
}

