/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectBackend.Directories.EnterpriseDirectories;

import finalprojectBackend.Enterprise.UpcyclingCenter.UpcyclingCenterClass;
import java.util.ArrayList;

/**
 *
 * @author purka
 */
public class UpcyclingDirectory {
    
    private ArrayList<UpcyclingCenterClass> listOfNGO;

    public UpcyclingDirectory() {
        listOfNGO = new ArrayList();
    }
    
    public void addNGO(UpcyclingCenterClass ngo) {
        listOfNGO.add(ngo);
    }

    public void removeNGO(String ngoId) {

        for (UpcyclingCenterClass ngo : listOfNGO) {
            if (ngo.getRegisteredNumber() == ngoId) {
                listOfNGO.remove(ngo);
            }
        }
    }
    
    public UpcyclingCenterClass findNGO(String ngoName) {
        System.out.println("SearchNGO() "+ngoName);
        for (UpcyclingCenterClass ngo : listOfNGO) {
            if (ngo.getNameEnterprise() == ngoName) {
                return ngo;
            }
        }
        return null;
    } 
    
    public ArrayList<UpcyclingCenterClass> getListOfNGO() {
        return listOfNGO;
    }

    public void setListOfNGO(ArrayList<UpcyclingCenterClass> listOfNGO) {
        this.listOfNGO = listOfNGO;
    }
}
