package control;

import java.sql.SQLException;
import DTO.Message;
import facade.facadeDAO;
import java.util.ArrayList;

public class MessageCtrl {

    facadeDAO facade = new facadeDAO();

    public void createNewMessage(Message message) throws SQLException, ClassNotFoundException {
        facade.createNewMessage(message);
    }

    public ArrayList<Message> getMessages() throws SQLException, ClassNotFoundException {
        ArrayList<Message> message = facade.getMessages();
        return message;
    }

    public ArrayList<Message> getSpecificMessage(int ID) throws SQLException, ClassNotFoundException {
        ArrayList<Message> message = facade.getSpecificMessage(ID);
        return message;
    }
}
