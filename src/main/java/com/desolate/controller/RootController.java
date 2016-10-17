package com.desolate.controller;

import com.desolate.utils.ReturnModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Rainy on 2016/10/17/0017.
 */
@Controller
public class RootController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public ModelAndView index(){
        return ReturnModel.createModelAndView("/index",null);
    }

}
