package com.movietheater.controller;


import com.movietheater.dto.ResponInvoiceDTO;
import com.movietheater.service.InitDataForTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {

    @Autowired
    InitDataForTestService initDataForTestService;

    @GetMapping("/ticket/{userName}")
    public ResponInvoiceDTO getTicket(@PathVariable String userName){
        return initDataForTestService.getTicket(userName);
    }
}
