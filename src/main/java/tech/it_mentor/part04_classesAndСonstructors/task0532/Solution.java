package tech.it_mentor.part04_classesAndСonstructors.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам
Написать программу, которая:
1. считывает с консоли число N, которое должно быть больше 0
2. потом считывает N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.


Requirements:
1. Программа должна считывать числа с клавиатуры.
2. Программа должна выводить число на экран.
3. В классе должен быть метод public static void main.
4. Нельзя добавлять новые методы в класс Solution.
5. Программа должна выводить на экран максимальное из введенных N чисел.
6. Программа не должна ничего выводить на экран, если N меньше либо равно 0.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ведите N");
        int n = Integer.parseInt(reader.readLine());

        int max = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Введите число № " + i + " из " + n);
            int current = Integer.parseInt(reader.readLine());
            if (current > max) {
                max = current;
            }
        }

        if (n > 0) {
            System.out.println(max);
        }
    }
}
