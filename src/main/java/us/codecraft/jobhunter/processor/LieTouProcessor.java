package us.codecraft.jobhunter.processor;

import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Component;
import us.codecraft.jobhunter.dao.JobInfoDAO;
import us.codecraft.jobhunter.model.LieTouJobInfo;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.PlainText;

import javax.annotation.Resource;

@Component("LieTouProcessor")
@Slf4j
public class LieTouProcessor implements PageProcessor {

    @Resource
    private JobInfoDAO jobInfoDAO;

    public static final String URL_LIST = "https://www\\.liepin\\.com/zhaopin/\\?ckid=a3ade1a081e50e36&fromSearchBtn=2&compkind=&isAnalysis=&init=-1&searchType=1&dqs=&industryType=&jobKind=&sortFlag=15&degradeFlag=0&salary=&compscale=&key=&clean_condition=&headckid=a3ade1a081e50e36&d_pageSize=40&siTag=1B2M2Y8AsgTpgAmY7PhCfg~fA9rXquZc5IkJpXC-Ycixw&d_headId=4f984a9f0bf26d0a2b13a86b777c9c35&d_ckId=4f984a9f0bf26d0a2b13a86b777c9c35&d_sfrom=search_prime&d_curPage=0&curPage=[0|1]";
    public static final String URL_POST = "https://www\\.liepin\\.com/job/\\w+\\.shtml";

    private Site site = Site
            .me()
            .setSleepTime(3000)
            .setRetryTimes(3)
            .setTimeOut(10000)
            .setUserAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_8_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/31.0.1650.57 Safari/537.36");

    @Override
    public void process(Page page) {

        if (page.getResultItems().get("name")==null){
            //skip this page
//            page.setSkip(true);
        }

        //列表页
        if (page.getUrl().regex(URL_LIST).match()) {
            page.addTargetRequests(page.getHtml().xpath("//div[@class='job-info']/h3/a[@href]").links().regex(URL_POST).all());
            page.addTargetRequests(Lists.newArrayList("https://www.liepin.com/zhaopin/?ckid=a3ade1a081e50e36&fromSearchBtn=2&compkind=&isAnalysis=&init=-1&searchType=1&dqs=&industryType=&jobKind=&sortFlag=15&degradeFlag=0&salary=&compscale=&key=&clean_condition=&headckid=a3ade1a081e50e36&d_pageSize=40&siTag=1B2M2Y8AsgTpgAmY7PhCfg~fA9rXquZc5IkJpXC-Ycixw&d_headId=4f984a9f0bf26d0a2b13a86b777c9c35&d_ckId=4f984a9f0bf26d0a2b13a86b777c9c35&d_sfrom=search_prime&d_curPage=0&curPage=1"));
            page.addTargetRequests(page.getHtml().links().regex(URL_LIST).all());
            //文章页
        } else {
            LieTouJobInfo lieTouJobInfo=new LieTouJobInfo();
            lieTouJobInfo.setTitle(page.getHtml().xpath("//h1/text()").toString());
            lieTouJobInfo.setSalary(page.getHtml().xpath("//p[@class='job-item-title']/text()").toString());
            lieTouJobInfo.setCompany(page.getHtml().xpath("//div[@class='title-info']/h3/a/text()").toString());
            lieTouJobInfo.setDescription(page.getHtml().xpath("//div[@class='content content-word']/allText()").toString());
            lieTouJobInfo.setSource("liepin.com");
            lieTouJobInfo.setUrl(page.getUrl().toString());

            try{
                jobInfoDAO.add(lieTouJobInfo);
                log.info("数据保存成功: {}"+lieTouJobInfo.getUrl());
            }catch (DuplicateKeyException e){
                log.warn("数据重复了: {}"+lieTouJobInfo.getUrl());
            }catch (Exception e){
                log.warn("数据保存异常", e);
            }
        }
    }

    @Override
    public Site getSite() {
        return site;
    }
}
