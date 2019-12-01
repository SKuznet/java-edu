package com.edu.lesson10;

import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CalcTest {

    @Mock
    CalcService calcService;

    @InjectMocks
    Calc calc = new Calc(calcService);

    @BeforeClass
    public static void globalInit() {

    }

    @AfterClass
    public static void globalCleanUp() {

    }

    @Before
    public void init() {
        calc = new Calc(calcService);
    }

    @After
    public void cleanUp() {

    }

    @Test
    public void testSum() {
        Mockito.when(calc.sum(21.0, 30.0)).thenReturn(50.0);
        Assert.assertEquals(50.0, calc.sum(20, 30), 0);
    }


}
