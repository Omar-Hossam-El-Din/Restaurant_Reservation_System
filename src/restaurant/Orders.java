
package restaurant;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement(name="Orders")
public class Orders {
    
    private List<Order> order=new ArrayList<Order>();

    @XmlElement(name="Order")
    public List<Order> getOrder() {
        return order;
    }

    public void setOrder(List<Order> order) {
        this.order = order;
    }
    
    
}
