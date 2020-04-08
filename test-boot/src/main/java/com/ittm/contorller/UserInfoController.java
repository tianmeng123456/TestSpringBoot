package com.ittm.contorller;

import com.ittm.pojo.UserInfo;
import com.ittm.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * UserInfo 的控制程
 */
@RestController
@RequestMapping("/userinfo")
public class UserInfoController {
    @Autowired
    UserInfoService userInfoService;

    /**
     * 保存UserInfo
     * @return
     */
    @GetMapping("/save")
    public String save(){
        Object save = userInfoService.save();
        String s = save.toString();
        return s;
    }

    /**
     * 删除UserInfo
     * @return
     */
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id){
        Object save = userInfoService.delete(id);
        String s = save.toString();
        return s;
    }

    /**
     * 修改UserInfo
     * @return
     */
    @GetMapping("/update/{id}")
    public String update(@PathVariable("id") Integer id){
        Object save = userInfoService.update(id);
        String s = save.toString();
        return s;
    }

    /**
     * 查询所有UserInfo
     * @return
     */
    @GetMapping("/findall")
    public List<UserInfo> findall(){
        List<UserInfo> userInfos = userInfoService.selectBylist();
        return userInfos;
    }

}
