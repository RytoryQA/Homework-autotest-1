package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;


public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();


    @Test

    public void remainIfLessBoundary() {

        Assert.assertEquals(service.remain(900), 100);
    }

    @Test

    public void remainIfMoreBoundary() {

        Assert.assertEquals(service.remain(1800), 200);
    }

    @Test

    public void remainIfEqualBoundary() {

        Assert.assertEquals(service.remain(1_000), 0);
    }

    @Test
    public void remainIfMultiplyThreeBoundary() {

        Assert.assertEquals(service.remain(3_000), 0);
    }

    @Test
    public void remainIfAmountNull() {

        Assert.assertEquals(service.remain(0), 1_000);

    }

}
