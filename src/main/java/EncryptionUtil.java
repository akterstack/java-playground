import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class EncryptionUtil {

    private static final String ALGO = "AES";
    private static final String ALGO_PAD = "AES/CBC/PKCS5PADDING";

    public static void main(String[] args) throws Exception {
        String encStr = encrypt("Csdfgdfgslear", "Hash");
        System.out.println(encStr);
        String dycStr = decrypt(encStr, "Hash");
        System.out.println(dycStr);
    }

    public static String encrypt(String strClearText, String strKey) throws Exception {
        String strData = "";

        try {
            SecretKeySpec skeyspec = new SecretKeySpec(strKey.getBytes(), ALGO);
            Cipher cipher = Cipher.getInstance(ALGO_PAD);
            cipher.init(Cipher.ENCRYPT_MODE, skeyspec);
            byte[] encrypted = cipher.doFinal(strClearText.getBytes("UTF8"));
            strData = new sun.misc.BASE64Encoder().encode(encrypted);
        } catch(Exception e) {
            e.printStackTrace();
            throw new Exception(e);
        }
        return strData;
    }

    public static String decrypt(String strEncrypted, String strKey) throws Exception {
        String strData = "";
        try {
            SecretKeySpec skeyspec = new SecretKeySpec(strKey.getBytes(), ALGO);
            Cipher cipher = Cipher.getInstance(ALGO_PAD);
            cipher.init(Cipher.DECRYPT_MODE, skeyspec);
            byte[] decrypted = cipher.doFinal(strEncrypted.getBytes());
            strData = new String(decrypted);

        } catch(Exception e) {
            e.printStackTrace();
            throw new Exception(e);
        }
        return strData;
    }

}