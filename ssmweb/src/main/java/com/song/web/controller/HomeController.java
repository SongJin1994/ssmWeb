package com.song.web.controller;

import com.song.web.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Created by sj124 on 2016/8/31.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String home(){
        return "home";
    }
    @RequestMapping("/")
    public String submit(User user){
        System.out.println(user);
        return "user";
    }
    @RequestMapping("/upload")
    public String upload(
            @RequestPart("upfile") MultipartFile upfile
            ){
        try {
            upfile.transferTo(new File("/file/"+upfile.getOriginalFilename()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("save success!");
        return "home";
    }
    @RequestMapping("/download")
    public ModelAndView download(
            HttpServletRequest request,HttpServletResponse response
    ) throws IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("UTF-8");
        java.io.BufferedInputStream bis = null;
        java.io.BufferedOutputStream bos = null;

        /*String ctxPath = request.getSession().getServletContext().getRealPath(
                "/")
                + "\\" + "images\\";*/
        String fileName = "d:/tmp/file/456.jpg";
        String downLoadPath =  fileName;
        System.out.println(downLoadPath);
        try {
            long fileLength = new File(downLoadPath).length();
            response.setContentType("application/x-msdownload;");
            response.setHeader("Content-disposition", "attachment; filename="
                    + new String(fileName.getBytes("utf-8"), "ISO8859-1"));
            response.setHeader("Content-Length", String.valueOf(fileLength));
            bis = new BufferedInputStream(new FileInputStream(downLoadPath));
            bos = new BufferedOutputStream(response.getOutputStream());
            byte[] buff = new byte[2048];
            int bytesRead;
            while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
                bos.write(buff, 0, bytesRead);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bis != null)
                bis.close();
            if (bos != null)
                bos.close();
        }
        return null;
    }
}
