package com.yash.springpemapp.daoimpl;

import com.yash.springpemapp.dao.UserDAO;
import com.yash.springpemapp.domain.User;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserDAOImpl extends BaseDAO implements UserDAO {
    @Override
    public void save(User user) {
        String sql = "insert into users (name, phone, email, loginName, password) VALUES (:name, :phone, :email, :loginName, :password)";
        Map<String, Object> map = new HashMap<>();
        map.put("name", user.getName());
        map.put("phone", user.getPhone());
        map.put("email", user.getEmail());
        map.put("loginName", user.getLoginName());
        map.put("password", user.getPassword());

        KeyHolder kh = new GeneratedKeyHolder();
        SqlParameterSource ps = new MapSqlParameterSource(map);
        getNamedParameterJdbcTemplate().update(sql, ps, kh);
        Integer userId = kh.getKey().intValue();
        user.setUserId(userId);
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void delete(Integer userId) {

    }

    @Override
    public User findById(Integer userId) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public List<User> findByProperty(String propertyName, Object propertyValue) {
        return null;
    }
}
