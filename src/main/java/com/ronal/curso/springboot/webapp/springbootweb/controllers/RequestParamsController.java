package com.ronal.curso.springboot.webapp.springbootweb.controllers;

import com.ronal.curso.springboot.webapp.springbootweb.models.dto.ParamDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/params")
public class RequestParamsController {

    @GetMapping("foo")
    public ParamDto foo(@RequestParam(required = false,
           defaultValue = "Hello, what are you doing?") String message){
        ParamDto param = new ParamDto();
        param.setMessage(message);
        return param;
    }

    @GetMapping("bar")
    public ParamDto bar(@RequestParam(required = false,defaultValue = "You wrote nothing") String text,
                        @RequestParam(required = false, defaultValue = "404") Integer code){
    ParamDto params = new ParamDto();
    params.setMessage(text);
    params.setCode(code);
    return params;
    }
}
