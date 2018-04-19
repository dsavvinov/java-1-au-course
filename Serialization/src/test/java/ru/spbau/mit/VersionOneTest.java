package ru.spbau.mit;

import org.junit.Assert;
import org.junit.Test;
import ru.spbau.mit.v1.MessageV1;

import java.io.IOException;

import static ru.spbau.mit.Utils.*;

public class VersionOneTest extends AbstractTestWithFile {

    @Test
    public void testBasic() throws IOException {
        MessageV1 message = createMessageV1("Some test string\nand even multiline\nи даже с UTF-символами");
        getMessageSerializerV1().writeToFile(message, file);

        MessageV1 deserializedMessage = getMessageSerializerV1().readFromFile(file);

        Assert.assertEquals(message.getText(), deserializedMessage.getText());
    }
}
