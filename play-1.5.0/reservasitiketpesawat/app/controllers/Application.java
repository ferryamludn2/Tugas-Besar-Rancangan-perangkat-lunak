package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;


@With(Secure.class)

public class Application extends Controller {


    public static void index() {
        String user = Security.connected();
        System.out.println("Role for user " + user + ": " + Security.role);
        String userRole = Security.role; 
        Pembeli pembeli = Pembeli.find("byUsername",user).first();

        if ("administrator".equals(userRole)) {
            render("adminIndex.html",user,pembeli);
        } else {
            render("userIndex.html",user,pembeli);
        }
    }

    @Check("administrator")
    public static void test1(){
        if ("administrator".equals(Security.role)) {
            render();
        } else {
            forbidden("Kamu tidak memiliki akses untuk masuk ke laman ini");
        }
    }

    
    public static void editprofil(){
            String user = Security.connected();
            String userRole = Security.role; 
            Pembeli pembeli = Pembeli.find("byUsername",user).first();
            render(user,pembeli);
    }

    public static void myinventory(){
            String user = Security.connected();
            String userRole = Security.role; 
            Pembeli pembeli = Pembeli.find("byUsername",user).first();
            render(user,pembeli);
    }

}