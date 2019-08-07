package top.aiprogram.controller;

import com.sun.xml.internal.ws.encoding.ContentType;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import top.aiprogram.entity.Student;
import top.aiprogram.entity.User;
import top.aiprogram.service.StudentService;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.net.Proxy;

@Controller
@RequestMapping("user")     //请求路径
public class UserController {
    @Autowired @Qualifier("studentServiceImpl")
    private StudentService studentService;


    @RequestMapping("/json_demo")        //请求路径，网页url
    @ResponseBody       //声明返回体   去xml中的message-converters配置
    public User testUser(User user){
        return user;
    }


    @RequestMapping("/test")        //请求路径，网页url        post请求
    public ModelAndView testUser1(){
        ModelAndView view = new ModelAndView("test");
        User user = new User("lalala",12);
        view.addObject(user);
        return view;
    }

    @RequestMapping("/user")
    public String demoUser(@RequestBody Student student){

        student.setTid(1);
        studentService.createStudent(student);
        return "user";          //返回的文件路径，通过配置加载user.jsp
    }


    @RequestMapping("/upload")
    public String upload(MultipartFile file,HttpServletRequest request) throws IOException {
        String name = file.getOriginalFilename();
        File upload = new File("/"+name);
        file.transferTo(upload);
        return "user";
    }

    @RequestMapping("/download")
    public ResponseEntity<byte[]> download() throws IOException {
        String path = "E:/1.png";
        File file = new File(path);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentDispositionFormData("attachment",path);
        headers.setContentType(MediaType.IMAGE_PNG);
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers, HttpStatus.CREATED);
    }
}
