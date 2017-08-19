package com.xiumeteo.java9.migration.controllers;

//import com.sun.beans.util.Cache;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Field;

@RequestMapping("/api")
@Controller
public class HelloWorld {

    @RequestMapping(value = "/hello", method= RequestMethod.GET)
    @ResponseBody
    public String helloStranger(){
        return "Hello World";
    }

    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
    @ResponseBody
    public String helloGuy(@PathVariable("name") String name){
        return "Hello " + name;
    }

    @RequestMapping(value = "/math", method = RequestMethod.GET)
    @ResponseBody
    public String getCumbersomeMath(){
        Integer two = 2;

//        Field value = null;
//        try {
//            value = Integer.class.getDeclaredField("value");
//            value.setAccessible(true);
//            value.set(two, 3);
//        } catch (NoSuchFieldException | IllegalAccessException e) {
//            e.printStackTrace();
//        }

        if (1 + 1 != two) {
            return "Weird math";
        } else
            return "Math is OK";
    }

    @RequestMapping(value = "/internalapis", method = RequestMethod.GET)
    @ResponseBody
    public String illegalAccessToHiddenPackages(){
        final ClassLoader classLoader =  getClass().getClassLoader();
        return classLoader.getName();
    }
}
