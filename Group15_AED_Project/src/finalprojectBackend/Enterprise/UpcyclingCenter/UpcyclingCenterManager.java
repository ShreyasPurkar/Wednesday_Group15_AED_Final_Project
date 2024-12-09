/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectBackend.Enterprise.UpcyclingCenter;

import finalprojectBackend.Organization.Person;
import java.util.Date;

/**
 *
 * @author siddharth
 */
public class UpcyclingCenterManager extends Person{

private String managerDept;
private String NGOName;

    public UpcyclingCenterManager(String pName, String pwd, String Iduser, String NamePerson, String addr, String pgender, String contactNumber, Date dob, String managerDept,String NGOName) {
        super(pName, pwd, Iduser, NamePerson, addr, pgender, contactNumber, dob);
        this.managerDept = managerDept;
        this.NGOName = NGOName;
    }

    public String getNGOName() {
        return NGOName;
    }

    public void setNGOName(String NGOName) {
        this.NGOName = NGOName;
    }

    
    public String getManagerDept() {
        return managerDept;
    }

    public void setManagerDept(String managerDept) {
        this.managerDept = managerDept;
    }
}
