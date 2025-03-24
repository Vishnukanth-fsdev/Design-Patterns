package IteratorDesignPattern;

import java.util.ArrayList;

public class UserManagment {

    private ArrayList<User> userList=new ArrayList<>();

    public void addUser(User user){
        userList.add(user);
    }

    public User getUser(int index){
        return userList.get(index);
    }

    public myIterator getIterator(){
        return new MyIteratorImpl(userList, 0);
    }
    
}
