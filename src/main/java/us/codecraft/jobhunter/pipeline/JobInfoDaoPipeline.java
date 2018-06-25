//package us.codecraft.jobhunter.pipeline;
//
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.dao.DuplicateKeyException;
//import org.springframework.stereotype.Component;
//import us.codecraft.jobhunter.dao.JobInfoDAO;
//import us.codecraft.jobhunter.model.LieTouJobInfo;
//import us.codecraft.webmagic.Task;
//import us.codecraft.webmagic.pipeline.PageModelPipeline;
//import javax.annotation.Resource;
//
///**
// * @author code4crafer@gmail.com
// *         Date: 13-6-23
// *         Time: 下午8:56
// */
//@Component("JobInfoDaoPipeline")
//@Slf4j
//public class JobInfoDaoPipeline implements PageModelPipeline<LieTouJobInfo> {
//    @Resource
//    private JobInfoDAO jobInfoDAO;
//
//    @Override
//    public void process(LieTouJobInfo lieTouJobInfo, Task task) {
//        try{
//            jobInfoDAO.add(lieTouJobInfo);
//            log.info("数据保存成功: {}"+lieTouJobInfo.getUrl());
//        }catch (DuplicateKeyException e){
//            log.warn("数据重复了: {}"+lieTouJobInfo.getUrl());
//        }catch (Exception e){
//            log.warn("数据保存异常", e);
//        }
//
//
//    }
//}
