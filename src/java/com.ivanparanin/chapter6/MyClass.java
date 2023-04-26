package chapter6;

 class MyClass {
     private int alpha;
     public int beta;
     int gamma;
     /* методы доступа к переменной alpha.
     Члена класса могут обращаться к закрытым членам того же класса
      */
     void setAlpha(int a) {
         alpha = a;
     }
     int getAlpha() {
         return alpha;
     }
}
class AccessDemo {
     public static void main(String[] args) {
         MyClass ob = new MyClass();
         /*доступ к переменной alpha возможен только с помощью
         специальное предназначенных для этой цели методов
          */
         ob.setAlpha(-99);
         System.out.println("ob.alpha: " + ob.getAlpha());
         /* обратиться к переменной alpha нельзя, это закрытая переменная
         ob.alpha = 10;
          */
         ob.beta = 88;
         ob.gamma = 99;
         System.out.println(ob.beta + " " + ob.gamma);
     }
}
