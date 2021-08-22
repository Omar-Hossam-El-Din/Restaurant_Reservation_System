
package restaurant;


public class main_course extends Dish implements taxescalculation{
double pricewithtax,pricewithoutthetax;
    @Override
    public double calculatetax() {
         pricewithtax=pricewithoutthetax+(pricewithoutthetax*0.15);
        return pricewithtax;
    }
    
}
