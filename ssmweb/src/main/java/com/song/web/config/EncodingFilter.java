package com.song.web.config;

import org.springframework.web.filter.CharacterEncodingFilter;

/**
 * Created by sj124 on 2016/9/1.
 */
public class EncodingFilter extends CharacterEncodingFilter {
    EncodingFilter(){
        this.setEncoding("utf-8");
        this.setForceEncoding(true);
    }
}
