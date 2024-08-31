package tech.it_mentor.part05_objectsAndStaticVariables.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
Задача: У каждой кошки есть имя и кошка-мама.
Создать класс, который бы описывал данную ситуацию.
Создать два объекта: кошку-дочь и кошку-маму.
Вывести их на экран.

Новая задача: У каждой кошки есть имя, кот-папа и кошка-мама.
Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку (папин папа), бабушку (мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
The cat's name is дедушка Вася, no mother, no father
The cat's name is бабушка Мурка, no mother, no father
The cat's name is папа Котофей, no mother, father is дедушка Вася
The cat's name is мама Василиса, mother is бабушка Мурка, no father
The cat's name is сын Мурчик, mother is мама Василиса, father is папа Котофей
The cat's name is дочь Пушинка, mother is мама Василиса, father is папа Котофей


Requirements:
1. Программа должна считывать имена 6 котов в указанном порядке.
2. Метод main должен создавать 6 объектов типа Cat.
3. Программа должна выводить 6 строк с информацией о котах.
4. Строка про дедушку (первая) должна соответствовать условию.
5. Строка про бабушку (вторая) должна соответствовать условию.
6. Строка про папу (третья) должна соответствовать условию.
7. Строка про маму (четвертая) должна соответствовать условию.
8. Строка про сына (пятая) должна соответствовать условию.
9. Строка про дочь (шестая) должна соответствовать условию.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите имя ДЕДУШКИ по ПАПЕ");
        String grandfatherDadName = reader.readLine();   // "дедушка Вася"
//        String grandfatherDadName = "дедушка Вася";   //
        Cat grandfatherDad = grandfatherDadName == null || grandfatherDadName.length() == 0 ? null : new Cat(grandfatherDadName, null, null);

        System.out.println("Введите имя БАБУШКУ по ПАПЕ");
        String grandmotherDadName = reader.readLine();   // ""
//        String grandmotherDadName = "";   //
        Cat grandmotherDad = grandmotherDadName == null || grandmotherDadName.length() == 0 ? null : new Cat(grandmotherDadName, null, null);

        System.out.println("Введите имя ДЕДУШКИ по МАМЕ");
        String grandfatherMomName = reader.readLine();   // ""
//        String grandfatherMomName = "";   //
        Cat grandfatherMom = grandfatherMomName == null || grandfatherMomName.length() == 0 ? null : new Cat(grandfatherMomName, null, null);

        System.out.println("Введите имя БАБУШКУ по МАМЕ");
        String grandmotherMomName = reader.readLine();   // "бабушка Мурка"
//        String grandmotherMomName = "бабушка Мурка";   //
        Cat grandmotherMom = grandmotherMomName == null || grandmotherMomName.length() == 0 ? null : new Cat(grandmotherMomName, null, null);

        System.out.println("Введите имя ПАПЫ");
        String dadName = reader.readLine();   // "папа Котофей"
//        String dadName = "папа Котофей";
        Cat dad = dadName == null || dadName.length() == 0 ? null : new Cat(dadName, grandfatherDad, grandmotherDad);

        System.out.println("Введите имя МАМЫ");
        String momName = reader.readLine();   // "мама Василиса"
//        String momName = "мама Василиса";   //
        Cat mom = momName == null || momName.length() == 0 ? null : new Cat(momName, grandfatherMom, grandmotherMom);

        System.out.println("Введите имя СЫНА");
        String sonName = reader.readLine();   // "сын Мурчик"
//        String sonName = "сын Мурчик";
        Cat son = sonName == null || sonName.length() == 0 ? null : new Cat(sonName, dad, mom);

        System.out.println("Введите имя ДОЕРИ");
        String daughterName = reader.readLine();   // "дочь Пушинка"
//        String daughterName = "дочь Пушинка";
        Cat daughter = daughterName == null || daughterName.length()  == 0 ? null : new Cat(daughterName, dad, mom);


        StringBuilder result = new StringBuilder();
        if (grandfatherDad != null) {
            result.append(grandfatherDad + "\n");   // дедушка  по папе
        }
        if (grandmotherDad != null) {
            result.append(grandmotherDad + "\n");   // бабушка по папе
        }
        if (grandfatherMom != null) {
            result.append(grandfatherMom + "\n");   // дедушка по маме
        }
        if (grandmotherMom != null) {
            result.append(grandmotherMom + "\n");   // бабушка по маме
        }
        if (dad != null) {
            result.append(dad + "\n");   // папа
        }
        if (mom != null) {
            result.append(mom + "\n");   // мама
        }
        if (son != null) {
            result.append(son + "\n");   // сын
        }
        if (daughter != null) {
            result.append(daughter + "\n");   // дочь
        }

        System.out.println(result);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;


        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat father, Cat mother) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }


        @Override
        public String toString() {
            StringBuilder result = new StringBuilder("The cat's name is ");
            result.append(name);
            result.append(", ");

            if (mother == null) {
                result.append("no mother ");
            } else {
                result.append("mother is " + mother.name);
            }

            result.append(", ");

            if (father == null) {
                result.append("no father");
            } else {
                result.append("father is " + father.name);
            }

            return result.toString();
        }
    }
}
