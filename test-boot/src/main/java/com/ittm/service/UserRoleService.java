package com.ittm.service;

import com.ittm.dao.UserRoleMapper;
import com.ittm.pojo.UserRole;
import com.ittm.pojo.UserRoleExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleService {
    @Autowired
    public UserRoleMapper userRoleMapper;

    /**
     * 删除方法
     * @param id
     * @return
     */
    public String delete(int id){
        int i = userRoleMapper.deleteByPrimaryKey(id);
        return "成功";
    }

    /**
     * 修改方法
     * @param id
     * @return
     */
    public String update(int id){
        UserRole role = userRoleMapper.selectByPrimaryKey(id);
        role.setUsername("田猛");
        int i = userRoleMapper.updateByPrimaryKey(role);
        return "成功";
    }

    /**
     * 保存方法
     * @param id
     * @return
     */
    public String save(int id){
        UserRole userRole = new UserRole();
        userRole.setId(id);
        userRole.setUsername("保存");
        userRoleMapper.insert(userRole);
        return "成功";
    }

    /**
     * 查询全部方法
     * @return
     */
    public List<UserRole> selectList(){
        UserRoleExample userRoleExample = new UserRoleExample();
        List<UserRole> userRoles = userRoleMapper.selectByExample(userRoleExample);
        return userRoles;
    }

    /**
     * 测试分页分页查询的方法
     * @param page  当前页码
     * @param size 每页显示条数
     * @return
     */
    public List<UserRole> selectListLimt(int page,int size){
        List<UserRole> userRoles = userRoleMapper.testPageSql(page,size);
        return userRoles;
    }
}
