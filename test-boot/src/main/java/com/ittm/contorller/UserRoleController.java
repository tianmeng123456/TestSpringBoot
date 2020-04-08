package com.ittm.contorller;

import com.ittm.pojo.UserRole;
import com.ittm.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/userrole")
public class UserRoleController {
    @Autowired
    public UserRoleService userRoleService;

    /**
     * 保存一个用户的方法
     * @return
     */
    @GetMapping("/save")
    public String save(){
        String save = userRoleService.save(5);
        return save;
    }

    /**
     * 修改一个用户的方法
     * @return
     */
    @GetMapping("/upate")
    public String update(){
        String update = userRoleService.update(2);
        return update;
    }

    /**
     * 查询所有用户的方法
     * @return
     */
    @GetMapping("/select")
    public List<UserRole> selectList(){
        List<UserRole> userRoles = userRoleService.selectList();
        return userRoles;
    }

    /**
     * 删除一个用户的方法
     * @return
     */
    @GetMapping("/delete/{id}")
    public String deleteById(@PathVariable("id") int id){
        String delete = userRoleService.delete(id);
        return delete;
    }

    /**
     * 分页查询
     * @param page 当前页码
     * @param size 每页显示条说
     * @return
     */
    @GetMapping("/limit/{page}/{size}")
    public List<UserRole> findLimit(@PathVariable("page") int page,@PathVariable("size") int size){
        page = page-1;
        List<UserRole> userRoles = userRoleService.selectListLimt(page, size);
        return userRoles;
    }
}
