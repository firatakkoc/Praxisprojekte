package Kassenbon;

public class WarenListe {
    private double wurst;
    private double kease;
    private double brot;
    private double dvd;
    
    
    public WarenListe(double wurst, double kease, double brot, double dvd) {
        this.wurst = wurst;
        this.kease = kease;
        this.brot = brot;
        this.dvd = dvd;
    }

    public static void summ(int stück) {
        
    }

    public double getWurst() {
        return wurst;
    }
    public void setWurst(double wurst) {
        this.wurst = wurst;
    }
    public double getKease() {
        return kease;
    }
    public void setKease(double kease) {
        this.kease = kease;
    }
    public double getBrot() {
        return brot;
    }
    public void setBrot(double brot) {
        this.brot = brot;
    }
    public double getDvd() {
        return dvd;
    }
    public void setDvd(double dvd) {
        this.dvd = dvd;
    }

}
