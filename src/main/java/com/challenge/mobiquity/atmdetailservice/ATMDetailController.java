package com.challenge.mobiquity.atmdetailservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableFeignClients
@Slf4j
public class ATMDetailController {

    @Autowired
    ATMDetailClient aTMDetailClient;

    @GetMapping("/atm/details/list")
    public void getAllAtmDetails() {
        ATMDetails atmDetails = aTMDetailClient.getAtmDetails();
        System.out.println("atm Details " + atmDetails);
        log.info("details {}", atmDetails);
    }

}
