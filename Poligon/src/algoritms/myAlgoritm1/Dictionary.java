package algoritms.myAlgoritm1;

import java.util.HashMap;
import java.util.Map;

/*
Здесь будут храниться наиболее распространенные комбинации битов
 */
public class Dictionary {

    private static final Map<String, String> dictionary = new HashMap<>();
    static {
        dictionary.put("1000","a");
        dictionary.put("1100","b");
        dictionary.put("1110","c");
        dictionary.put("1111","d");
        dictionary.put("0000","e");
        dictionary.put("0001","f");
        dictionary.put("0011","g");
        dictionary.put("0111","h");
        dictionary.put("1001","l");
        dictionary.put("1101","k");
        dictionary.put("1011","m");
        dictionary.put("0110","n");
        dictionary.put("0100","t");
        dictionary.put("0010","p");
        dictionary.put("0101","q");
        dictionary.put("1010","r");
    }

    public Map<String, String> getDictionary() {
        return dictionary;
    }


}
