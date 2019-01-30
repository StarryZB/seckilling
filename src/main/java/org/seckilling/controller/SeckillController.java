package org.seckilling.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.seckilling.beans.Seckill;
import org.seckilling.exception.ReduceException;
import org.seckilling.exception.RepeatException;
import org.seckilling.service.SeckillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/seckilling")
public class SeckillController {

    @Autowired
    private SeckillService seckillService;

    @RequestMapping("form")
    public ModelAndView getSeckill() {
        ModelAndView mv = new ModelAndView("form");
        long seckillId = 1;//目前只有一件秒杀
        Seckill seckill = seckillService.getSeckill(seckillId);
        mv.addObject("seckill",seckill);
        return mv;
    }

    @RequestMapping(value = "/excute", method = RequestMethod.POST)
    public ModelAndView excuteSuccess(@RequestParam("id") long userId) {
        ModelAndView modelAndView = new ModelAndView();
        long seckillId = 1;//目前只有一件秒杀
        try {
             int excuteSeckill = seckillService.excuteSeckill(seckillId,userId);
             modelAndView.setViewName("success");
        } catch (ReduceException e) {
            modelAndView.setViewName("reducefail");
            System.out.println("库存不足");

        } catch (RepeatException e) {
            modelAndView.setViewName("repeatfail");
            System.out.println("重复秒杀");
        } catch (Exception e) {
            System.out.println("未知错误");
        }
        return modelAndView;


    }
}
