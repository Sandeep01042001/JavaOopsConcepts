package Service;

import Model.User;
import Repository.UserDB;

public class UserService {

    UserDB userDB;
    public UserService(){
        this.userDB = new UserDB();
    }


    public User validateUserId(int id){
        User user =  userDB.getUserById(id);
        return user;
    }

    public User createNewUser(String name){
        User user =  userDB.createNewUser(name);
        return user;
    }

}