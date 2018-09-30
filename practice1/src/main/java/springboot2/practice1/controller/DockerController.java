package springboot2.practice1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @desc
 * @author wjl
 * @date 2018/5/18 0018 下午 16:19
 */
@RestController
public class DockerController {
    @RequestMapping("/")
    public String index() {
        return "Hello Docker!";
    }
}
