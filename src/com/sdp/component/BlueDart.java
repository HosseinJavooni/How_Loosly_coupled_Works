package com.sdp.component;

public class BlueDart implements Courier{
    public String deliver(String iteams, String address) {
        return iteams+ "Shiped to Address "+address +"Through BlueDart";
    }
}
