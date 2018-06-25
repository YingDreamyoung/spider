package us.codecraft.jobhunter.crawler;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import us.codecraft.jobhunter.model.LieTouJobInfo;
import us.codecraft.jobhunter.processor.LieTouProcessor;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.model.OOSpider;
import us.codecraft.webmagic.pipeline.PageModelPipeline;

@Component
@Slf4j
public class AmazonCrawler {
//
//    @Qualifier("JobInfoDaoPipeline")
//    @Autowired
//    private PageModelPipeline jobInfoDaoPipeline;

    @Qualifier("LieTouProcessor")
    @Autowired
    private LieTouProcessor lieTouProcessor;
    public void crawl(){
        OOSpider.create(lieTouProcessor)
                .addUrl("https://www.liepin.com/zhaopin/?ckid=a3ade1a081e50e36&fromSearchBtn=2&compkind=&isAnalysis=&init=-1&searchType=1&dqs=&industryType=&jobKind=&sortFlag=15&degradeFlag=0&salary=&compscale=&key=&clean_condition=&headckid=a3ade1a081e50e36&d_pageSize=40&siTag=1B2M2Y8AsgTpgAmY7PhCfg~fA9rXquZc5IkJpXC-Ycixw&d_headId=4f984a9f0bf26d0a2b13a86b777c9c35&d_ckId=4f984a9f0bf26d0a2b13a86b777c9c35&d_sfrom=search_prime&d_curPage=0&curPage=0")
                .thread(1)
                .run();
    }

//    public List<CrawlerModel> crawlerModelList;
//    @Qualifier("amazonPageModelPipeline")
//    @Autowired
//    private AmazonPageModelPipeline amazonPageModelPipeline;
//    @Autowired(required = true)
//    private BaseCrawler baseCrawler;
//
//    public void amazoncrawler() {
//        log.info("started to collect the data of www.amazon.cn");
//        long startMili = System.currentTimeMillis();
//        for (CrawlerModel crawlerModel : crawlerModelList) {
//            init(crawlerModel.getTable(), crawlerModel.getFirst_sort(), crawlerModel.getSecond_sort());
//            baseCrawler.crawler(
//                    amazonPageModelPipeline,
//                    new HttpClientDownloader(),
//                    crawlerModel.getSeed(),
//                    Constants.THREADNUM,
//                    AmazonItem.class
//            );
//        }
//        long endMili = System.currentTimeMillis();
//        log.info("elapsed time:" + (endMili - startMili) + "ms");
//        log.info("collect the data end");
//    }
//
//    /**
//     * 准备数据
//     *
//     * @param table
//     * @param first_sort
//     * @param second_sort
//     */
//    private void init(String table, String first_sort, String second_sort) {
//        amazonPageModelPipeline.setTable(table);
//        amazonPageModelPipeline.setFirst_sort(first_sort);
//        amazonPageModelPipeline.setSecond_sort(second_sort);
//    }
//
//    public AmazonCrawler addCrawlerModel(List<CrawlerModel> list) {
//        try {
//            crawlerModelList=list;
//        } catch (Exception e) {
//            log.error("addCrawlerModel err",e);
//        }
//        return this;
//    }

}
