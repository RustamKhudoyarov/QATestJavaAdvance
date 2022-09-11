import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TestSentence testSentence = new TestSentence();
        String sentencesForMapWordsDuplicates ="Необходимо переменными создать"
                + " класс с тремя методами ?с тремя новыми переменными.";
        testSentence.setInputText(sentencesForMapWordsDuplicates);
        Map<String , Integer> mapWords ;
        List<String> sentenceByTheWord;

        mapWords = testSentence.getCountWordsInSentenceMap(sentencesForMapWordsDuplicates);
        for(Map.Entry<String, Integer> mapWord : mapWords.entrySet()){
            System.out.println(mapWord.getKey() + ": " + mapWord.getValue());
        }
        System.out.println("+++++++++++Search by the word+++++++++++++");
        System.out.println("Please, you should  enter the word for searching sentences where contains your word:");
        String searchWord = scanner.next();
        TestSentence searchWordInText = new TestSentence();
        String textForSearchWord ="Необходимо создать класс с тремя методами."
                + " Снова создать новую программу. Решить уравнение. Создать новое решение? Все поменять и создать заново!";
        sentenceByTheWord =  searchWordInText.returnSentencesByWord(searchWord, textForSearchWord);
        for(String sentence : sentenceByTheWord){
            System.out.println(sentence);
        }

    }
}
