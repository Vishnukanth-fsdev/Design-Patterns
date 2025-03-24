package PrototypeDesignPattern;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        
        NetworkConnection nw=new NetworkConnection();
        nw.setIp("196.05.04.123");
        nw.loadImpData();
        System.out.println(nw);

        try{
           NetworkConnection nw2=(NetworkConnection)nw.clone();
           NetworkConnection nw3=(NetworkConnection)nw.clone();
           nw2.setImpdata("Important data 2");
           nw3.setImpdata("Important Data 3");
           System.out.println(nw2);
           System.out.println(nw3);

        }catch(Exception e){
            e.printStackTrace();
        }

    }
    
}
