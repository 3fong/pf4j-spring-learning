package com.dalongpluginb;

import org.hashids.Hashids;

public class MyDemo {

    public  String demoApp(String name,String password){
        Hashids hashids = new Hashids("demo");
        return String.format("%s--%s====%s- service demo",name,password,hashids.encode(1000));
    }
}
