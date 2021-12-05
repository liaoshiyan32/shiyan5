package com.example.shiyan5;

public class Brand {
    private String id;
    private String brand;
    private String rank;
    public Brand(String id, String brand, String rank){
        this.id=id;
        this.brand=brand;
        this.rank=rank;
    }
    public String getId(){

        return id;
    }
    public String getBrand(){

        return brand;
    }
    public String getRank(){
        return rank;
    }
}
