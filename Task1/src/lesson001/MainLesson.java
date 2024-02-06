package lesson001;

import java.util.Scanner;

public class MainLesson {
    public static void main(String[] args) {
        System.out.println("тут реч про явное и неявное преобразование типов");
        char a = 'a';
        System.out.println((int) a );
        int b = a;

        System.out.println("первый пример:");
        System.out.println(b);
        System.out.println(a);


        System.out.println("Пример второй: найдем индекс символа");
        String test = "Мама мыла раму в доме";

        System.out.println(test.indexOf(' '));// ищем пробел
        System.out.println(test.lastIndexOf(' '));

        System.out.println(test.substring(test.indexOf(' ')));
        System.out.println(test.substring(test.lastIndexOf(' ')));
        System.out.println(test.substring(0, 3));
        System.out.println(test.substring(test.indexOf(' '), test.lastIndexOf(' ')));
        System.out.println(test.substring(test.indexOf(' ')+1, test.lastIndexOf(' ')));
        System.out.println(test.substring(test.indexOf(' '), test.lastIndexOf(' ')).trim());



    }
}
