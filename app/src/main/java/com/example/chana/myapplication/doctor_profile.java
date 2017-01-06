package com.example.chana.myapplication;

/**
 * Created by chana on 4/1/2017.
 */

import java.util.ArrayList;
public class doctor_profile{

    String name, sex, qualifications;
    boolean emergency;
    ArrayList<String> language = new ArrayList<String>();
    ArrayList<String> comment = new ArrayList<String>();

    public doctor_profile(){
        this.name = "Name";
        this.sex = "M";
        this.qualifications = "No";
        this.emergency = true;
        this.language.add("Cantonese");
        this.language.add("English");
        this.comment.add("No comment");
    }

    public doctor_profile(String n, String s, String q, boolean e){
        this.name = n;
        this.sex = s;
        this.qualifications = q;
        this.emergency = e;
        this.language.add("Cantonese");
        this.language.add("English");
        this.comment.add("No comment");
    }
}

