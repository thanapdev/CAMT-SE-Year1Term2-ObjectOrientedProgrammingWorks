//642115022
//thanapong yamkamol

package lab7_1;

public class MyInteger {
    public int value;

    public MyInteger(int value) {
        this.value = value;

    }

    public boolean isEven() {
        boolean ans;
        ans = (this.value % 2 == 0) ? true : false;
        return ans;
    }

    public boolean isOdd() {
        boolean ans;
        ans = (this.value % 2 != 0) ? true : false;
        return ans;
    }

    public boolean isPrime() {
        if (this.value <= 1)
            return false;
        for (int i = 2; i < this.value; i++)
            if (this.value % i == 0)
                return false;

        return true;
    }

    public static boolean isEven(int valuein) {
        boolean ans;
        ans = (valuein % 2 == 0) ? true : false;
        return ans;
    }

    public static boolean isOdd(int valuein) {
        boolean ans;
        ans = (valuein % 2 != 0) ? true : false;
        return ans;
    }

    public static boolean isPrime(int valuein) {
        if (valuein <= 1)
            return false;
        for (int i = 2; i < valuein; i++)
            if (valuein % i == 0)
                return false;

        return true;
    }

    public int getVal() {
        return this.value;
    }

    public boolean equals(MyInteger n2) {
        boolean ans;
        ans = (this.value == n2.getVal()) ? true : false;
        return ans;
    }

    public boolean equals(int n2) {
        boolean ans;
        ans = (this.value == n2) ? true : false;
        return ans;
    }

}
