package controller.user;

import model.user.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import service.user.UserService1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class UserController {

    @Autowired
    private UserService1 userService;

    @RequestMapping(value = "/index")
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
       List<UserVO> userList= this.userService.getUserList();
        Map<String,Object> model = new HashMap<String,Object>();
        model.put("userList",userList);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("userList");
        modelAndView.addAllObjects(model);

        return modelAndView;
    }
}