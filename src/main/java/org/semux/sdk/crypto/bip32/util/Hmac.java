package org.semux.sdk.crypto.bip32.util;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.semux.sdk.exception.CryptoException;

/**
 * Utility class for Hmac SHA-512
 */
public class Hmac {

    private static final String HMAC_SHA256 = "HmacSHA256";
    private static final String HMAC_SHA512 = "HmacSHA512";

    /**
     * Returns the HmacSHA512 digest.
     *
     * @param message message
     * @param secret  secret
     * @return a digest
     */
    public static byte[] hmac256(byte[] message, byte[] secret) {
        try {
            Mac mac = Mac.getInstance(HMAC_SHA256);
            SecretKeySpec keySpec = new SecretKeySpec(secret, HMAC_SHA256);
            mac.init(keySpec);
            return mac.doFinal(message);
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            throw new CryptoException("Unable to perform HmacSHA256.", e);
        }
    }

    /**
     * Returns the HmacSHA512 digest.
     *
     * @param message message
     * @param secret  secret
     * @return a digest
     */
    public static byte[] hmac512(byte[] message, byte[] secret) {
        try {
            Mac mac = Mac.getInstance(HMAC_SHA512);
            SecretKeySpec keySpec = new SecretKeySpec(secret, HMAC_SHA512);
            mac.init(keySpec);
            return mac.doFinal(message);
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            throw new CryptoException("Unable to perform HmacSHA512.", e);
        }
    }
}
