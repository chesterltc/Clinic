package com.example.chana.myapplication;

/**
 * Created by chana on 4/1/2017.
 */

import java.util.ArrayList;
public class doctor{

    String name, district, field;
    float rating;
    boolean[] timeslot = new boolean[32];
    coordination location = new coordination();
    doctor_profile dp = new doctor_profile();

    public doctor(){
        this.name = "Name";
        this.district = "District";
        this.field = "Field";
        for (int i = 0; i<32; i++)
            timeslot[i] = false;
        this.location = new coordination();
        this.dp = new doctor_profile();
    }

    public doctor(String n,String d,String f,float x, float y, String s, String q, boolean e){
        this.name = n;
        this.district = d;
        this.field = f;
        for (int i = 0; i<32; i++)
            timeslot[i] = false;
        this.location = new coordination(x,y);
        this.dp = new doctor_profile(n,s,q,e);

    }

}