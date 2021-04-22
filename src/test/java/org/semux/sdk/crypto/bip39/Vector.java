package org.semux.sdk.crypto.bip39;

public class Vector {

    private final byte[] entropy;
    private final String mnemonic;
    private final String seed;
    private final String hdKey;
    private final String passphrase;

    public Vector(byte[] entropy, String mnemonic, String seed, String hdKey, String passphrase) {
        this.entropy = entropy;
        this.mnemonic = mnemonic;
        this.seed = seed;
        this.hdKey = hdKey;
        this.passphrase = passphrase;
    }

    public byte[] getEntropy() {
        return entropy;
    }

    public String getMnemonic() {
        return mnemonic;
    }

    public String getSeed() {
        return seed;
    }

    public String getHdKey() {
        return hdKey;
    }

    public String getPassphrase() {
        return passphrase;
    }
}
