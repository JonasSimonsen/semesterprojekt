/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.sql.SQLException;
import java.util.ArrayList;
import DTO.Campaign;
import DTO.Campaign2;

/**
 *
 * @author Sander
 */
public interface Interface_CampaignDAO {
    
    public void submitNewCampaignV2(Campaign2 camp, int userID) throws SQLException, ClassNotFoundException;
    public void deleteCampaign(String name) throws SQLException, ClassNotFoundException;
    public void editCampaign(Campaign camp) throws SQLException, ClassNotFoundException;
    public void approveBudget(int campno, double budget) throws SQLException, ClassNotFoundException;
    public void budgetStatus(String status, int campno) throws SQLException, ClassNotFoundException;
    public void updatePOEStatus(int campno, int has_poe) throws SQLException, ClassNotFoundException;
    public Campaign2 getSpecificCampaign(int campno) throws SQLException, ClassNotFoundException;
    public ArrayList<Campaign2> getCampaignsExternal(int id) throws SQLException, ClassNotFoundException;
    public ArrayList<Campaign2> getCampaigns() throws SQLException, ClassNotFoundException;
}
