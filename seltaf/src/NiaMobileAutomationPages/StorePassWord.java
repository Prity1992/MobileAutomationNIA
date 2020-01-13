package NiaMobileAutomationPages;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class StorePassWord 
{
	public static String getPassWord() 
    {
        try 
        {
            String key = "Bar12345Bar12345";
            // Create key and cipher
            Key aesKey = new SecretKeySpec(key.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES");
            // encrypt the text
            cipher.init(Cipher.ENCRYPT_MODE, aesKey);

            // the encrypted String
            String enc = "[*?6:?*hrh`?";
            //System.out.println("encrypted:" + enc);

            // now convert the string to byte array
            // for decryption
            byte[] bb = new byte[enc.length()];
            for (int i=0; i<enc.length(); i++) {
                bb[i] = (byte) enc.charAt(i);
            }

            // decrypt the text
            cipher.init(Cipher.DECRYPT_MODE, aesKey);
            String decrypted = new String(cipher.doFinal(bb));
            
            return decrypted;

        }
        catch(Exception e) 
        {
            e.printStackTrace();
        }
		return null;
    }
}
