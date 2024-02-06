package zadacha01;

import java.util.Scanner;

public class Zadacha {
    public static final String CORRECT_CHARS = " абвгдеёжзийклмнопрстуфхцчшщъыьэюя";

    public static void main(String[] args) {
        // ввод только русских маленьких букв
        // не больше двух слов
        //вывести второе слово
        System.out.println("задача на валидацию вводных данных!");
        System.out.println("vvedite slova!!!");
        String input = new Scanner(System.in).nextLine().trim();

        boolean isValid = true;
        int speysCount = 0;


        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' '){
                speysCount++;
            }

            if (!CORRECT_CHARS.contains(String.valueOf(input.charAt(i)))){
                isValid = false;
                break;
            }
        }
        if (isValid && speysCount == 1){
            System.out.println(input.substring(input.indexOf(' ')).trim());
        } else {
            System.out.println("vvod ne verniy!!!");
        }
    }
}
