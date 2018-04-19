package ru.spbau.mit.v1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface MessageSerializerV1 {
    /**
     * Serializes message to 'destination'
     */
    void writeToFile(MessageV1 message, File destination) throws IOException;

    /**
     * Deserializes MessageV1 from 'source'
     */
    MessageV1 readFromFile(File source) throws IOException;
}
