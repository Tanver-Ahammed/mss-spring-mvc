package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpSession;
import java.io.FileOutputStream;
import java.io.IOException;

@Controller
public class FileUploadController {

    @RequestMapping(path = "/fileForm")
    public String showUploadForm() {

        String st = null;
        System.out.println(st.charAt(0));

        return "fileForm";
    }

    @RequestMapping(path = "/uploadFile", method = RequestMethod.POST)
    public String uploadImage(@RequestParam("profile") CommonsMultipartFile file,
                              HttpSession session, Model model) {
        System.out.println("file upload handler........");
        System.out.println(file.getSize());
        System.out.println(file.getContentType());
        System.out.println(file.getName());
        System.out.println(file.getOriginalFilename());
        System.out.println(file.getStorageDescription());
        System.out.println(file.getFileItem());

        byte[] data = file.getBytes();

        // save this file in server
        String path = session.getServletContext().getRealPath("/") + "WEB-INF/resources/images/"
                + file.getOriginalFilename();
        System.out.println(path);
        FileOutputStream fos;
        try {
            fos = new FileOutputStream(path);
            fos.write(data);
            fos.close();
            model.addAttribute("msg", "uploaded successfully");
            model.addAttribute("filename", file.getOriginalFilename());
            System.out.println("File Uploaded...........");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File has Some error!!!!!!!!!!");
            model.addAttribute("msg", "uploaded Error!!");
        }
        return "fileSuccess";
    }

}
