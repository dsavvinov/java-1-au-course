package ru.spbau.mit.v2;

import ru.spbau.mit.v1.MessageV1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface MessageSerializerV2 {
    /**
     * Serializes message to 'destination'
     */
    void writeToFile(MessageV2 message, File destination) throws IOException;

    /**
     * Deserializes MessageV1 from 'source'
     */
    MessageV2 readFromFile(File source) throws IOException;
}
