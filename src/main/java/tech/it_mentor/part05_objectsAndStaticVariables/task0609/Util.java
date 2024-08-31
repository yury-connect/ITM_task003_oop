package tech.it_mentor.part05_objectsAndStaticVariables.task0609;

/* 
Расстояние между двумя точками
Реализовать статический метод double getDistance(x1, y1, x2, y2). Он должен вычислять расстояние между точками.
Используй метод double Math.sqrt(double a), который вычисляет квадратный корень переданного параметра.


Requirements:
1. Метод getDistance должен возвращать double.
2. Метод getDistance должен быть статическим.
3. Метод getDistance должен быть public.
4. Метод getDistance должен возвращать расстояние между точками.
5. Метод getDistance должен использовать метод double Math.sqrt(double a).*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        int x = Math.abs(x1 - x2);
        int y = Math.abs(y1 - y2);
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)); // более простым методом:   Math.sqrt(x * x + y * y)
    }

    public static void main(String[] args) {
        System.out.println("Длинна должна получиться = 10.04987562112089");
        double result = getDistance(1, 20, 2, 30);
        System.out.println("Результат работы программы = " + result);
    }
}
