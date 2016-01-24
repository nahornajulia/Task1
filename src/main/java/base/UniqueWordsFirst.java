package base;

import base_add_ons.UniqueWords;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ynahorna
 */
public class UniqueWordsFirst implements UniqueWords {

    @Override
    public ArrayList<String> uniqueWordsList(File f) {

        ArrayList<String> listOfWords = new ArrayList<>();

        try {

            Scanner scan = new Scanner(f);
            while (scan.hasNext()) {
                String word = scan.next(); 
                if (!listOfWords.contains(word)) { 
                    listOfWords.add(word);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UniqueWordsFirst.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listOfWords; 
    }

    @Override
    public int getDistinctWordCount(Collection<String> list) {
        return list.size();
    }

}
