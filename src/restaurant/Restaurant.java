
package restaurant;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "restaurant")
@XmlAccessorType(XmlAccessType.FIELD)
public class Restaurant {
    @XmlElement(name = "users")
    private Users users = null;

    @XmlElement(name="tables")
    private Tables tables=null;
    
    @XmlElement(name="dishes")
    private Dishes dishes=null;

    
   public Users getUsersObject() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    Object getUsers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } 
    
    public Tables getTablesOject(){
        return tables ;
    }
    public void setTAbles(Tables tables){
        this.tables=tables;
    }
    Object getTables() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } 
    
    public Dishes getDishesObject() {
        return dishes;
    }

    public void setDishes(Dishes dishes) {
        this.dishes = dishes;
    }

    Object getDishes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools || Templates.
    } 
    
    
    
}
