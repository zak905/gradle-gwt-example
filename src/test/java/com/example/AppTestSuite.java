package com.example;

import com.google.gwt.junit.tools.GWTTestSuite;
import junit.framework.TestSuite;

public class AppTestSuite extends GWTTestSuite {


    public static TestSuite suite() {
        TestSuite suite = new TestSuite("app tests");
        suite.addTestSuite(MyTest.class);

        return suite;
    }

}
