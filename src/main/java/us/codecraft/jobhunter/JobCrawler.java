package us.codecraft.jobhunter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import us.codecraft.jobhunter.model.LieTouJobInfo;
import us.codecraft.jobhunter.processor.LieTouProcessor;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.model.OOSpider;
import us.codecraft.webmagic.pipeline.PageModelPipeline;

/**
 * @author code4crafer@gmail.com
 *         Date: 13-6-23
 *         Time: 下午4:19
 */
@Component
public class JobCrawler {
//
//    @Qualifier("JobInfoDaoPipeline")
//    @Autowired
//    private PageModelPipeline jobInfoDaoPipeline;



//    public void crawl() {
//        OOSpider.create(Site.me()
//                .setUserAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_8_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/31.0.1650.57 Safari/537.36")
//                ,jobInfoDaoPipeline
//                , LieTouJobInfo.class)
//                .addUrl("https://www.liepin.com/sojob/?dqs=020&curPage=0")
//                .thread(1)
//                .run();
//    }

//    public void crawl(){
//        OOSpider.create(lieTouProcessor)
//                .addUrl("https://www.liepin.com/zhaopin/?ckid=a3ade1a081e50e36&fromSearchBtn=2&compkind=&isAnalysis=&init=-1&searchType=1&dqs=&industryType=&jobKind=&sortFlag=15&degradeFlag=0&salary=&compscale=&key=&clean_condition=&headckid=a3ade1a081e50e36&d_pageSize=40&siTag=1B2M2Y8AsgTpgAmY7PhCfg~fA9rXquZc5IkJpXC-Ycixw&d_headId=4f984a9f0bf26d0a2b13a86b777c9c35&d_ckId=4f984a9f0bf26d0a2b13a86b777c9c35&d_sfrom=search_prime&d_curPage=0&curPage=0")
//                .thread(1)
//                .run();
//    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/spring/applicationContext*.xml");
//        JobCrawler jobCrawler = applicationContext.getBean(JobCrawler.class);
//        jobCrawler.crawl();


    }
}
