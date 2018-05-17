package ru.spbau.mit.testData.task2;

import ru.spbau.mit.task2.solution.Ignore;
import ru.spbau.mit.testData.task1.Simple;

public class ClassWithIgnoredField {
    public int i = 42;
    public Simple simple = new Simple();

    @Ignore
    private String ignored = "Should be ignored";
}
