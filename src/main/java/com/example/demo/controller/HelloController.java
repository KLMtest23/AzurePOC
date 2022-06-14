/*
 * Copyright (c) KLM Royal Dutch Airlines. All Rights Reserved.
 * ============================================================
 */
package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
//        return "<html>\n"
//        		+ "   <head>\n"
//        		+ "      ...\n"
//        		+ "   </head>\n"
//        		+ "\n"
//        		+ "   <body>\n"
//        		+ "      ...\n"
//        		+ "    <a href=\"https://afkl-my.sharepoint.com/:i:/r/personal/rashmi_gound_klm_com/Documents/hi.png?csf=1&web=1&e=hacU54/\">Visit Demo Site!</a>\n"
//        		+ "\n"
//        		+ "      ...\n"
//        		+ "   </body>\n"
//        		+ "\n"
//        		+ "</html>\n";
    	return "Hello CID!";
    }
}
