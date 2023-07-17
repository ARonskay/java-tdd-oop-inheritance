package com.booleanuk.core;

public class Article extends LibraryItem {
    public Article(String title){
        super(title);
    }
    @Override
    public String checkIn(){
        if (!this.isOnLoan()){
            return "item has been checked in";
        }
        this.onLoan=true;
        return "item is currently on loan";
    }
    @Override
    public String checkOut(){
        if (!this.isOnLoan()){
            return "item has been checked out";
        }
        this.onLoan=true;
        return "item has not been checked out";
    }
}
