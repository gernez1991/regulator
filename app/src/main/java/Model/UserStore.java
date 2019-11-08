package Model;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

public class UserStore {
    private List<User> UserList = new ArrayList<>();
    private MutableLiveData<List<User>> users = new MutableLiveData<>();

    public void addUser(User user){
        UserList.add(user);
        users.postValue(UserList);
    }

    public LiveData<List<User>> getAllUsers(){
        return users;
    }
}