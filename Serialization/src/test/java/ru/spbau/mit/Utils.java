package ru.spbau.mit;

import ru.spbau.mit.v1.MessageSerializerV1;
import ru.spbau.mit.v1.MessageV1;
import ru.spbau.mit.v2.MessageSerializerV2;
import ru.spbau.mit.v2.MessageV2;

public class Utils {
    public static MessageSerializerV1 getMessageSerializerV1() {
        throw new UnsupportedOperationException("Implement me!");
    }

    public static MessageSerializerV2 getMessageSerializerV2() {
        throw new UnsupportedOperationException("Implement me!");
    }

    public static MessageV1 createMessageV1(String text) {
        throw new UnsupportedOperationException("Implement me!");
    }

    public static MessageV2 createMessageV2(String text, int number) {
        throw new UnsupportedOperationException("Implement me!");
    }
}
