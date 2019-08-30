import java.lang.*;

public class Practice01MathIterative implements Practice01Math {
    public int fact (int n) throws Exception {
        if (n<0) {
            throw new Exception();
        }
        int sum = 1;
        for (int i=1;i<=n;i++) {
            sum *= i;
        }
        return sum;
    }

    public int fib (int n) throws Exception {
        if (n<0) {
            throw new Exception();
        } else if (n==0 || n==1) {
            return n;
        } else {
            int fib_one = 0;
            int fib_two = 1;
            int num = 0;
            for (int i=1; i < n ;i++) {                
                num = fib_one + fib_two;
                fib_one = fib_two;
                fib_two = num;
            }
            return num;
        }
    }
}