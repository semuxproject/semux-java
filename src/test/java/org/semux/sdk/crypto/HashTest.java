package org.semux.sdk.crypto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.semux.sdk.util.Bytes;

public class HashTest {

    private static final String msg = "test";
    private static final String msgBlake2b = "928b20366943e2afd11ebc0eae2e53a93bf177a4fcf35bcc64d503704e65e202";
    private static final String msgH160 = "86e8402b7615f07a2acb2ef1f4a54d323bbede77";

    @Test
    public void testEmptyHash() {
        byte[] x = new byte[0];
        byte[] hash = Hash.h256(x);

        Hex.encode(hash);
    }

    @Test
    public void testH256() {
        byte[] raw = Bytes.of(msg);
        byte[] hash = Hash.h256(raw);

        assertEquals(msgBlake2b, Hex.encode(hash));
    }

    @Test
    public void testH256Merge() {
        byte[] raw1 = Bytes.of(msg.substring(0, 1));
        byte[] raw2 = Bytes.of(msg.substring(1));
        byte[] hash = Hash.h256(raw1, raw2);

        assertEquals(msgBlake2b, Hex.encode(hash));
    }

    @Test
    public void testH160() {
        byte[] raw = Bytes.of(msg);
        byte[] hash = Hash.h160(raw);

        assertEquals(msgH160, Hex.encode(hash));
        assertEquals(20, hash.length);
    }
}
