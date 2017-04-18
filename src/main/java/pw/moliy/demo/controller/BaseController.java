package pw.moliy.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wjc133
 */
@Controller
public class BaseController {
    @RequestMapping("hello")
    public String helloPage() {
        return "hello";
    }
}
