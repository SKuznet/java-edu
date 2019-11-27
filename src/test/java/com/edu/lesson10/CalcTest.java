package com.edu.lesson10;

import org.junit.*;

public class CalcTest {
    private static int count = 0;

    @BeforeClass
    public static void globalInit(){

    }

    @AfterClass
    public static void globalCleanUp(){

    }

    @Before
    public void init(){
        ++count;
    }
    @After
    public void cleanUp(){

    }

    @Test
    public void testSum(){
        Assert.assertEquals(1, count);
    }

    @Test
    public void testSum2(){
        Assert.assertEquals(2, count);
    }

    @Test
    public void testSum3(){
        Assert.assertEquals(3, count);
    }

    @Test
    public void testSum4(){
        Assert.assertEquals(4, count);
    }

    @Test
    public void testSum5(){
        Assert.assertEquals(5, count);
    }

    @Test
    public void testSum6(){
        Assert.assertEquals(6, count);
    }

    @Test
    public void testSum7(){
        Assert.assertEquals(7, count);
    }

    @Test
    public void testSum8(){
        Assert.assertEquals(8, count);
    }

    @Test
    public void testSum9(){
        Assert.assertEquals(9, count);
    }

    @Test
    public void testSum10(){
        Assert.assertEquals(10, count);
    }

    @Test
    public void testSum11(){
        Assert.assertEquals(11, count);
    }

    @Test
    public void testSum12(){
        Assert.assertEquals(12, count);
    }
}
