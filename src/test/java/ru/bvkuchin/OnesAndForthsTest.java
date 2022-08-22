package ru.bvkuchin;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OnesAndForthsTest {

    OnesAndForths onesAndForths;

    @BeforeEach
    void init() {
        onesAndForths = new OnesAndForths();
    }

    @Test
    void trueTests(){

        Assertions.assertTrue(onesAndForths.checkArray(new Integer[]{1, 2, 3, 4, 5}));
        Assertions.assertTrue(onesAndForths.checkArray(new Integer[]{1,4}));
        Assertions.assertTrue(onesAndForths.checkArray(new Integer[]{4,1}));
        Assertions.assertTrue(onesAndForths.checkArray(new Integer[]{4,4,4,4,1,1,1,1,1}));

    }

    @Test
    void falseTests() {
        Assertions.assertFalse(onesAndForths.checkArray(new Integer[]{1, 2, 3, 3, 5}));
        Assertions.assertFalse(onesAndForths.checkArray(new Integer[]{2, 2, 3, 3, 5}));
        Assertions.assertFalse(onesAndForths.checkArray(new Integer[]{}));
        Assertions.assertFalse(onesAndForths.checkArray(new Integer[]{4}));
        Assertions.assertFalse(onesAndForths.checkArray(new Integer[]{1}));
    }
}