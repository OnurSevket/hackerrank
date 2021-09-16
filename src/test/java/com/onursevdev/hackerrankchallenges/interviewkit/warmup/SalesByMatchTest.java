package com.onursevdev.hackerrankchallenges.interviewkit.warmup;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * SalesByMatch Tester.
 *
 * @author OnurSevDev
 * @version 1.0
 * @since <pre>Eyl 16, 2021</pre>
 */
@SpringBootTest
public class SalesByMatchTest {

    private SalesByMatch salesByMatch;

    @Before
    public void before() {
        salesByMatch = new SalesByMatch();
    }

    @Test
    public void SalesByMatch_GetSocksCount() {

        List<Integer> oddSocksArraySample1 = Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20);
        int singleSocksCountSample1 = 9;

        List<Integer> oddSocksArraySample2 = Arrays.asList(1, 1, 3, 1, 2, 1, 3, 3, 3, 3);
        int singleSocksCountSample2 = 10;

        List<Integer> oddSocksArraySample3 = Arrays.asList(42 ,42 ,42 ,42 ,42 ,42 ,42 ,42 ,42, 42);
        int singleSocksCountSample3 = 10;

        int result1 = salesByMatch.getSocksPairCount(singleSocksCountSample1, oddSocksArraySample1);

        Assert.assertEquals(result1, 3);

        int result2 = salesByMatch.getSocksPairCount(singleSocksCountSample2, oddSocksArraySample2);

        Assert.assertEquals(result2, 4);

        int result3 = salesByMatch.getSocksPairCount(singleSocksCountSample3, oddSocksArraySample3);

        Assert.assertEquals(5,result3 );
    }

} 
