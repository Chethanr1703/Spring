package com.xworkz.modules.controller;

import com.xworkz.modules.entity.file.FileEntity;
import com.xworkz.modules.service.file.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
public class FileController {

    @Autowired
    FileService fileService;

    @GetMapping("/getImage")
    public void getImage(
            @RequestParam int id,
            HttpServletResponse response) throws IOException {
        FileEntity file = fileService.getFileById(id);

        if (file == null) {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return;
        }
        response.setContentType(file.getContentType());

        Path imagePath = Paths.get(file.getStoredFilePath());
        Files.copy(imagePath, response.getOutputStream());
    }
}
