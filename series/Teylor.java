package  series;
import mathutil.*;
class Teylor
{
        private double x0;
        private double f_derivatives[];

        public double f(double x)
        {
                double result = 0;
                for(int i = 0; i < f_derivatives.length; i++) {
                        result += f_derivatives[i] / MathUtil.factorial(i) * (x - x0);
                }

                return result;
        }
        
        public set_x0(double x0)
        {
                x0 = x0;
        }

        public 

        public double[] get_derivatives()
        {
                return f_derivatives;
        }
}
