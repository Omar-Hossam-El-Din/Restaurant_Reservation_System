
package restaurant;

import GUI.Window;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


public class main {
    public static void main(String[] args) throws JAXBException {
        
        main perform=new main();
        perform.callgui();
        perform.read();
        
        
        
      }
    private void callgui()
    {
        new Window().setVisible(true);
    }
    private void read() throws JAXBException
    {
        JAXBContext jax = JAXBContext.newInstance(Restaurant.class);
        Unmarshaller u = jax.createUnmarshaller();
        Restaurant r = (Restaurant) u.unmarshal(new File("file.xml"));
        List<User> list=r.getUsersObject().getUsersList();
        User mn=new Manager();
        User wat=new Waiter();
        User cook=new Cook();
        User cst=new premium_Customer();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName()+" "+list.get(i).getRole()+" "+list.get(i).getUsername()+" "+list.get(i).getPassword());
     }
        System.out.println();
        List<Table> table=r.getTablesOject().getTablesList();
        Table smoke=new Smoking();
        Table nonsmoke=new Nonsmoking();
        for(int i=0;i<table.size();i++)
        {
            System.out.println(table.get(i).getNumber()+" "+table.get(i).getNumber_of_seats()+" "+table.get(i).isSmoking());
        }
        System.out.println();
        List<Dish> dish = r.getDishesObject().getDishesList();
        Dish app=new appetizer();
        Dish maincourse=new main_course();
        Dish des=new desert();
        for (int i=0;i<dish.size();i++)
        {
            System.out.println(dish.get(i).getName()+" "+dish.get(i).getPrice()+" "+dish.get(i).getType());
        }
        
    }
    
}

