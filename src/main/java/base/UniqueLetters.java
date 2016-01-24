package base;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ynahorna
 */
public class UniqueLetters {

    public Set<Character> getLetters(File f) {

        Set<Character> setC = new TreeSet<>();

        try {

            BufferedReader b = new BufferedReader(new FileReader(f));
            char[] c = new char[10];
            while (b.read(c) != -1) {
                for (int i = 0; i < c.length; i++) {
                    if (((c[i] >= 'a') && (c[i] <= 'z')) || ((c[i] >= 'A') && (c[i] <= 'Z'))) {
                        setC.add(c[i]);
                    }
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(UniqueLetters.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException e) {
            Logger.getLogger(UniqueLetters.class.getName()).log(Level.SEVERE, null, e);
        }

        return setC;
    }

    public int lettersCounting(Set<Character> c) {

        return c.size();
    }

}
