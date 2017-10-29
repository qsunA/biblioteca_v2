package service.user;

import model.user.UserVO;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by Administrator on 2017-10-29.
 */
public class UserService {

    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    private static final String SELECT_USERVO= "select * from user";
    public List<UserVO> getUserList(){
        RowMapper<UserVO> mapper = new BeanPropertyRowMapper<UserVO>(UserVO.class);
        List<UserVO> userList = jdbcTemplate.query(UserService.SELECT_USERVO, mapper);
        return userList;
    }
}
