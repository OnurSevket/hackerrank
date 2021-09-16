package com.onursevdev.hackerrankchallenges.interviewkit.warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SalesByMatch {
    public int getSocksPairCount(int singleSocksCount, List<Integer> singleSocksArray) {
        int sockCount = 0;

        ArrayList<Integer> arrayList = new ArrayList<>(singleSocksArray);

        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 1; j < arrayList.size(); j++) {
                outerLoop:
                if (i <= singleSocksCount && arrayList.get(i) == arrayList.get(j)) {
                    sockCount++;
                    arrayList.remove(i);
                    arrayList.remove(j);
                    i = 0;
                    j = 0;
                    break outerLoop;
                }
            }
        }
        return sockCount;
    }
}
