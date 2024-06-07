/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Yoga Elfaraby
 */
import static org.junit.Assert.*;
import org.junit.Test;

public class SumTest {

    @Test
    public void testAdd() {
        Sum sum = new Sum();
        assertEquals(15, sum.add(5, 10));
        assertEquals(0, sum.add(-5, 5));
        assertEquals(-15, sum.add(-10, -5));
    }
}