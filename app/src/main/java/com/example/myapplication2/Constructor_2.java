package com.example.myapplication2;

public class Constructor_2
{

   String header,desc;

    public Constructor_2( String header, String desc) {
        this.header = header;
        this.desc = desc;
    }


    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
