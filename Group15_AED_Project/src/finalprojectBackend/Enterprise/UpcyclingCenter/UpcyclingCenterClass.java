/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectBackend.Enterprise.UpcyclingCenter;

import finalprojectBackend.Enterprise.EnterpriseClass;
import java.util.ArrayList;

/**
 *
 * @author manikhandan
 */
public class UpcyclingCenterClass extends EnterpriseClass {

    private ArrayList<UpcyclingCenterManager> managerDirectory;

    public UpcyclingCenterClass(String addr, String pName, String password, String nameEnterprise, String registeredNumber) {
        super(addr, pName, password, nameEnterprise, registeredNumber);

        this.managerDirectory = new ArrayList();

    }

    public ArrayList<UpcyclingCenterManager> getManagerDirectory() {
        return managerDirectory;
    }

    public void setManagerDirectory(ArrayList<UpcyclingCenterManager> managerDirectory) {
        this.managerDirectory = managerDirectory;
    }
    
    public void addManager(UpcyclingCenterManager doc) {
        managerDirectory.add(doc);
    }
}
