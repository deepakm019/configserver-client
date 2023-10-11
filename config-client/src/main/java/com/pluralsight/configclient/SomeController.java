package com.pluralsight.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RefreshScope
@Controller
public class SomeController {

    @Value("${spring.datasource.url}")
    String springDataSourceUrl;

    @Value("${logging.level.root}")
    String loggingLevel;

    @Value("${custom.property1}")
    String customPropertyValue;

    @Value("${spring.jpa.show-sql}")
    String sqlEnabled;

    @RequestMapping("/configuration")
    public String getRate(Model m) {

        m.addAttribute("springDataSourceUrl", springDataSourceUrl);
        m.addAttribute("loggingLevel", loggingLevel);
        m.addAttribute("customPropertyValue",customPropertyValue);

        m.addAttribute("sqlEnabled", sqlEnabled);

        //name of view
        return "someview";
        
    }
    
}
