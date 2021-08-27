package com.challenge.mobiquity.atmdetailservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "atmList", url = "https://www.ing.nl")
public interface ATMDetailClient {
    @RequestMapping(value = "/api/locator/atms/", method = RequestMethod.GET)
    public ATMDetails getAtmDetails();
}
