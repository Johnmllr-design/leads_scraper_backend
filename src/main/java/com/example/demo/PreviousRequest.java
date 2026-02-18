package com.example.demo;
import java.util.ArrayList;
import jakarta.persistence.*;


@Entity
@Table(name = "previous_request")
class previousRequest {

    @Id 
    private Integer id;

    private ArrayList<String> previousRequests;

    public previousRequest(){
    }

    public previousRequest(Integer id, ArrayList<String> strings){
        this.id = id;
        this.previousRequests = strings;
    }

    public Integer getId(){
        return id;
    }

    public ArrayList<String> getPreviousRequests(){
        return previousRequests;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public void setPreviousRequests(ArrayList<String> strings){
        this.previousRequests = strings;
    }

    public void appendRequest(String s){
        this.previousRequests.add(s);
    }
}   