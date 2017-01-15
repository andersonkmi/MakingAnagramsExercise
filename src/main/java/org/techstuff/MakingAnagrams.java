package org.techstuff;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andersonkmi on 1/15/2017.
 */
public class MakingAnagrams {
    public int numberNeeded(String first, String second) {
        if(first == null && second != null) {
            return second.length();
        } else if(first != null && second == null) {
            return first.length();
        }

        List<Character> secondStr = new ArrayList<Character>();
        for(int pos = 0; pos < second.length(); pos++) {
            secondStr.add(second.charAt(pos));
        }

        int pairsFound = 0;
        for(int index = 0; index < first.length(); index++) {
            char item = first.charAt(index);
            if(secondStr.contains(item)) {
                pairsFound++;
                secondStr.remove(item);
                break;
            }
        }
        return (first.length() - pairsFound) + (second.length() - pairsFound);
    }
}
