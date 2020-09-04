package com.ru.mirea;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog dog2 = new Dog("Mike", 3);
        Dog dog3 = new Dog("Bob", 5);

        dog2.setName("Michael");
        System.out.println( dog2);

        dog.intoHumanAge();
        dog2.intoHumanAge();
        dog3.intoHumanAge();

    }
}
