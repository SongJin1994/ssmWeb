package com.song.web.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sj124 on 2016/9/1.
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    private List<HashMap<String,String>> list;
    private HashMap<String,String> map;
    @RequestMapping("/check")
    public String check(Model model){
        list = new ArrayList<HashMap<String, String>>();
        HashMap map1 = new HashMap<String,String>();
        map1.put("name","song");
        map1.put("id","1");
        HashMap map2 = new HashMap<String,String>();
        map2.put("name","jin");
        map2.put("id","2");
        list.add(map1);
        list.add(map2);
        model.addAttribute("valueList",list);
        return "welcome";
    }
    @RequestMapping("/qparam")
    public String queryParam(@RequestParam(value = "id",defaultValue = "1") int id,
                             @RequestParam(value = "name",defaultValue = "song") String name,
                             HttpServletRequest request){
        request.setAttribute("id",id);
        request.setAttribute("name",name);
        return "home";

    }
    @RequestMapping("/{param}")
    public String pathParam(@PathVariable("param") int pId,
                         Model model){
        model.addAttribute("pId",pId);
        return "home";
    }
    public List<HashMap<String, String>> getList() {
        return list;
    }

    public void setList(List<HashMap<String, String>> list) {
        this.list = list;
    }

    public HashMap<String, String> getMap() {
        return map;
    }

    public void setMap(HashMap<String, String> map) {
        this.map = map;
    }
}
