package com.onursevdev.hackerrankchallenges.interviewkit.warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SalesByMatch {
    public int getSocksPairCount(int singleSocksCount, List<Integer> singleSocksList) {
        int pairSocks = 0;

        ArrayList<Integer> arrayList = new ArrayList<>(singleSocksList);

        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(i) == arrayList.get(j)) {
                    pairSocks++;
                    arrayList.remove(j);
                    arrayList.remove(i);
                    i = j = 0;
                }
            }
        }
        return pairSocks;
    }
}
