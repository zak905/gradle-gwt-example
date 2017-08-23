package com.example;

import com.google.gwt.junit.client.GWTTestCase;

/**
 * Created by zakaria on 8/23/2017.
 */
public class MyTest extends GWTTestCase {

    @Override
    public String getModuleName() {
        return "com.example.gwtmodulenametest";
    }

    public void testDummy(){
        assertEquals("test", "test");
    }
}
