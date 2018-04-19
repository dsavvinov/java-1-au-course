package ru.spbau.mit;

import org.junit.Assert;
import org.junit.Test;
import ru.spbau.mit.v2.MessageV2;

import java.io.IOException;

import static ru.spbau.mit.Utils.*;

public class VersionTwoTest extends AbstractTestWithFile {
    @Test
    public void testBasic() throws IOException {
        MessageV2 message = createMessageV2("Some test string\nand even multiline\nи даже с UTF-символами", 42);

        getMessageSerializerV2().writeToFile(message, file);
        MessageV2 deserializedMessage = getMessageSerializerV2().readFromFile(file);

        Assert.assertEquals(message.getText(), deserializedMessage.getText());
        Assert.assertEquals(message.getInt(), deserializedMessage.getInt());
    }
}
