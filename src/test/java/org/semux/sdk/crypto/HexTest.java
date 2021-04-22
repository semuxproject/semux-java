package org.semux.sdk.crypto;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.semux.sdk.exception.CryptoException;

public class HexTest {

    @Test
    public void testToHex() {
        byte[] raw = { 0x0f, (byte) 0xf0, 0x52, 0x25 };
        String hex = Hex.encode(raw);

        assertEquals("0ff05225", hex);
    }

    @Test
    public void testToBytes() {
        String hex = "0Ff05225";
        byte[] raw = Hex.decode(hex);

        assertArrayEquals(new byte[] { 0x0f, (byte) 0xf0, 0x52, 0x25 }, raw);
    }

    @Test
    public void testDecodeError() {
        assertThrows(CryptoException.class, () -> {
            Hex.decode("I_am_not_a_hexadecimal_string");
        });
    }

    @Test
    public void testEncode() {
        String message = "Hello World";
        assertEquals("48656c6c6f20576f726c64", Hex.encode(message.getBytes()));
    }

    @Test
    public void testEncode0x() {
        String message = "Hello World";
        assertEquals("0x48656c6c6f20576f726c64", Hex.encode0x(message.getBytes()));
    }

    @Test
    public void testParse() {
        String encoded = "48656c6c6f20576f726c64";
        assertEquals("Hello World", new String(Hex.decode0x(encoded)));
    }

    @Test
    public void testParse0x() {
        String encoded = "0x48656c6c6f20576f726c64";
        assertEquals("Hello World", new String(Hex.decode0x(encoded)));
    }
}
