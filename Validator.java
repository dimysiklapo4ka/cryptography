package cryptography;

import java.io.IOException;

/**
 * Created by d1mys1klapo4ka on 22.03.2017.
 */
class Validator {

    final String ENTER_TEXT = "Enter text";
    final String ENTER_INTEGER_KEY = "Enter integer clef";
    final String ENTER_STRING_KEY = "Enter string clef";
    final String CODED_MESSAGE = "The encoded text looks like this";

    EncriptionOfCaesarAndVigenere encriptionOfCaesarAndVigenere = new EncriptionOfCaesarAndVigenere();
    DecriptionOfCaesarAndVigenere decriptionOfCaesarAndVigenere = new DecriptionOfCaesarAndVigenere();
    Helper helper = new Helper();

    void showMenu(){

        System.out.println("1. Coding Caesar");
        System.out.println("2. Coding Vigener");
        System.out.println("3. Coding Caesar and Vigener");
        System.out.println();
        System.out.println("4. Decoding Caesar");
        System.out.println("5. Decoding Vigener");
        System.out.println("6. Decoding Caesar and Vigener");
        System.out.println("q - quitting");
    }

    boolean isvalidMenu(int ch){
        if (ch < '1' | ch > '6' & ch != 'q'){
            return false;
        }
        else{
            return true;
        }
    }

    void validator(int what) throws IOException {

        switch (what){
            case '1': {
                System.out.println(ENTER_TEXT);
                char[] textForEncription = helper.getString();
                System.out.println(ENTER_INTEGER_KEY);
                int keyForEncryptionOfCaesar = helper.getInteger();
                char[] encriptionTextByCaesarCipher = encriptionOfCaesarAndVigenere.
                        encriptionTextByCaesarCipher(textForEncription, keyForEncryptionOfCaesar);
                System.out.println(CODED_MESSAGE);
                helper.cipherTextOutput(encriptionTextByCaesarCipher);
                System.out.println();
                break;
            }
            case '2': {
                System.out.println(ENTER_TEXT);
                char[] textForEncription = helper.getString();
                System.out.println(ENTER_STRING_KEY);
                char[] keyForEncryptionOfVigenere = helper.getString();
                char[] encriptionTextByVigenereCipher = encriptionOfCaesarAndVigenere.
                        encriptionTextByVigenereCipher(textForEncription, keyForEncryptionOfVigenere);
                System.out.println(CODED_MESSAGE);
                helper.cipherTextOutput(encriptionTextByVigenereCipher);
                System.out.println();
                break;
            }
            case '3': {
                System.out.println(ENTER_TEXT);
                char[] textForEncription = helper.getString();
                System.out.println(ENTER_INTEGER_KEY);
                int keyForEncryptionOfCaesar = helper.getInteger();
                System.out.println(ENTER_STRING_KEY);
                char[] keyForEncryptionofVigenere = helper.getString();
                char[] encriptionTextByCaesarCipher = encriptionOfCaesarAndVigenere.
                        encriptionTextByCaesarCipher(textForEncription, keyForEncryptionOfCaesar);
                char[] encriptionTextByVigenereCipher = encriptionOfCaesarAndVigenere.
                        encriptionTextByVigenereCipher(encriptionTextByCaesarCipher, keyForEncryptionofVigenere);
                System.out.println(CODED_MESSAGE);
                helper.cipherTextOutput(encriptionTextByVigenereCipher);
                System.out.println();
                break;
            }
            case '4':{
                System.out.println(ENTER_TEXT);
                char[] textForDecription = helper.getString();
                System.out.println(ENTER_INTEGER_KEY);
                int keyForDecryptionOfCaesar = helper.getInteger();
                char[] decriptionTextByCaesarCipher = decriptionOfCaesarAndVigenere.
                        decriptionTextByCaesarCipher(textForDecription, keyForDecryptionOfCaesar);
                System.out.println(CODED_MESSAGE);
                helper.cipherTextOutput(decriptionTextByCaesarCipher);
                System.out.println();
                break;
            }
            case '5': {
                System.out.println(ENTER_TEXT);
                char[] textForDecription = helper.getString();
                System.out.println(ENTER_STRING_KEY);
                char[] keyForDecryptionOfVigenere = helper.getString();
                char[] decriptionTextByVigenereCipher = decriptionOfCaesarAndVigenere.
                        decriptionTextByVigenereCipher(textForDecription, keyForDecryptionOfVigenere);
                System.out.println(CODED_MESSAGE);
                helper.cipherTextOutput(decriptionTextByVigenereCipher);
                System.out.println();
                break;
            }
            case '6': {
                System.out.println(ENTER_TEXT);
                char[] textForDecription = helper.getString();
                System.out.println(ENTER_INTEGER_KEY);
                int keyForDecryptionOfCaesar = helper.getInteger();
                System.out.println(ENTER_STRING_KEY);
                char[] keyForDecryptionofVigenere = helper.getString();
                char[] decriptionTextByCaesarCipher = decriptionOfCaesarAndVigenere.
                        decriptionTextByCaesarCipher(textForDecription, keyForDecryptionOfCaesar);
                char[] decriptionTextByVigenereCipher = decriptionOfCaesarAndVigenere.
                        decriptionTextByVigenereCipher(decriptionTextByCaesarCipher, keyForDecryptionofVigenere);
                System.out.println(CODED_MESSAGE);
                helper.cipherTextOutput(decriptionTextByVigenereCipher);
                System.out.println();
                break;
            }
        }
    }
}