package base;

import base_add_ons.UniqueWords;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ynahorna
 */
public class UniqueWordsSet implements UniqueWords {

    @Override

    public Set<String> uniqueWordsList(File f) {

        Set<String> setOfWords = new TreeSet<>();

        try {
            Scanner s = new Scanner(f);
            while (s.hasNext()) {
                String next = s.next();
                setOfWords.add(next);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UniqueWordsSet.class.getName()).log(Level.SEVERE, null, ex);
        }
        return setOfWords;
    }

    @Override
    public int getDistinctWordCount(Collection<String> list) {
        int size = list.size();
        System.out.println("TOTAL size: " + size);
        return size;
    }

}
