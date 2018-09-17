package com.example.paynow.api.demopaynow.service;

import com.bmukorera.payment.paynow.api.Paynow;
import com.bmukorera.payment.paynow.api.PaynowUtilService;

public class TestServiceImpl implements TestService {

    PaynowUtilService paynowUtilService;

    public void setPaynowUtilService(PaynowUtilService paynowUtilService) {
        this.paynowUtilService = paynowUtilService;
    }

    @Override
    public void testMethod() {

    }

}
