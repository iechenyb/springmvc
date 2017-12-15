package com.cyb.quartz;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.cyb.service.NetServiceImpl;
/**
 *作者 : iechenyb<br>
 *类描述: https://www.cnblogs.com/lic309/p/4089633.html<br>
 *创建时间: 2017年12月14日
 */
@Component
@Configurable
@EnableScheduling
public class ScheduledTasks{
	Log log = LogFactory.getLog(ScheduledTasks.class);
	
	@Autowired
	NetServiceImpl netService;
	
    @Scheduled(fixedRate = 1000 * 30)
    public void reportCurrentTime(){
    	netService.saveUrlTest("http://www.baidu.com");
        System.out.println ("Scheduling Tasks Examples: The time is now " + dateFormat ().format (new Date ()));
    }

    //每1分钟执行一次
    @Scheduled(cron = "0 */1 *  * * * ")
    public void reportCurrentByCron(){
        System.out.println ("Scheduling Tasks Examples By Cron: The time is now " + dateFormat ().format (new Date ()));
    }

    private SimpleDateFormat dateFormat(){
        return new SimpleDateFormat ("HH:mm:ss");
    }
    
}
