package com.ittm.service;

import com.ittm.dao.UserInfoDao;
import com.ittm.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class UserInfoService {
    @Autowired
    UserInfoDao userInfoDao;

    /**
     * 保存一个用户
     * @return
     */
    @Transactional
    public Object save(){
        UserInfo u = new UserInfo();
        u.setPhone("123456789");
        u.setUserName("田猛");
        UserInfo save = userInfoDao.save(u);
        return save;
    }

    /**
     * 删除方法的测试
     * @param id
     * @return
     */
    @Transactional
    public Object delete(Integer id){
        userInfoDao.deleteById(id);
        return "删除成功";
    }

    /**
     * 修改方法的测试
     */
    @Transactional
    public Object update(Integer id){
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("修改完成");
        userInfo.setId(id);
        Optional<UserInfo> byId = userInfoDao.findById(userInfo.getId());
        if(byId.isPresent()){
            UserInfo userInfo1 = byId.get();
            userInfo1.setUserName(userInfo.getUserName());
            userInfoDao.save(userInfo);
        }
        return "修改成功";
    }

    /**
     * 查询方法
     */
    public List<UserInfo> selectBylist(){
        List<UserInfo> all = userInfoDao.findAll();
        return all;
    }
}
