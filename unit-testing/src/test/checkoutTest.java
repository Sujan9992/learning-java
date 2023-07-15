package src.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import src.main.Main;

public class checkoutTest{
    @Test
    public void subTotalisValid(){
        assertEquals(19.2, Main.getSubTotal());
    }
    @Test
    public void isTaxValid(){
        assertEquals(3.9, Main.getTax(30));
    }
}
