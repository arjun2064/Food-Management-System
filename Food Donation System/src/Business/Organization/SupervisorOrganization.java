/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import java.util.ArrayList;
import Business.Role.SupervisorRole;

/**
 *
 * @author aawad
 */
public class SupervisorOrganization extends Organization {
    
    public SupervisorOrganization(){
    super(Organization.NType.nSupervisor.getValue());
            }

    @Override
    public ArrayList<Role> getSupportedRole() {
      
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SupervisorRole());
        return roles;
    }
}
