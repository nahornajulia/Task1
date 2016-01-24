/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base_add_ons;

import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Set;

/**
 *
 * @author ynahorna
 */
public interface ReadFile {
    
    public String readFile(File f);
    
    public List<String> readFile(InputStream is);

    public Set<Character> readFileSet(File file);
    
}
