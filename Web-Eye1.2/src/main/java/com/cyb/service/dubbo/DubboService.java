package com.cyb.service.dubbo;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cyb.dubbo.test.EchoService;
import com.cyb.dubbo.test.HelloService;

/**
 * @author iechenyb
 * @since 0.0.0
 */
@Service
public class	 DubboService  {
	
    @Reference(version = "1.0.0")
	public EchoService echoService;
    
    @Reference(version = "1.0.0")
   	public HelloService helloService;
	
}
