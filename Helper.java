package cryptography;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by d1mys1klapo4ka on 22.03.2017.
 */
class Helper {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    char[] getString() throws IOException {

        String textForCoding = reader.readLine();
        char[] charsForCoding = textForCoding.toCharArray();

        return charsForCoding;
    }

    int getInteger() throws IOException {

        int what = Integer.parseInt(reader.readLine());

        return what;
    }

    void cipherTextOutput(char[] encriptionTextByCaesarCipher){

        for (int i = 0, n = encriptionTextByCaesarCipher.length; i < n; i++){

            System.out.print(encriptionTextByCaesarCipher[i]);
        }

        System.out.println();
    }
}