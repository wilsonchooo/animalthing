package Wilson;

import java.util.ArrayList;

public class wordlist {

    private ArrayList<String> myList;


    public wordlist(ArrayList animalArr){
        this.myList = animalArr;
    }


    public void addWords(String word){
        myList.add(word);
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


    public String toString(){
        String result = "";
        for(String words : myList){
            result+= words + " ";
        }
        return result;
    }
}