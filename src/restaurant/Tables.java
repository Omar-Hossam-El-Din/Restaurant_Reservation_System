
package restaurant;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name ="tables")
@XmlAccessorType(XmlAccessType.FIELD)
public class Tables {
    @XmlElement(name="table")
    private List<Table> table ;

    public List<Table> getTablesList() {
        return table;
    }

    public void setTables(List<Table> tables) {
        this.table = tables;
    }
    
    
}
