package service.user;

import mapper.user.UserMapper;
import model.user.UserVO;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by Administrator on 2017-10-29.
 */
public class UserService1 {

    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper){
        this.userMapper =userMapper;
    }

   // private static final String SELECT_USERVO= "select * from user";
    public List<UserVO> getUserList(){
        //RowMapper<UserVO> mapper = new BeanPropertyRowMapper<UserVO>(UserVO.class);
        List<UserVO> userList = this.userMapper.getUserVO();
        return userList;
    }
}
