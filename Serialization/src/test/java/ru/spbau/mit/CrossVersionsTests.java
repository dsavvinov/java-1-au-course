package ru.spbau.mit;

import org.junit.Test;
import ru.spbau.mit.v1.MessageV1;
import ru.spbau.mit.v2.MessageV2;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static ru.spbau.mit.Utils.*;

public class CrossVersionsTests extends AbstractTestWithFile {
    @Test
    public void testBackwardCompatibility() throws IOException {
        MessageV1 messageV1 = createMessageV1("Foo");
        getMessageSerializerV1().writeToFile(messageV1, file);

        MessageV2 deserializedAsV2 = getMessageSerializerV2().readFromFile(file);
        assertEquals(messageV1.getText(), deserializedAsV2.getText());

        deserializedAsV2.getInt();
    }

    @Test
    public void testForwardCompatibliity() throws IOException {
        MessageV2 messageV2 = createMessageV2("Foo", 42);
        getMessageSerializerV2().writeToFile(messageV2, file);

        MessageV1 deserializedAsV1 = getMessageSerializerV1().readFromFile(file);

        assertEquals(messageV2.getText(), deserializedAsV1.getText());
    }

    @Test
    public void oldSerializerDoesntLoseInformation() throws IOException {
        // Write new file
        MessageV2 messageV2 = createMessageV2("Foo", 42);
        getMessageSerializerV2().writeToFile(messageV2, file);

        // Deserialize-serialize as old
        MessageV1 deserializedAsV1 = getMessageSerializerV1().readFromFile(file);
        getMessageSerializerV1().writeToFile(deserializedAsV1, file);

        // Deserialize message which was written as old serializer
        MessageV2 wentThroughOldSerializer = getMessageSerializerV2().readFromFile(file);

        assertEquals(messageV2.getText(), wentThroughOldSerializer.getText());
        assertEquals(messageV2.getInt(), wentThroughOldSerializer.getInt());
    }

}
