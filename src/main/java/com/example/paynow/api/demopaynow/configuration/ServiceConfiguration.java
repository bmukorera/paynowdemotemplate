package com.example.paynow.api.demopaynow.configuration;

import com.bmukorera.payment.config.PayNowConfiguration;
import com.bmukorera.payment.paynow.api.Paynow;
import com.bmukorera.payment.paynow.api.PaynowReceiverProcessorService;
import com.bmukorera.payment.paynow.api.PaynowUtilService;
import com.example.paynow.api.demopaynow.service.PaynowReceiverProcessorServiceImpl;
import com.example.paynow.api.demopaynow.service.TestService;
import com.example.paynow.api.demopaynow.service.TestServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(PayNowConfiguration.class)
public class ServiceConfiguration {

        @Bean
    TestService testService(PaynowUtilService paynowUtilService){
            TestServiceImpl testService=new TestServiceImpl();
            testService.setPaynowUtilService(paynowUtilService);
        return testService;
        }


    @Bean
    public PaynowReceiverProcessorService paynowReceiverProcessorService(){
        return new PaynowReceiverProcessorServiceImpl();//This can be modified to add constructor injection or to set //other parameters
    }


}
