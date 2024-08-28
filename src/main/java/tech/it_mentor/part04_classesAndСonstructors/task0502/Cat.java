package tech.it_mentor.part04_classesAndСonstructors.task0502;

/* 
Реализовать метод fight
Реализуй метод boolean fight(Cat anotherCat):
продумай механизм драки котов в зависимости от их веса, возраста и силы.
Сравни каждый критерий по отдельности, чтобы победителем был тот, у кого были лучшие показатели по большинству критериев.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если проиграли.
Если ничья и никто не выиграл, возвращаем false.


Requirements:
1. Класс Cat должен содержать конструктор без параметров.
2. Класс Cat должен содержать всего три поля: age, weight и strength. Поля должны быть публичные.
3. В классе Cat должен быть метод fight.
4. В методе fight реализовать механизм драки котов в зависимости от их веса, возраста и силы согласно условию.
5. Метод должен возвращать одно и тоже значение, если мы деремся с одним и тем же котом.
6. Если некий кот1 выигрывает у кота кот2, то кот2 должен проигрывать коту кот1.*/

public class Cat {
    public int age;
    public int weight;
    public int strength;


    public Cat() {
        // NOP
    }

    public Cat(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }


    public boolean fight(Cat anotherCat) {
        int thisCatFactor = getCatFactor(age, weight, strength);
        int anotherCatFactor = getCatFactor(anotherCat.age, anotherCat.weight, anotherCat.strength);
        return thisCatFactor > anotherCatFactor;
    }

    private static int getCatFactor (int age, int weight, int strength) {
        return getAgeFactor(age) * getWeightFactor(weight) * strength;
    }

    private static int getAgeFactor (int age) {
        int result;
        if (age < 1 || age > 30) {
            return 0; // кот к состязаниям не допущен ко критерию ВОЗРАСТ
        }
        if (age <= 2 || age >= 17) {
            result = 1;
        } else if (age <= 5 || age >= 12) {
            result = 2;
        } else {
            result = 3;
        }
        return result;
    }

    private static int getWeightFactor (int weight) {
        int result;
        if (weight < 1 || weight > 30) {
            return 0; // кот к состязаниям не допущен ко критерию ВЕС
        }
        if (weight <= 2 || weight >= 17) {
            result = 1;
        } else if (weight <= 5 || weight >= 12) {
            result = 2;
        } else {
            result = 3;
        }
        return result;
    }


    public static void main(String[] args) {
        ClassLoader.getSystemClassLoader().setDefaultAssertionStatus(true);
        Cat cat1 = new Cat();
        Cat cat2 = new Cat(1, 3, 5);
        Cat cat3 = new Cat(2, 4, 6);

        testing(cat1, "Кот1", cat2, "Кот2");
        testing(cat2, "Кот2", cat1, "Кот1");

        testing(cat2, "Кот2", cat3, "Кот3");
        testing(cat3, "Кот3", cat2, "Кот2");

        testing(cat1, "Кот1", cat3, "Кот3");
        testing(cat3, "Кот3", cat1, "Кот1");
    }

    private static void testing(Cat cat1, String nameCat1, Cat cat2, String nameCat2) {
        if (cat1.fight(cat2)) {
            System.out.println(nameCat1 + " победил, " + nameCat2 + " проиграл.");
        } else {
            System.out.println(nameCat2 + " победил, " + nameCat1 + " проиграл.");
        }
    }
}
