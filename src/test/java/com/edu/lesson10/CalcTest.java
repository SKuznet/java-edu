package com.edu.lesson10;

import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class CalcTest {

    @Mock
    CalcService calcService;

    @InjectMocks
    Calc calc = new Calc(calcService);


    @Test
    public void testSum() {

        //1
        when(calc.sum(20.0, 30.0)).thenReturn(50.0);
        assertEquals(50.0, calc.sum(20, 30), 0);
        verify(calcService).sum(20, 30);
        //2
        doReturn(15.0).when(calcService).sum(10.0, 5.0);
        assertEquals(15.0, calcService.sum(10.0, 5.0), 0);
        verify(calcService).sum(10.0, 5.0);
    }

    @Test(expected = RuntimeException.class)
    public void testSumWithException(){
        when(calcService.divide(15.0,3.0)).thenReturn(5.0);

        assertEquals(5.0, calcService.divide(15.0, 3), 0);

        RuntimeException exception = new RuntimeException("can't divide by zero");
        doThrow(exception).when(calcService).divide(15.0, 0);
        assertEquals(calcService.divide(15.0, 0.0), 0);
    }


}
