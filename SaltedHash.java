import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.Arrays;
import java.util.Scanner;
import java.security.SecureRandom;

public class SaltedHash{
    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeySpecException {
        Scanner in = new Scanner(System.in);
        String password = in.next();
        byte[] salt = new byte[16];
        setSalt(salt);

        /*
        The iteration count is the number of times that the password
        is hashed during the derivation of the symmetric key. The higher number,
        the more difficult it is to validate a password guess and then derive the correct key.
        It is used together with the salt which is used to prevent against attacks using rainbow tables.
        The iteration count should be as high as possible, without slowing your own system down too much.
        A more generic term for iteration count is work factor.

        The key length is the length in bits of the derived symmetric key. A DESede key can be either 128
        or 192 bits long, including parity bits. An AES key can be 128, 192 or 256 bits long.
         */
        KeySpec spec = new PBEKeySpec(password.toCharArray(),salt,654321,128);
        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        byte[] hash = factory.generateSecret(spec).getEncoded();

        System.out.println(Arrays.toString(hash));
    }

    public static void setSalt(byte[] salt){
        SecureRandom random = new SecureRandom();
        random.nextBytes(salt);
    }

}