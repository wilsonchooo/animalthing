package Wilson;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ArrayList animalArr = new ArrayList(Arrays.asList(
                "cat", "mouse", "frog", "dog", "dog"
        ));



        wordlist animals = new wordlist(animalArr);



        System.out.println(animals.numWordsOfLength(4));
        System.out.println(animals.numWordsOfLength(3));
        System.out.println(animals.numWordsOfLength(2));


        System.out.println(animals.printthing());


        animals.removeWordsOfLength(4);
        System.out.println(animals.printthing());



        animals.removeWordsOfLength(3);
        System.out.println(animals.printthing());

        animals.removeWordsOfLength(2);
        System.out.println(animals.printthing());
    }
}