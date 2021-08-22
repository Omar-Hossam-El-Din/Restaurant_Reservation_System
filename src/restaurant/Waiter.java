
package restaurant;


public class Waiter extends User{
    
    
    String name;
     String username;
     String password;
     String role;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Waiter{" + "name=" + name + ", username=" + username + ", password=" + password + ", role=" + role + '}';
    }
     
}
