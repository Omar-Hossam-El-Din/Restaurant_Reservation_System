
package restaurant;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="dishes")
@XmlAccessorType(XmlAccessType.FIELD)
public class Dishes {
    @XmlElement(name="dish")
    private List<Dish> dish;

    public List<Dish> getDishesList() {
        return dish;
    }

    public void setDishes(List<Dish> dishes) {
        this.dish = dishes;
    }
    
}
