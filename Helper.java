package cryptography;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by d1mys1klapo4ka on 22.03.2017.
 */
public class Helper {

    static String INPUT_ERROR = "Введите два аргумента командной строки.";
    static String INPUT_POSITIVE_INT = "В аргумент введите положительное число.";
    static String INPUT_INT = "Введите числовое значение в аргумент командной строки.";
    static String INPUT_STRING = "Введите в аргумент ключ - слово для кодирования сообщения.";

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    char[] getString() throws IOException {
        String textForCoding = reader.readLine();
        char[] charsForCoding = textForCoding.toCharArray();

        return charsForCoding;
    }


    int getInteger() throws IOException {

        int keyForCodingCaesar = Integer.parseInt(reader.readLine());

        return keyForCodingCaesar;
    }

}