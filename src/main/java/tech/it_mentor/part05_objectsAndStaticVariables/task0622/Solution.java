package tech.it_mentor.part05_objectsAndStaticVariables.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Числа по возрастанию
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.

Пример ввода:
3
2
15
6
17

Пример вывода:
2
3
6
15
17


Requirements:
1. Программа должна считывать 5 чисел с клавиатуры.
2. Программа должна выводить 5 чисел, каждое с новой строки.
3. Выведенные числа должны быть отсортированы по возрастанию.
4. Вывод должен содержать те же числа, что и были введены (порядок не важен).
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        final int size = 5;

        int[] src = new int[size]; // Использую сортировку пузырьком, т.к. в рамках текущей задачи асимптотика не важна
        for (int i = 0; i < size; i++) {
            System.out.printf("Введите элемент № '%d' из '%d'", i + 1, size);
            src[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (src[j] > src[i]) {
                    int tmp = src[i];
                    src[i] = src[j];
                    src[j] = tmp;
                }
            }
        }

        Arrays.stream(src).forEach(i -> System.out.println(i + " "));
    }
}
