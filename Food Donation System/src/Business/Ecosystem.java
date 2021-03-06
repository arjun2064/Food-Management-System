/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author aawad
 */
public class Ecosystem extends Organization{
    
    private static Ecosystem business;
    private ArrayList<Network> networkList ;

  
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public static Ecosystem getInstance(){
        if(business==null){
            business=new Ecosystem();
        }
        return business;
    }
    
    public Ecosystem()
    {
        super(null);
        networkList = new ArrayList<Network>();
    }
       
    //Method for creating and saving network
    public Network createAndAddNetwork()
    {
        Network network = new Network();
        networkList.add(network);
        return network;
    }
//     public void  Delete(Network network1)
//    {
//        Network network1 = new Network();
//        networkList.remove(network1);
//    }
   

    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:networkList){
            
        }
        return true;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    
    
    
    
   
   

    
    
    
}
