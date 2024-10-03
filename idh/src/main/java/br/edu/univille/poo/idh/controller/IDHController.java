package br.edu.univille.poo.idh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class IDHController {
    @GetMapping
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }
    @GetMapping
    @RequestMapping("/continente/{id}")
    public ModelAndView porContinente(@PathVariable Long id){
        ModelAndView mv = new ModelAndView("continente");
        return mv;
    }
}
