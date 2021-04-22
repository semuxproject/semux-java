package org.semux.sdk.util;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class SimpleEncoderTest {

    @Test
    public void testToAppend() {
        byte[] append = Bytes.of("hello");

        SimpleEncoder enc = new SimpleEncoder(append);
        enc.writeString("s");

        assertArrayEquals(enc.toBytes(), Bytes.merge(append, Bytes.of((byte) 1), Bytes.of("s")));
    }
}
