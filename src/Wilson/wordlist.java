package Wilson;

import java.util.ArrayList;

public class wordlist {

    private ArrayList<String> myList;


    public wordlist(ArrayList animalArr){
        this.myList = animalArr;
    }





    public int numWordsOfLength(int len){
        int count = 0;
        for(String words : myList){
            if(words.length()==len){
                count++;
            }
        }
        return count;
    }


    public void removeWordsOfLength(int len){
        for(int i = myList.size()-1; i >= 0;i--){
            if(myList.get(i).length()==len){
                myList.remove(i);
            }
        }
    }



    public String printthing()
    {
        String stringer = "";
        for(String animals : myList){
            stringer= stringer + animals + " ";
        }
        return stringer;
    }
}