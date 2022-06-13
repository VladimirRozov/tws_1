package ru.itmo;

public class Loyalty {

    private String spbso;
    private String user;
    private String event;
    private String cash;
    private String brigade;

    public Loyalty(){
    }

    public Loyalty (String spbsoId, String fullName, String event, String cash, String brigade){
        this.spbso = spbsoId;
        this.user = fullName;
        this.event = event;
        this.cash = cash;
        this.brigade = brigade;
    }

    public String getName(){
        return user;
    }

    public String getEvent(){
        return event;
    }

    public String getBrigade(){
        return brigade;
    }

    public String getSpbso(){
        return spbso;
    }

    public String getCash() {
        return cash;
    }

    public void setBrigade(String brigade) {
        this.brigade = brigade;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public void setName(String fullName) {
        this.user = fullName;
    }

    public void setSpbso(String spbsoId) {
        this.spbso = spbsoId;
    }

    public void setCash(String cash) {
        this.cash = cash;
    }

    @Override
    public String toString() {
        return "Loyalty {" + "spbsoId=" + spbso +
                ", fullName=" + user +
                ", brigade=" + brigade +
                ", event=" + event +
                ", organizationFee=" + cash + '}';
    }
}
