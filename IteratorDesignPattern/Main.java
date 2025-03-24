package IteratorDesignPattern;

public class Main {
    public static void main(String[] args) {
        
        UserManagment user1=new UserManagment();
        //add user
        user1.addUser(new User("Vishnukanth","vish12345","vk@gmail.com"));

     myIterator itr=user1.getIterator();
     while(itr.hasNext()){
        User user=(User)itr.next();
        System.out.println(user.getName()+" "+user.getUserId()+" "+user.getEmail());
     }
    }
    
}
