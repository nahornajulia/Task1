/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base_add_ons;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author ynahorna
 */
public interface UniqueWords {

    int getDistinctWordCount(Collection<String> list);

    Collection<String> uniqueWordsList(File f);
    
}
