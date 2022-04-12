//thanapong yamkamol
//642115022

package lab10;

import java.math.BigInteger;
/**
 * bignum
 */
public class bignum {

    public static void main(String[] args) {
        BigInteger bi = new BigInteger("10000000000000000000000000000000000000000000000000");

        int count = 0;

        while (count <= 10) {
            bi = bi.add(BigInteger.ONE);
            if (bi.remainder(new BigInteger("2")).equals(BigInteger.ZERO) || bi.remainder(new BigInteger("3")).equals(BigInteger.ZERO)) {
                System.out.println(bi);
                count++;
            }
        }
    }
}