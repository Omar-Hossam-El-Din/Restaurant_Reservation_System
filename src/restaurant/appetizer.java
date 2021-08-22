
package restaurant;


public class appetizer extends Dish implements taxescalculation{
double pricewithtax,pricewithoutthetax;

    @Override
    public double calculatetax() {
        pricewithtax=pricewithoutthetax+(pricewithoutthetax*0.1);
        return pricewithtax;
    }

    
}
