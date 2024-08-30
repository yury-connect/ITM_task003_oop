package tech.it_mentor.part04_classesAndСonstructors.task0517;

/* 
Конструируем котиков
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст - неизвестные. Кот - бездомный)
- вес, цвет, адрес (чужой домашний кот)

Задача конструктора - сделать объект валидным.
Например, если вес не известен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить.
То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.


Requirements:
1. У класса Cat должна быть переменная name с типом String.
2. У класса Cat должна быть переменная age с типом int.
3. У класса Cat должна быть переменная weight с типом int.
4. У класса Cat должна быть переменная address с типом String.
5. У класса Cat должна быть переменная color с типом String.
6. У класса должен быть конструктор, принимающий в качестве параметра имя, но инициализирующий все переменные класса, кроме адреса.
7. У класса должен быть конструктор, принимающий в качестве параметров имя, вес, возраст и инициализирующий все переменные класса, кроме адреса.
8. У класса должен быть конструктор, принимающий в качестве параметров имя, возраст и инициализирующий все переменные класса, кроме адреса.
9. У класса должен быть конструктор, принимающий в качестве параметров вес, цвет и инициализирующий все переменные класса, кроме имени и адреса.
10. У класса должен быть конструктор, принимающий в качестве параметров вес, цвет, адрес и инициализирующий все переменные класса, кроме имени.*/

public class Cat {
    String name;
    int age;
    int weight;
    String address;
    String color;


    public Cat(String name) { // №6
        this.name = name;
        this.age = 6;
        this.weight = 16;
        this.color = "рыжий полосатый";
    }

    public Cat(String name, int weight, int age) { // №7
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "черный полностью";
    }

    public Cat(String name, int age) { // №8
        this.name = name;
        this.age = age;
        this.weight = 8;
        this.color = "белый полностью";
    }

    public Cat(int weight, String color) { // №9
        this.age = 9;
        this.weight = weight;
        this.color = color;
    }

    public Cat(int weight, String color, String address) {
        this.age = 10;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", address='" + address + '\'' +
                ", color='" + color + '\'' +
                '}';
    }


    public static void main(String[] args) {
        System.out.println(new Cat("Мурзик"));
        System.out.println(new Cat("Тузик", 7, 17));
        System.out.println(new Cat("Барсик", 18));
        System.out.println(new Cat(19, "трех цветный"));
        System.out.println(new Cat(11, "дымчатый", "Архангельск, Суворова, 21"));
    }
}