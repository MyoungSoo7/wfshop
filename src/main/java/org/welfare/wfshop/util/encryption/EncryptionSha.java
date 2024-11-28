package org.welfare.wfshop.util.encryption;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;

public class EncryptionSha {
    private static final String SHA_512 = "SHA-512";

    public static String encryptString(String input) {
        try {
            MessageDigest digest = getInitializedDigest(input);
            return formatDigest(digest);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static MessageDigest getInitializedDigest(String input) throws Exception {
        MessageDigest digest = MessageDigest.getInstance(SHA_512);
        digest.reset();
        digest.update(input.getBytes(StandardCharsets.UTF_8));
        return digest;
    }

    private static String formatDigest(MessageDigest digest) {
        return String.format("%0128x", new BigInteger(1, digest.digest()));
    }
}