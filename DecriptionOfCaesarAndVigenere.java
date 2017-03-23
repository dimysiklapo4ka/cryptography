package cryptography;

import static java.lang.Character.isLetter;
import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

/**
 * Created by d1mys1klapo4ka on 22.03.2017.
 */
class DecriptionOfCaesarAndVigenere {

    char[] decriptionTextByCaesarCipher(char[] text_for_decoding, int key_for_decryption_of_Caesar){

        char[] text_after_decoding_of_Caesar = new char[text_for_decoding.length];

        for (int i = 0, n = text_for_decoding.length; i < n; i++) {
            if (isLetter(text_for_decoding[i]) && isUpperCase(text_for_decoding[i])) {

                text_after_decoding_of_Caesar[i] = (char) ((text_for_decoding[i]) -
                        (key_for_decryption_of_Caesar % 26));

                if (text_after_decoding_of_Caesar[i] < 'A'){

                    text_after_decoding_of_Caesar[i] = (char)('Z' - ('A' - text_after_decoding_of_Caesar[i]) + 1);
                }
            }

            if (isLetter(text_for_decoding[i]) && isLowerCase(text_for_decoding[i])) {

                text_after_decoding_of_Caesar[i] = (char) ((text_for_decoding[i]) -
                        (key_for_decryption_of_Caesar % 26));

                if (text_after_decoding_of_Caesar[i] < 'a'){

                    text_after_decoding_of_Caesar[i] = (char) ('z' - ('a' - text_after_decoding_of_Caesar[i]) + 1);
                }
            }
        }
        return text_after_decoding_of_Caesar;
    }

    char[] decriptionTextByVigenereCipher(char[] text_for_decoding, char[] key_for_decription_of_Vigenere){

        char[] text_after_decoding_of_Vigenere = new char[text_for_decoding.length];

        int counter = 0;
        int the_key_for_storing_the_integer_value = 0;
        int keygen = key_for_decription_of_Vigenere.length;

        char[] key_for_cycle_keyword = new char[text_for_decoding.length];

        for (int i = 0, n = text_for_decoding.length; i < n; i++){

            key_for_cycle_keyword[i] = key_for_decription_of_Vigenere[counter % keygen];

            if (isUpperCase(key_for_cycle_keyword[i])){
                the_key_for_storing_the_integer_value = (key_for_cycle_keyword[i] - 65);
            }

            if (isLowerCase(key_for_cycle_keyword[i])){
                the_key_for_storing_the_integer_value = (key_for_cycle_keyword[i] - 97);
            }

            if (isLetter(text_for_decoding[i]) && isUpperCase(text_for_decoding[i])) {

                text_after_decoding_of_Vigenere[i] = (char) ((text_for_decoding[i]) -
                        (the_key_for_storing_the_integer_value % 26));

                if (text_after_decoding_of_Vigenere[i] < 'A'){

                    text_after_decoding_of_Vigenere[i] = (char)('Z' - ('A' - text_after_decoding_of_Vigenere[i]) + 1);
                }
                counter++;
            }

            if (isLetter(text_for_decoding[i])  && isLowerCase(text_for_decoding[i])) {

                text_after_decoding_of_Vigenere[i] = (char) ((text_for_decoding[i]) -
                        (the_key_for_storing_the_integer_value % 26));

                if (text_after_decoding_of_Vigenere[i] < 'a'){

                    text_after_decoding_of_Vigenere[i] = (char)('z' - ('a' - text_after_decoding_of_Vigenere[i]) + 1);
                }
                counter++;
            }
        }
        return text_after_decoding_of_Vigenere;
    }
}
