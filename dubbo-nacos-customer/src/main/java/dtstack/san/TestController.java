package dtstack.san;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description:
 * @author: 33
 * @time: 2019/10/23 23:32
 */

@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/test.do")
    public void sayDubbo(){
        testService.test();
    }

    @RequestMapping("/tests.do")
    @ResponseBody
    public String testString(String str){
        String s = testService.testString(str);
        return s;
    }
}
