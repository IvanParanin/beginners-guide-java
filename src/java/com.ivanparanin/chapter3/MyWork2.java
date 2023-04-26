package chapter3;

public class MyWork2 {
    public static void main(String[] args)
            throws java.io.IOException {
        char choice, ignore;
       // for (; ; ) {
            do {
                System.out.println("\tЗдравствуйте!\nВас приветствует автомойка Aqua");
                System.out.println("Главное меню.");
                System.out.println("1.Выберите тип кузова:");
                System.out.println("Выход - q");
                choice = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
                if (choice == 'q') break;
                System.out.println('\n');
                do {
                    System.out.println("1.Легковой автомобиль.");
                    System.out.println("2.Минивен.");
                    System.out.println("3.Джип.");
                    System.out.println("Выход в главное меню - a");
                    choice = (char) System.in.read();
                    do {
                        if (choice == '1') {
                            System.out.println("Вы выбрали легковой автомобиль.");
                            System.out.println("Выберите фунцию мойки: ");
                            do {
                                System.out.println("1.Мойка кузова.");
                                System.out.println("2.Мойка салона.");
                                System.out.println("3.Полная мойка авто.");
                                System.out.println("Назад - b");
                                choice = (char) System.in.read();
                            } while (choice != '1' & choice != '2' & choice != '3');
                            switch (choice) {
                                case '1':
                                    System.out.println("Требуемое время 15 минут");
                                    System.out.println("Мойка кузова легкового автомобиля будет стоить 300 сомов");
                                    break;
                                case '2':
                                    System.out.println("Требуемое время 20 минут");
                                    System.out.println("Мойка салона легкового автомобиля будет стоить 350 сомов");
                                    break;
                                case '3':
                                    System.out.println("Требуемое время 15 минут");
                                    System.out.println("Полная мойка легкового автомобиля будет стоить 700 сомов");
                                    break;
                            }
                        }
                        else if (choice == '2') {
                            System.out.println("Вы выбрали минивен.");
                            System.out.println("Выберите фунцию мойки: ");
                            do {
                                System.out.println("1.Мойка кузова.");
                                System.out.println("2.Мойка салона.");
                                System.out.println("3.Полная мойка авто.");
                                System.out.println("Назад - b");
                                choice = (char) System.in.read();
                            } while (choice < '1' | choice > '3' & choice != 'b');
                            switch (choice) {
                                case '1':
                                    System.out.println("Требуемое время 15 минут");
                                    System.out.println("Мойка кузова минивена будет стоить 400 сомов");
                                    break;
                                case '2':
                                    System.out.println("Требуемое время 20 минут");
                                    System.out.println("Мойка салона минивена будет стоить 450 сомов");
                                    break;
                                case '3':
                                    System.out.println("Требуемое время 15 минут");
                                    System.out.println("Полная мойка минивена будет стоить 800 сомов");
                                    break;
                            }
                        }
                        else if (choice == '3') {
                            System.out.println("Вы выбрали джип.");
                            System.out.println("Выберите фунцию мойки: ");
                            do {
                                System.out.println("1.Мойка кузова.");
                                System.out.println("2.Мойка салона.");
                                System.out.println("3.Полная мойка авто.");
                                System.out.println("Назад - b");
                                choice = (char) System.in.read();
                            } while (choice < '1' | choice > '3' & choice != 'b');
                            switch (choice) {
                                case '1':
                                    System.out.println("Требуемое время 15 минут");
                                    System.out.println("Мойка кузова джипа будет стоить 500 сомов");
                                    break;
                                case '2':
                                    System.out.println("Требуемое время 20 минут");
                                    System.out.println("Мойка салона джипа будет стоить 550 сомов");
                                    break;
                                case '3':
                                    System.out.println("Требуемое время 15 минут");
                                    System.out.println("Полная мойка джипа будет стоить 1000 сомов");
                                    break;
                            }
                        }
                        if (choice == 'a')
                            System.out.println("Выход в главное меню - a");
                            choice = (char) System.in.read();

                    } while (choice < '1' | choice > '3' & choice != 'a');
                } while (choice != '1' & choice != 'q');
            }while (choice < '1' | choice > '3' & choice != 'a') ;
        }
    }
//}


