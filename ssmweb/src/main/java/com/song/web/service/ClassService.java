package com.song.web.service;

import com.song.web.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * Created by sj124 on 2016/9/10.
 */
@Service
public class ClassService {
    @Resource
    private UserMapper userMapper;
    public List<HashMap<String,String>> showAll(){
        return userMapper.selectAll();
    }
}
