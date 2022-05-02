package com.company;
//Unit 2
//Основные конструкции и операторы
class Main {
        public static void main(String[] args) {
            System.out.println("Hello world!");

            //Create Static method
            /*Статичные методы доступны без создания объекта*/
            StaticTest staticTest = new StaticTest();
            staticTest.noStaticMethod();
            StaticTest.staticMethod();

            //Task 2.2.5
            /*Исправьте программу так, чтобы в консоль вывелось "Hello world!".*/
            printHello();
            printSpace();
            printWorld();

            //Task 2.4.2
            /*Исправьте в программе ошибки так, чтобы в консоль вывелось 2147483770 (сами значения менять не надо, только исправить 3 ошибки).*/
            char num1 = 'z';
            int num2 = 2147483647;
            long result = num1 + num2 + 1;
            System.out.println("Result " + result);

            //Task 2.5.3
            /*Добавьте в код один оператор так, чтобы вывод в консоль был: 46.*/
            int a = 190 / 5;
            int b = 245 % 17;
            int sum = a + b;
            System.out.println(++sum);
        }

    private static void printHello() {
        System.out.print("Hello");
    }

    private static void printWorld() {
        System.out.print("world!");
    }

    private static void printSpace() {
        System.out.print(" ");
    }
}

class StaticTest {
        public void noStaticMethod() {
            System.out.println("No static");
        }

        public static void staticMethod() {
            System.out.println("Static");
        }
}
