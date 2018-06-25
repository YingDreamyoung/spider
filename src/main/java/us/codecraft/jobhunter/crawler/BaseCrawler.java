//package us.codecraft.jobhunter.crawler;
//
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Component;
//import us.codecraft.webmagic.downloader.Downloader;
//import us.codecraft.webmagic.pipeline.PageModelPipeline;
//
//@Component
//@Slf4j
//public class BaseCrawler {
////    private log log = log.getlog(getClass());
//
//    /**
//     * General crawler entrance
//     *
//     * @param pageModelPipeline
//     * @param downloader
//     * @param seed
//     * @param thread
//     * @param clazz
//     */
//    public void crawler(PageModelPipeline pageModelPipeline, Downloader downloader, String seed, int thread, Class clazz) {
//        log.info("started to collect the data of module");
//        // Each module timing
//        // startMili:The number of milliseconds the current time
//        long startMili = System.currentTimeMillis();
//        //Create the crawler
////        OOSpider.create(
////                Site.me().setUserAgent(Constants.USERAGENT).setTimeOut(3000),
////                pageModelPipeline, clazz)
////                .setDownloader(downloader)
////                .addUrl(seed)
////                .thread(thread)
////                .run();
//        //The end of time
//        long endMili = System.currentTimeMillis();
//        log.info("elapsed time:" + (endMili - startMili) + "ms");
//        log.info("collect the data of module end");
//    }
//}
