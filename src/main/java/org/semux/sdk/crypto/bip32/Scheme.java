package org.semux.sdk.crypto.bip32;

public enum Scheme {
    /**
     * Reference: https://github.com/bitcoin/bips/blob/master/bip-0032.mediawiki
     */
    BIP32("Bitcoin seed"),

    /**
     * Reference: https://github.com/satoshilabs/slips/blob/master/slip-0010.md
     */
    SLIP10_ED25519("ed25519 seed"),

    /**
     * Reference: https://cardanolaunch.com/assets/Ed25519_BIP.pdf
     * <p>
     * Implementation:
     * https://github.com/LedgerHQ/orakolo/blob/master/src/python/orakolo/HDEd25519.py
     */
    BIP32_ED25519("ed25519 seed");

    private final String seed;

    Scheme(String seed) {
        this.seed = seed;
    }

    public String getSeed() {
        return seed;
    }
}
