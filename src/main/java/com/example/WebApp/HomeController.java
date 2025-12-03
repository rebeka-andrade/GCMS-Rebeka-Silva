/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author ALUNO
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello, World!";
    }

    @RequestMapping("/Rebeka")
    public @ResponseBody String greetingFulano() {
        return "Hello, Rebeka!";
    }

    @RequestMapping("/RebekaClone")
    public @ResponseBody String greetingWallace() {
        return "Hello, RebekaClone!";
    }

    @RequestMapping("/hotfix")
    public @ResponseBody String greetingCodigo() {
        return "Hotfix endpoint funcionando!";
    }

    @RequestMapping("/jenkins")
    public @ResponseBody String greetingJenkins() {
        return "jenkins funcionando!";
    }

}