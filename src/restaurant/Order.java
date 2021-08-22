
package restaurant;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="Order")
public class Order {
    
    private String name ;
    private String tablenumber;
    private String pricewithtax;
    private String pricewithouttax;

    @XmlElement
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

     @XmlElement
    public String getTablenumber() {
        return tablenumber;
    }

    public void setTablenumber(String tablenumber) {
        this.tablenumber = tablenumber;
    }
    @XmlElement
    public String getPricewithtax() {
        return pricewithtax;
    }

    public void setPricewithtax(String pricewithtax) {
        this.pricewithtax = pricewithtax;
    }

    @XmlElement
    public String getPricewithouttax() {
        return pricewithouttax;
    }

    public void setPricewithouttax(String pricewithouttax) {
        this.pricewithouttax = pricewithouttax;
    }

    public Order(String name, String tablenumber, String pricewithtax, String pricewithouttax) {
        this.name = name;
        this.tablenumber = tablenumber;
        this.pricewithtax = pricewithtax;
        this.pricewithouttax = pricewithouttax;
    }

    public Order() {
        super();
    }
    
    
    
    
}
