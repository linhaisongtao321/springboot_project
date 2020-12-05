package com.lhst.springboot_project.controller;

import com.lhst.springboot_project.util.RedisUtil;
import com.lhst.springboot_project.util.ResponseResult;
import com.lhst.springboot_project.util.ResponseVo;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@RestController
@RequestMapping("/file")
public class FileUploadController {

    @Autowired
    RedisUtil redisUtil;

    @PostMapping("/upload")
    @ResponseBody
    public ResponseVo upload(@RequestHeader("files") String files, @RequestParam("filename") String filename,MultipartFile file, HttpServletRequest request) throws IOException {
        try {
            String oldname = file.getOriginalFilename();
            long size = file.getSize();
            String fileType = file.getContentType();
            String classpath = ResourceUtils.getURL("classpath:").getPath();
            String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
            String fileDir = classpath + date;
            String newfilename = UUID.randomUUID() + "_" + oldname;
            File uploadFile = new File(fileDir);
            if (!uploadFile.exists()) {
                uploadFile.mkdirs();
            }
            file.transferTo(new File(fileDir, newfilename));
            return ResponseResult.success("文件上传成功");
        } catch (Exception e) {
            throw new RuntimeException("上传文件失败");
        }

    }


    /**
     * 文件下载
     *
     * @param id 文件id
     */
    @GetMapping("download")
    @ApiOperation(value = "文件下载")
    public void download(@RequestParam("id") long id) throws Exception {
////        FileEntity fileEntry = fileService.getFileById(id);
////        if (Objects.isNull(fileEntry)) {
////            throw new RuntimeException("文件下载失败，文件不存在");
////        }
//        String fileName ;//= fileEntry.getFileName();
//        String filePath; //= fileEntry.getFilePath();
//        File file = new File(FILE_PATH + File.separator + filePath);
////        if (!file.exists() || StringUtils.isEmpty(fileName)) {
////            throw new RuntimeException("文件下载失败，文件不存在");
////        }
//        //获取response
//        HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
//        response.setContentType("application/force-download");
//        response.setCharacterEncoding("UTF-8");
//        response.addHeader("Content-Disposition", "attachment;fileName=" + URLEncoder.encode(fileName, "UTF-8"));
////        FileInputStream fileInputStream = new FileInputStream(file);
//
//        OutputStream os = response.getOutputStream();
//        response.setHeader("Content-Disposition", "attachment;fileName=" + fileName);
//        response.setContentType("application/force-doenload");
//        response.setCharacterEncoding("UTF-8");
//
//        FileUtils.copyFile(file, os);


    }

}
