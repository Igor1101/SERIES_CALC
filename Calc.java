import series.*;
import java.util.Random;
import java.time.Instant;
public class Calc extends Maclaurin
{
        private int neu_pointer = 0;

        public Calc(int amount_of_neurons)
        {
                super(amount_of_neurons);
                Random rnd = new Random(Instant.now().getEpochSecond());
                for(int i = 0; i < get_derivatives().length; i++) {
                        get_derivatives()[i] = rnd.nextDouble();
                }
        }

        public double calculate(double x)
        {
                return f(x);
        }
        
        public double[] get_neurons()
        {
                return get_derivatives();
        }

        public void train_neu(double x, double y)
        {
                double neu_y = f(x);
                if(neu_y > y) {
                        get_neurons()[neu_pointer] /= 2;
                } else {
                        get_neurons()[neu_pointer] *= 2;
                }
                if(neu_y - y <= 1)
                        neu_pointer += 1;
                if(neu_pointer >=get_neurons().length)
                        neu_pointer = 0;
        }
}
