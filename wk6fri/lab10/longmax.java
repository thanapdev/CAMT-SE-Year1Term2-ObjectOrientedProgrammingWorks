//thanapong yamkamol
//642115022

package lab10;
import java.math.BigInteger;

public class longmax {
    public static void main(String[] args) {
        BigInteger bi = new BigInteger(Long.MAX_VALUE + "");

        int count = 0;

        while (count <= 10) {
            bi = bi.add(BigInteger.ONE);
            if (bi.remainder(new BigInteger("5")).equals(BigInteger.ZERO) || bi.remainder(new BigInteger("6")).equals(BigInteger.ZERO)) {
                System.out.println(bi);
                count++;
            }

        }
    }
}
