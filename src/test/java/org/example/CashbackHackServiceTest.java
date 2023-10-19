package org.example;


import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();


    @Test

    public void remainIfLessBoundary() {

        Assert.assertEquals(100, service.remain(900));
    }

    @Test

    public void remainIfMoreBoundary() {

        Assert.assertEquals(200, service.remain(1800));
    }

    @Test

    public void remainIfEqualBoundary() {

        Assert.assertEquals(0, service.remain(1_000));
    }

    @Test
    public void remainIfMultiplyThreeBoundary() {

        Assert.assertEquals(0, service.remain(3_000));
    }

    @Test
    public void remainIfAmountNull() {

        Assert.assertEquals(1_000, service.remain(0));

    }

}
