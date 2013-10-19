package com.barrybecker4.ca.dj.jigo.sgf;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Barry Becker
 */
public class PointTest  {

    /** instance under test. */
    private Point point;


    @Before
    public void setUp() {
        point = new Point(2, 3);
    }

    @Test
    public void testDefaultConstruction() {
        point = new Point();
        verify(0, 0);
    }

    @Test
    public void testNormalConstruction() {
        point = new Point(2, 3);
        verify(2, 3);
    }

    @Test
    public void testCopyConstruction() {
        point = new Point(new Point(4, 3));
        verify(4, 3);
    }

    private void verify(int expX, int expY) {
        assertEquals("Unexpected x coord", expX, point.x);
        assertEquals("Unexpected y coord", expY, point.y);
    }
}

