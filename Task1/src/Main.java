public class Main {
    public static final String CORRECT_ALFABET = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    //todo Напишите код который распечатает букву и ее код для всех букв русского алфавита формат вывода:
    // А-123
    // Б-321...
    // Коды даны для примера и не соответствуют действительности. Учитывайте, что нужно распечатать коды букв в двух регистрах!
    public static void main(String[] args) {
        //todo код писать тут
        for (int i = 0; i < CORRECT_ALFABET.length(); i++) {
            System.out.println(CORRECT_ALFABET.charAt(i) + " - " + (int)CORRECT_ALFABET.charAt(i));
        }
    }
}