package com.ssm.controller;

import com.ssm.model.Speaker;
import com.ssm.service.SpeakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import sun.misc.Contended;

import java.util.List;

@Controller
public class SpeakerController {
    @Autowired
    SpeakerService speakerService;

    @RequestMapping("/index")
    public String SpeakerDemo(Model model){
        System.out.println("进过了…………………………******");
        List<Speaker> course = speakerService.selectAll();
        model.addAttribute("speaker",course);
        return "Speaker";
    }

}
