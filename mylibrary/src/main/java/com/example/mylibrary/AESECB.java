package com.example.mylibrary;
import java.security.*;
import javax.crypto.*;
import javax.crypto.spec.*;

public class AESECB
{
    public KeyGenerator keygenerator;
    public SecretKey myDesKey;
    Cipher c;
    public AESECB() throws Exception
    {



        // Genrate the Key
        keygenerator = KeyGenerator.getInstance("AES");
        myDesKey = keygenerator.generateKey();

        // Create the cipher
        c = Cipher.getInstance("AES/ECB/PKCS5Padding");


    }
    public byte[] doEncryption(String s) throws Exception
    {

        // Initialize the cipher for encryption
        c.init(Cipher.ENCRYPT_MODE, myDesKey);

        //sensitive information
        byte[] text = s.getBytes();

        // Encrypt the text
        byte[] textEncrypted = c.doFinal(text);

        return(textEncrypted);

    }
    public String doDecryption(byte[] s)throws Exception
    {

        // Initialize the same cipher for decryption
        c.init(Cipher.DECRYPT_MODE, myDesKey);


        // Decrypt the text
        byte[] textDecrypted = c.doFinal(s);


        return(new String(textDecrypted));
    }
}
