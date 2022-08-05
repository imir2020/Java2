package algoritms.myAlgoritm1;

import java.util.HashMap;
import java.util.Map;

/*

 */
public class StatisticDictionary {
    private static Map<String, String> dictionary = new HashMap<>();
    {
        dictionary.put("0000", "A");
        dictionary.put("0001", "B");
        dictionary.put("0011", "C");
        dictionary.put("0111", "D");
        dictionary.put("1111", "E");
        dictionary.put("1000", "F");
        dictionary.put("1100", "G");
        dictionary.put("1110", "H");
        dictionary.put("1001", "L");
        dictionary.put("1011", "M");
        dictionary.put("1101", "N");
        dictionary.put("0100", "O");
        dictionary.put("0010", "P");
        dictionary.put("0110", "Q");

    }

    public Map<String, String> getDictionary() {
        return dictionary;
    }

}
