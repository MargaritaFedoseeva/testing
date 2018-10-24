package web_server;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.get;
import javax.xml.ws.Response;

public class Class {
    public static void main(String[] args){
       Response rs= (Response) get("http://www.cbr.ru/scripts/XML_daily.asp");
    }
}