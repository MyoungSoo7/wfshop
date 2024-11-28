package org.welfare.wfshop.util.encryption;

import lombok.extern.slf4j.Slf4j;

import javax.crypto.Cipher;
import java.nio.charset.StandardCharsets;
import java.security.PrivateKey;

@Slf4j
public class RSAUtil {

    private final PrivateKey privateKey;

    public RSAUtil(PrivateKey privateKey) {
        this.privateKey = privateKey;
    }

    public String decrypt(String securedValue) {
        String decryptedText = "";
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
            byte[] encryptedBytes = hexToByteArray(securedValue);
            cipher.init(Cipher.DECRYPT_MODE, privateKey);
            byte[] decryptedBytes = cipher.doFinal(encryptedBytes);
            decryptedText = new String(decryptedBytes, StandardCharsets.UTF_8);
        } catch (Exception e) {
            log.error("Decrypt Exception Error: {}", e.getMessage());
        }
        return decryptedText;
    }

    public static byte[] hexToByteArray(String hex) {
        if (hex == null || hex.length() % 2 != 0) {
            return new byte[]{};
        }
        byte[] bytes = new byte[hex.length() / 2];
        for (int i = 0; i < hex.length(); i += 2) {
            byte value = (byte) Integer.parseInt(hex.substring(i, i + 2), 16);
            bytes[i / 2] = value;
        }
        return bytes;
    }
}
