package org.semux.sdk.crypto.bip39;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.semux.sdk.crypto.Hex;
import org.semux.sdk.crypto.bip32.Base58;
import org.semux.sdk.crypto.bip32.CoinType;
import org.semux.sdk.crypto.bip32.HdKeyGenerator;
import org.semux.sdk.crypto.bip32.HdKeyPair;
import org.semux.sdk.crypto.bip32.key.KeyVersion;

public class VectorTest {

    @Test
    public void testVectors() throws IOException {
        MnemonicGenerator generator = new MnemonicGenerator();

        VectorReader reader = new VectorReader();
        Map<String, List<Vector>> vectorSets = reader.getVectors();
        HdKeyGenerator keyGenerator = new HdKeyGenerator();

        String defaultPassword = "TREZOR";
        for (String language : vectorSets.keySet()) {
            List<Vector> vectors = vectorSets.get(language);
            Language lang = Language.valueOf(language.toUpperCase());
            for (Vector vector : vectors) {
                String password = vector.getPassphrase() == null ? defaultPassword : vector.getPassphrase();
                String words = generator.getWordlist(vector.getEntropy(), lang);
                assertEquals(vector.getMnemonic(), words);
                byte[] seed = generator.getSeedFromWordlist(words, password, lang);
                assertEquals(vector.getSeed(), Hex.encode(seed));
                HdKeyPair key = keyGenerator.getMasterKeyPairFromSeed(seed, KeyVersion.MAINNET, CoinType.BITCOIN);
                assertEquals(vector.getHdKey(), Base58.encode(key.getPrivateKey().getKey()));
            }
        }
    }
}
