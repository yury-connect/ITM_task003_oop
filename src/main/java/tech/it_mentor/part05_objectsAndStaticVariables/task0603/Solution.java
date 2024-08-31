package tech.it_mentor.part05_objectsAndStaticVariables.task0603;

/* 
Создать в цикле по 50 000 объектов Cat и Dog.
(Java-машина должна начать уничтожать неиспользуемые, и метод finalize хоть раз да вызовется).


Requirements:
1. В классе Cat должен быть void метод finalize.
2. В классе Dog должен быть void метод finalize.
3. Метод finalize класса Cat должен выводить на экран "A Cat was destroyed".
4. Метод finalize класса Dog должен выводить на экран "A Dog was destroyed".
5. Метод main должен создавать 50000 объектов типа Cat и 50000 объектов типа Dog.*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 0; i < 50_000; i++) {
            Cat cat = new Cat(i);
            Dog dog = new Dog(i);
        }

        // Явный вызов сборщика мусора
        System.gc();

        // Ожидание завершения работы GC
        try {
            Thread.sleep(1_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Finish");
    }
}

class Cat {
    private int number;

    public Cat(int number) {
        this.number = number;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Cat № '" + number + "' was destroyed");
    }
}

class Dog {
    private int number;
    private String[] strings = new String[100];

    public Dog(int number) {
        this.number = number;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A \tDog № '" + number + "' was destroyed");
    }
}
