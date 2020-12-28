package com.api.apitest.controller;

import com.api.apitest.bean.HogeBean;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
    /**
     * メイン処理。localhost:8080/ にアクセスすることで発火する。
     * 以下のパラメータ群は、URLから直接GET形式で値を設定出来る。
     * 
     * @param hoge
     * @param fuga
     * @return PathParamの値を反映したJson
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public HogeBean get(@RequestParam(name = "hoge", required = false) String hoge,
            @RequestParam(name = "fuga", required = false) String fuga) {

        HogeBean hogeBean = new HogeBean();
        hogeBean.setHoge(hoge);
        hogeBean.setFuga(fuga);

        return hogeBean;
    }
}