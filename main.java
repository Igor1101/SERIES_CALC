import mathutil.MathUtil;
import series.*;
class main
{
        public static void main(String args[])
        {
                /* Verify logic */
                MathUtil.verify_all();
                Teylor ver = new series.Teylor();
                ver.verify_all();
        }
}
