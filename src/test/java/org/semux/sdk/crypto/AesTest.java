package org.semux.sdk.crypto;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;
import org.semux.sdk.exception.CryptoException;
import org.semux.sdk.util.Bytes;

public class AesTest {
    private static final byte[] raw = Bytes.of("test");
    private static final byte[] key = Hex.decode("1122334455667788112233445566778811223344556677881122334455667788");
    private static final byte[] iv = Hex.decode("11223344556677881122334455667788");
    private static final byte[] encrypted = Hex.decode("182b93aa58d6291381660e5bad673dd4");

    @Test
    public void testEncrypt() throws CryptoException {
        byte[] bytes = Aes.encrypt(raw, key, iv);

        assertArrayEquals(encrypted, bytes);
    }

    @Test
    public void testDecrypt() throws CryptoException {
        byte[] bytes = Aes.decrypt(encrypted, key, iv);

        assertArrayEquals(raw, bytes);
    }
}
