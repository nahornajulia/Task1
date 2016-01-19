package base;

import base_add_ons.ReadFile;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ynahorna
 */
public class UniqueSymbols implements ReadFile {

    public Set<Character> readFileSet(File f) {

        Set<Character> sc = new TreeSet<>();

        try {
            BufferedReader b = new BufferedReader(new FileReader(f));
            char[] c = new char[10];
            while (b.read(c) != -1) {
                for (int i = 0; i < c.length; i++) {
                    sc.add(c[i]);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UniqueSymbols.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException e) {
            Logger.getLogger(UniqueSymbols.class.getName()).log(Level.SEVERE, null, e);
        }
        return sc;
    }

    @Override
    public List<String> readFile(InputStream is) {

        List<String> list = new LinkedList<>();

        BufferedReader b = new BufferedReader(new InputStreamReader(is));
        String line = null;
        try {
            while ((line = b.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException ex) {
            Logger.getLogger(UniqueSymbols.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public String readFile(File f) {

        StringBuilder sb = new StringBuilder();
        try {
            FileInputStream fis = new FileInputStream(f);
            List<String> readFile = readFile(fis);
            for (String output : readFile) {
                sb.append(output);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(UniqueSymbols.class.getName()).log(Level.SEVERE, null, ex);
        }

        return sb.toString();
    }

}
