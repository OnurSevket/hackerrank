package com.onursevdev.hackerrankchallenges.interviewkit.warmup;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
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
    public void before() throws Exception {
        salesByMatch = new SalesByMatch();
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void SalesByMatch_GetSocksCount() {

        List<Integer> singleSocksArray = Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20);
        int singleSocksCount = 9;


        int result=salesByMatch.getSocksPairCount(singleSocksCount,singleSocksArray);

        Assert.assertEquals(result,3);
    }

} 
