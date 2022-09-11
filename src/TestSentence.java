import java.util.*;
import java.lang.*;

public class TestSentence {
    private String inputText;
    private Map<String,Integer> mapWords;



    public void setInputText(String inputText) {
        this.inputText = inputText;
    }

    public Map<String, Integer> getCountWordsInSentenceMap(String inputText) {
      List<String> words = List.of(inputText.split("[, ?.@!:;\"]+"));
      mapWords = new HashMap<>();
      for(String word : words) {
          Integer count = mapWords.get(word);
         if(count==null){
             mapWords.put(word, 1);
         }else{
             mapWords.remove(word);
             mapWords.put(word,count+1);
         }

      }
        return mapWords;
    }

        public List<String> returnSentencesByWord(String word,String inputText){
        List <String> sentences = List.of(inputText.split("[.]",0)) ;
        List<String> sentencesContainsWord=new ArrayList<>();
        for (String sentence : sentences){
          if(sentence.contains(word)){
                sentencesContainsWord.add(sentence);
           }

        }
       return sentencesContainsWord;

    }
}


