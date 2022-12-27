package Model;

import java.io.Serializable;

public class Request implements Serializable{
    private String username;
    private String password;
    private int employeeCode;

    public Request(String username, String password, int employeeCode) {
        this.username = username;
        this.password = password;
        this.employeeCode = employeeCode;
    }

    public Request() {
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

    public int getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(int employeeCode) {
        this.employeeCode = employeeCode;
    }
    
}
