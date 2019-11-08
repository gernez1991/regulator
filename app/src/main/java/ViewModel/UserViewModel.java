package ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import Model.User;
import Model.UserStore;


public class UserViewModel extends ViewModel {

    private UserStore users;

    public UserViewModel() {
        this.users = new UserStore();
    }

    public LiveData<List<User>> getUsers() {
        return users.getAllUsers();}


    public void addUser(String fullname, String username, String email, String password) {
        users.addUser(new User(fullname, username, email, password));
    }




}
