package cryptography;

import java.io.IOException;

/**
 * Created by d1mys1klapo4ka on 21.03.2017.
 */
class Cryptography {

    public static void main(String[] args) throws IOException {

        char choice, ignore;

        Validator validator = new Validator();

        while (true){

            do{
                validator.showMenu();

                choice = (char) System.in.read();

                do{
                    ignore = (char) System.in.read();
                }while (ignore != '\n');
            }while (!validator.isvalidMenu(choice));

            if (choice == 'q'){
                break;
            }
            System.out.println();

            validator.validator(choice);
        }
    }
}
