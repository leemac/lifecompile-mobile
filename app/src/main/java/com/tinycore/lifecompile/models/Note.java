package com.tinycore.lifecompile.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Note {

    @SerializedName("id")
    @Expose
    public Integer Id;

    @SerializedName("content")
    @Expose
    public String Content;

    @SerializedName("tagsfull")
    @Expose
    public ArrayList<Tag> TagsFull;
}
