package IteratorDesignPattern;

import java.util.List;

public class MyIteratorImpl implements myIterator{

    private List<User> list;

    private int length;

    private int pos=0;
    

    public MyIteratorImpl(List<User> list, int length) {
        this.list = list;
        this.length = list.size();
    }

    @Override
    public boolean hasNext() { 
        if(pos>=length)
            return false;
        else
            return true;
    }

    @Override
    public Object next() {
        User user=list.get(pos);
        pos+=1;
        return user;
    }

       
}
