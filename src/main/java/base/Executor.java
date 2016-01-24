/*

 На вход подаётся текст (считать из файла). На выходе (записать в файл) получаем следующее:
 1. Все символы, встреченные в тексте (дубликаты игнорировать). - done
 2. Все буквы, встреченные в тексте (дубликаты игнорировать). - done
 3. Буквы, встреченные в тексте, и их количество. Выводить в алфавитном порядке. - done
 4. Все слова, встреченные в тексте. Дубликаты игнорировать. - done
 5. Статистика слов в тексте (слово - количество). Сортировка в алфавитном порядке. - done

 */
package base;

import base_add_ons.ReadFile;
import base_add_ons.UniqueWords;
import java.io.File;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author ynahorna
 */
public class Executor {

    public static void main(String[] args) {

        File file = new File("/tmp/2600.txt");

// 1. To get all symbols in the text(duplicates ignoring)
        ReadFile r = new UniqueSymbols();
        Set<Character> readFileSet = r.readFileSet(file);
        for (Character result : readFileSet) {
            System.out.println(result.toString());
        }
        
        
// 2, 3 To get unique letters from the list. Counting letters. 
//        UniqueLetters l = new UniqueLetters();
//        Set<Character> letters = l.getLetters(file);
//        for (Character result : letters) {
//            System.out.println(result.toString());
//        }
//        int lettersCounting = l.lettersCounting(letters);
//        System.out.println("TOTAL: " + lettersCounting);

// 4. To get all words in the text(duplicates ignoring) - VERSION 1.
          UniqueWords ul = new UniqueWordsSet();
//        Collection<String> uniqueWordsList = ul.uniqueWordsList(file);
//        for (String result : uniqueWordsList) {
//            System.out.println(result.toString());
//        }
//        ul.getDistinctWordCount(uniqueWordsList);
        
// 4. To get all words in the text(duplicates ignoring) - VERSION 2.
//         ul = new UniqueWordsFirst();
//        Collection<String> uniqueWordsList = ul.uniqueWordsList(file);
//        for(String result: uniqueWordsList){
//            System.out.println(result);
//        }
        
        
// 5. Words Statistic
//        WordsStatistic w = new WordsStatistic();
//        Map<String, Integer> uniqueWordsList = w.uniqueWordsList(file);
//        System.out.println(uniqueWordsList);
   }
}
