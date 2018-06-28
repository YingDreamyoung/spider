package us.codecraft.jobhunter.scheduler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import us.codecraft.jobhunter.crawler.AmazonCrawler;


/**
 * @author Mr_Tank_
 *
 */
@Component
@Slf4j
public class AmazonScheduler{

    @Autowired
    private AmazonCrawler amazonCrawler;

//    @Scheduled(cron = "0/30 * * * * ?")//cron for test
    public void test(){
        System.out.println("听说30s 触发一次"+System.currentTimeMillis());
        log.info("scheduler test.");
    }


    @Scheduled(cron = "0 1/30 * * * ?")
    public void amazonScheduler(){
        System.out.println("听说延迟1分钟，30m  触发一次"+System.currentTimeMillis());
        log.info("Amazon Crawler run!");
        amazonCrawler.crawl();
        System.out.println(">>>>>>>>>>>>>>>>>>");
    }

}
