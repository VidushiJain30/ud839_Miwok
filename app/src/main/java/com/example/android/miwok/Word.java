package com.example.android.miwok;

public class Word {
    private String eng;
    private String miwok;
    private int mid;
    private int audioid;
    public Word(String english,String miwoks,int audid){
        eng=english;
        miwok=miwoks;
        audioid=audid;
    }
    public Word(String english,String miwoks,int ids,int audid){
        eng=english;
        miwok=miwoks;
        mid=ids;
        audioid=audid;
    }
    public String geteng()
    {
        return eng;
    }
    public String getmiwok()
    {
        return miwok;
    }
    public int getImageResourceId(){return mid;}
    public int getAudioid(){return audioid;}

}
