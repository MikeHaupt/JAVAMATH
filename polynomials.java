import com.mhauptart.numerical.Polynomial;

public class polynomials{

    

    public static void main(String args[]){

        double coefficients[] = {-1.0,5.0,-3.0,3.0,2.0};
        double basepoints[] = {0.0,0.0,0.0,0.0};

        Polynomial func = new Polynomial(4,coefficients);
        
        System.out.print(func.evaluate(0.5));
    }

}