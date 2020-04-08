package com.ittm.contorller;

import com.ittm.common.ResultCode;
import com.ittm.common.ResultModel;
import com.ittm.pojo.FQuestionInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@RestController
@RequestMapping("/thyemeleafController")
public class thyemeleafController {


    @RequestMapping("/page")
    public <FQuestionIndex> ModelAndView getThymeleaf() {
        ModelAndView modelAndView = new ModelAndView("detal");

        try {
            FQuestionInfo fQuestionInfo = new FQuestionInfo();
            fQuestionInfo.setAuthor("cff");
            fQuestionInfo.setCatory("大爷");
            fQuestionInfo.setId(123123123L);
            fQuestionInfo.setOpen(1);
            fQuestionInfo.setStar(123);
            fQuestionInfo.setTitle("我就是一个测试模板引擎的实体而已。");

            fQuestionInfo.setCreateTime(new Date());

            ResultModel retOk = ResultModel.ok(fQuestionInfo);
            modelAndView.addObject("data", retOk);
        } catch (Exception e) {
            e.printStackTrace();
            modelAndView.addObject("data", new ResultModel(ResultCode.CODE_00004));
        }

        return modelAndView;
    }
}
