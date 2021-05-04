package com.musinsa.searchdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {

    @GetMapping(value = "/search/{keyword}")
    @ResponseBody
    public Object searchApiHandler(@PathVariable String keyword){
        Object result = null;

        return keyword;
    }

}
