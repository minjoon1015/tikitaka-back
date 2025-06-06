package FutureCraft.tikitaka.back_end.controller;

import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import FutureCraft.tikitaka.back_end.service.FileService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/file/")
@RequiredArgsConstructor
public class FileController {
    private final FileService fileService;

    @PostMapping("upload")
    public String upload(@RequestParam("file") MultipartFile file) {
        return fileService.upload(file);
    }

    @GetMapping(value = "{fileName}", produces = {MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_PNG_VALUE})
    public Resource getImage(@PathVariable("fileName") String fileName) {
        return fileService.getImage(fileName);
    }

}

