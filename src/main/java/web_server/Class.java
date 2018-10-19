package web_server;

import javax.xml.ws.Response;

public class Class {
    public static void main(String[] args){
        Response rs=get("http://www.cbr.ru/scripts/XML_daily.asp");
    }
}