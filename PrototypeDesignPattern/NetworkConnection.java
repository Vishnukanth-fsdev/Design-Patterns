package PrototypeDesignPattern;

class NetworkConnection implements Cloneable{

    private String ip;
    private String impdata;
    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
    public String getImpdata() {
        return impdata;
    }
    public void setImpdata(String impdata) {
        this.impdata = impdata;
    }

    public void loadImpData() throws InterruptedException{
        this.impdata="This is very Importnat Data";
        Thread.sleep(5000);
    }
    @Override
    public String toString() {
        return "NetworkConnection [ip=" + ip + ", impdata=" + impdata + "]";
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    

}