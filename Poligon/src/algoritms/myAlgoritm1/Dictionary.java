package algoritms.myAlgoritm1;

import java.util.HashMap;
import java.util.Map;

/*
Здесь будут храниться наиболее распространенные комбинации битов
 */
public class Dictionary {

    private static Map<String, String> dictionary = new HashMap<>();

    public Map<String, String> getDictionary() {
        return dictionary;
    }

    public void setDictionary(Map<String, String> dictionary) {
        this.dictionary = dictionary;
    }
}
