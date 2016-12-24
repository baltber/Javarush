package com.javarush.test.level22.lesson13.task01;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/* StringTokenizer
Используя StringTokenizer разделить query на части по разделителю delimiter.
Пример,
getTokens("level22.lesson13.task01", ".") == {"level22", "lesson13", "task01"}
*/
public class Solution {
    public static String [] getTokens(String query, String delimiter) {
        StringTokenizer st = new StringTokenizer(query, delimiter);
        List<String> list = new ArrayList<>();
        String [] res = new String[st.countTokens()];

        while (st.hasMoreTokens()){
        list.add(st.nextToken());
        }

        for (int i = 0; i<list.size(); i++)
        {
            res[i] = list.get(i);
        }

        return res;
    }
}
