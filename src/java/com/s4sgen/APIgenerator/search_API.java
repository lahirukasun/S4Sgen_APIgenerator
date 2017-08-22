package com.s4sgen.APIgenerator;

import java.io.File;

public class search_API {

    public static void main(String[] args) {

        searchAPI("s4sgen_apiID_edu_SMS0001");
	//comment

    }

    public static void searchAPI(String sname) {
        
        
        File file = new File("G:\\S4Sgen\\system_resource\\");
        String[] names = file.list();

        for (String name : names) {
            if (new File("G:\\S4Sgen\\system_resource\\" + sname).isDirectory()) {
                System.out.println("Search result : "+sname);
                
                break;
            }
            else{
                System.out.println("no such a file or derectory");
                break;
            }
        }
    }

}
