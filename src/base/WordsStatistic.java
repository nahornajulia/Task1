package base;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ynahorna
 */
public class WordsStatistic {

    private int maxKey = 0;
    private String maxValue = null;

    public int getMaxKey() {
        return maxKey;
    }

    public String getMaxValue() {
        return maxValue;
    }

    public Map<String, Integer> uniqueWordsList(File f) {

        Map<String, Integer> mapStat = new TreeMap<>();

        try {
            Scanner sc = new Scanner(f);
            while (sc.hasNext()) {
                String next = sc.next();
                if (mapStat.containsKey(next)) {
                    Integer get = mapStat.get(next);
                    get += 1;
                    if (get > maxKey) {
                        maxKey = get;
                        maxValue = next;
                    }
                    mapStat.put(next, get);
                } else {
                    mapStat.put(next, 1);
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(WordsStatistic.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("The most used word is: " + maxValue + ". It used " + maxKey + " times!");
        return mapStat;
    }

}
