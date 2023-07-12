package com.udacity.jwdnd.c1.review;

import org.springframework.stereotype.Component;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.Base64;

@Component
public class HashService {

    public String getHashedValue(String data, String salt){
        byte[] hashedValue = null;
        KeySpec keySpec = new PBEKeySpec(data.toCharArray(),
                            salt.getBytes(), 5000, 128);
        try{
            SecretKeyFactory secretKeyFactory =
                            SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            hashedValue = secretKeyFactory.generateSecret(keySpec).getEncoded();
        }catch (InvalidKeySpecException | NoSuchAlgorithmException e){
            e.printStackTrace();
        }

        return Base64.getEncoder().encodeToString(hashedValue);
    }
}
