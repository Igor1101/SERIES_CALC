package mathutil;
public class MathUtil
{
        public static long factorial(int N)
        {
                long multi = 1;
                for(int i = 1; i <= N; i++) {
                        multi *= i;
                }
                return multi;
        }
        public static void verify_all()
        {
                assert factorial(0) == 1;
                assert factorial(1) == 1;
                assert factorial(4) == 24;
        }
}
