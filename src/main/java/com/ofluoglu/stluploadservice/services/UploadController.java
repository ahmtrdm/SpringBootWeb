package com.ofluoglu.stluploadservice.services;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = UploadController.ENDPOINT)
public class UploadController {

    public static final String ENDPOINT = "uploads";

    @GetMapping
    public String uploadFile() {
        return "HI";
    }

}
