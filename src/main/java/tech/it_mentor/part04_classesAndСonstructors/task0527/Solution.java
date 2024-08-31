package tech.it_mentor.part04_classesAndСonstructors.task0527;

/* 
Создай классы Dog, Cat, Mouse.
Добавь по три поля в каждый класс, на твой выбор.
Создай объекты для героев мультика Том и Джерри.
Так много, как только вспомнишь.

Пример:
Mouse jerryMouse = new Mouse("Jerry", 12 , 5),
где 12 - высота в см,
5 - длина хвоста в см.


Requirements:
1. Создай класс Dog.
2. Создай класс Cat.
3. В классе Dog должно быть три переменные.
4. В классе Cat должно быть три переменные.
5. Должен быть создан хотя бы один объект типа Mouse.
6. Должен быть создан хотя бы один объект типа Dog.
7. Должен быть создан хотя бы один объект типа Cat.*/


public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Dog dog = new Dog("Dog Bob", 10, "White");
        Cat cat = new Cat("Tom", 15, 3);

        System.out.println(jerryMouse);
        System.out.println(dog);
        System.out.println(cat);
    }


    public static class Dog {
        String name;
        int height;
        String color;

        public Dog(String name, int height, String color) {
            this.name = name;
            this.height = height;
            this.color = color;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    ", height=" + height +
                    ", color='" + color + '\'' +
                    '}';
        }
    }


    public static class Cat {
        String name;
        int weight;
        int tail;

        public Cat(String name, int weight, int tail) {
            this.name = name;
            this.weight = weight;
            this.tail = tail;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    ", weight=" + weight +
                    ", tail=" + tail +
                    '}';
        }
    }


    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }

        @Override
        public String toString() {
            return "Mouse{" +
                    "name='" + name + '\'' +
                    ", height=" + height +
                    ", tail=" + tail +
                    '}';
        }
    }
}
