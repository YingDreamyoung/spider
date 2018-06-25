//package us.codecraft.jobhunter.scheduler;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.scheduling.annotation.EnableScheduling;
//import org.springframework.scheduling.annotation.SchedulingConfigurer;
//import org.springframework.scheduling.config.ScheduledTaskRegistrar;
//import org.springframework.scheduling.support.CronTrigger;
//
//import java.util.concurrent.Executor;
//import java.util.concurrent.Executors;
//
///**
// * @author Mr_Tank_
// *
// */
//@Configuration
//@EnableScheduling
//public class BaseScheduler implements SchedulingConfigurer {
//
////    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
////        scheduledTaskRegistrar.setScheduler(taskScheduler());
////        scheduledTaskRegistrar.addTriggerTask(new Runnable() {
////            public void run() {
////            }
////        }, new CronTrigger("0 30 23 ? * MON-FRI"));
////    }
//////    @Bean(destroyMethod="shutdown")
////    @Bean
////    public Executor taskScheduler() {
////        return Executors.newScheduledThreadPool(100);
////    }
////    @Bean
////    public AmazonScheduler getAmazonScheduler(){
////        return new AmazonScheduler();
////    }
//
////    public static void main(String[] args) {
////        //Use the @Configuration bean information start the container
//////        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(BaseScheduler.class);
////        //BaseScheduler baseScheduler=applicationContext.getBean(BaseScheduler.class);
////    }
//}
