package ru.spbau.mit.testData.task3;

import ru.spbau.mit.task3.solution.MapWith;
import ru.spbau.mit.testData.task1.Simple;

public class ClassWithCustomTypeMapper {
    public int i = 42;

    public String shouldBeMappedNormally = "Should be mapped normally";

    @MapWith(mapperClass = CustomTypeMapper.class)
    public String shouldBeMappedByCustomMapper = "ERROR: IT SHOULD BE MAPPED BY CUSTOM TYPE MAPPER";

    @MapWith(mapperClass = CustomTypeMapper.class)
    public Simple alsoByMapper = new Simple();
}
