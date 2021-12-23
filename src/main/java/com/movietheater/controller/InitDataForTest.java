package com.movietheater.controller;

import com.movietheater.service.InitDataForTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController

public class InitDataForTest {

    @Autowired
    InitDataForTestService initDataForTestService;
    @PostConstruct
    public  void  InitData(){
//        initDataForTestService.initAccount();
//        initDataForTestService.initMovie();
//        initDataForTestService.initScheduleSeat();
//        initDataForTestService.initInvoice();

    }
}
