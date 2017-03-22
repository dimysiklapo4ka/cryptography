package cryptography;

import static java.lang.Character.isLetter;
import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

/**
 * Created by d1mys1klapo4ka on 21.03.2017.
 */
public class EncriptionOfCaesarAndVigenere {

    static String INPUT_ERROR = "Введите два аргумента командной строки.";
    static String INPUT_POSITIVE_INT = "В аргумент введите положительное число.";
    static String INPUT_INT = "Введите числовое значение в аргумент командной строки.";
    static String INPUT_STRING = "Введите в аргумент ключ - слово для кодирования сообщения.";


    char[] encriptionTextByCaesarCipher(char[] text_for_encoding, int key_for_encryption_of_Caesar){

        char[] text_after_coding_of_Caesar = new char[text_for_encoding.length];

        for (int i = 0, n = text_for_encoding.length; i < n; i++) {
            if (isLetter(text_for_encoding[i]) && isUpperCase(text_for_encoding[i])) {

                text_after_coding_of_Caesar[i] = (char) ((text_for_encoding[i] - 65 +
                        key_for_encryption_of_Caesar) % 26 + 65);

            }
            if (isLetter(text_for_encoding[i]) && isLowerCase(text_for_encoding[i])) {

                text_after_coding_of_Caesar[i] = (char) ((text_for_encoding[i] - 97 +
                        key_for_encryption_of_Caesar) % 26 + 97);

            }
        }

        return text_after_coding_of_Caesar;
    }

    char[] encriptionTextByVigenereCipher(char[] text_for_encoding, char[] key_for_encription_of_Vigenere){

        char[] text_after_coding_of_Vigenere = new char[text_for_encoding.length];

        int counter = 0;
        int the_key_for_storing_the_integer_value = 0;
        int keygen = key_for_encription_of_Vigenere.length;

        char[] key_for_cycle_keyword = new char[text_for_encoding.length];

        for (int i = 0, n = text_for_encoding.length; i < n; i++){

            key_for_cycle_keyword[i] = key_for_encription_of_Vigenere[counter % keygen];

            if (isUpperCase(key_for_cycle_keyword[i])){

                the_key_for_storing_the_integer_value = (key_for_cycle_keyword[i] - 65);
            }

            if (isLowerCase(key_for_cycle_keyword[i])){

                the_key_for_storing_the_integer_value = (key_for_cycle_keyword[i] - 97);
            }

            if(isLetter(text_for_encoding[i]) && isUpperCase(text_for_encoding[i])){

                text_after_coding_of_Vigenere[i] = (char) ((text_for_encoding[i] - 65 +
                        the_key_for_storing_the_integer_value) % 26 + 65);

                counter++;
            }

            if (isLetter(text_for_encoding[i])  && isLowerCase(text_for_encoding[i]) ){

                text_after_coding_of_Vigenere[i] = (char) ((text_for_encoding[i] - 97 +
                        the_key_for_storing_the_integer_value) % 26 + 97);

                counter++;
            }
        }

        return text_after_coding_of_Vigenere;
    }
}
