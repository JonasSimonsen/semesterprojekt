/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.sql.SQLException;
import DTO.Partner;

/**
 *
 * @author Sander
 */
public interface Interface_PartnerDAO {
    
    public void createNewPartner(Partner partner) throws SQLException, ClassNotFoundException;
    
}
