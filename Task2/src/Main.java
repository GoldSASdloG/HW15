import java.util.Scanner;

public class Main {

    public static final String CORRECT_ALFABET = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ -";

    public static void main(String[] args) {
        //todo код писать тут. По желанию(рекомендуется) вынести код в методы.

        boolean isValid = true;
        int spaseCount = 0;
        System.out.println("Введите ФИО:");
        String inputFio = new Scanner(System.in).nextLine().trim();

        for (int i = 0; i < inputFio.length(); i++) {
            if (!CORRECT_ALFABET.contains(String.valueOf(inputFio.charAt(i)))){
//                System.out.println("Строка не валидна!!!");
                isValid = false;
                break;
            }
            if (inputFio.charAt(i) == ' '){
                spaseCount++;
            }
        }
        if (isValid && spaseCount == 2){
            System.out.println("Фамилия:  " + inputFio.substring(0, inputFio.indexOf(" ")).trim());
            System.out.println("Имя:  " + inputFio.substring(inputFio.indexOf(" "), inputFio.lastIndexOf(" ")).trim());
            System.out.println("Отчество:  " + inputFio.substring(inputFio.lastIndexOf(" ")).trim());
        } else {
            System.out.println("Введенная строка не является ФИО");
        }
    }
}