package com.clc;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
public class CalculatorTest {
    @Test
    public void add1(){
        final int result = new Calculator().add(2, 3);
        assertThat(result, is(5));
    }
    @Test
    public void add2(){
        final int result = new Calculator().add(2, 0);
        assertThat(result, is(2));
    }
    @Test
    public void subtract1(){
        final int result = new Calculator().subtract(3, 2);
        assertThat(result, is(1));
    }
    @Test
    public void multiply1(){
        final int result = new Calculator().multiply(3, 3);
        assertThat(result, is(9));
    }
    @Test
    public void divide1(){
        final int result = new Calculator().divide(9, 3);
        assertThat(result, is(3));
}
}