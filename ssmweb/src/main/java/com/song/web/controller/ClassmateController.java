package com.song.web.controller;

import com.song.web.model.User;
import com.song.web.service.ClassService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sj124 on 2016/9/10.
 */
@Controller
@RequestMapping("/classmanager")
public class ClassmateController {
    @Resource
    private ClassService classService;
    @RequestMapping("/showall")
    public String showAll(Model model){
        List list2 = new ArrayList<User>();
        User user1 = new User();
        user1.setId(1);
        User user2 = new User();
        user2.setId(2);
        list2.add(user1);
        list2.add(user2);
        List list;
        list=classService.showAll();
        model.addAttribute("list",list);
        model.addAttribute("list2",list2);
        return "classmatelist";
    }
    @RequestMapping("/toclasslist")
    public String toclasslist(){
        return "classmate";
    }
}
