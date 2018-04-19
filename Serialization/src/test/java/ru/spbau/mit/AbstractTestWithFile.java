package ru.spbau.mit;

import org.junit.After;
import org.junit.Before;

import java.io.File;
import java.io.IOException;

public class AbstractTestWithFile {
    protected File file;

    @Before
    public void setUp() throws IOException {
        file = File.createTempFile("serialization-tests", null);
    }

    @After
    public void tearDown() throws IOException {
        file.delete();
    }
}
