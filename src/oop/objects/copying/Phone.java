package oop.objects.copying;

public class Phone {
    private String company, model;
    private int cost;

    public Phone(String company, String model, int cost) {
        this.company = company;
        this.model = model;
        this.cost = cost;
    }

    //copy constructor to copy an object1 during object2's initialization
    public Phone(Phone phone) {
        this.copy(phone);
    }
    //copy method if you want to invoke after initializing an object
    public void copy(Phone phone) {
        this.setCompany(phone.getCompany());
        this.setModel(phone.getModel());
        this.setCost(phone.getCost());
    }

    public String getCompany() {return company;}
    public String getModel() {return model;}
    public int getCost() {return cost;}
    public void setCost(int cost){this.cost = cost;}
    public void setCompany(String company){this.company= company;}
    public void setModel(String model){this.model = model;}
}
