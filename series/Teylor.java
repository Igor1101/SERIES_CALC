package  series;
import mathutil.*;
public class Teylor
{
        private double x0;

        private double f_derivatives[];

        public double f(double x)
        {
                double result = 0;
                for(int i = 0; i < f_derivatives.length; i++) {
                        result += f_derivatives[i] / 
                                MathUtil.factorial(i) * (x - x0);
                }

                return result;
        }
        
        public void set_x0(double x0)
        {
                this.x0 = x0;
        }

        public Teylor(int der_number, double x0)
        {
                this.x0 = x0;
                f_derivatives = new double [der_number];
        }

        public Teylor()
        {
                this.x0 = 0;
        }

        public double[] get_derivatives()
        {
                return f_derivatives;
        }

        public void set_derivatives(double[] ders)
        {
                f_derivatives = ders.clone();
        }

        /**
         * public boolean set_derivative(double der, int num)
         * @der : derivative value
         * @num : derivative number
         * @return: true if set, false if out of bounds
         */
        public boolean set_derivative(double der, int num)
        {
                if (f_derivatives.length <= num)
                        return false;
                f_derivatives[num] = der;
                return true;
        }
        public void verify_all()
        {
                /* Clear all, Switch to Maclaurine, get E */
                x0 = 0;
                set_derivatives(new double[]{1,1,1,1,1,1,1,1,1,1,1,1});
                System.out.printf("our E = %f", f(1));
                assert (int)Math.E == (int)f(1);
        }
}
