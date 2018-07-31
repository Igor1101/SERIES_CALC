import java.util.Scanner;
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
                Calc c = new Calc(20);
                for(double i=0; i < 50 ; i++)
                        c.train_neu(i, i*i);
                System.out.println(c.calculate(3));
        }
}
