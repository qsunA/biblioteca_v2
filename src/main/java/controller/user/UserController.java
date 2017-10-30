package controller.user;

import model.user.UserVO;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import service.user.UserService;
import service.user.UserService1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017-10-29.
 */
public class UserController implements Controller{

    private UserService1 userService;

    public void setUserService(UserService1 userService){
        this.userService = userService;
    }

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