package us.codecraft.jobhunter.model;

import lombok.NonNull;
import org.apache.commons.codec.digest.DigestUtils;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.model.AfterExtractor;
import us.codecraft.webmagic.model.annotation.ExtractBy;
import us.codecraft.webmagic.model.annotation.ExtractByUrl;
import us.codecraft.webmagic.model.annotation.HelpUrl;
import us.codecraft.webmagic.model.annotation.TargetUrl;
import us.codecraft.webmagic.processor.PageProcessor;

/**
 * @author code4crafer@gmail.com
 *         Date: 13-6-23
 *         Time: 下午4:28
 */
//"//div[@class='detail-wrapper']//div[@class='header ']/a/img/@src"
//@TargetUrl(value="https://www.liepin.com/job/*",sourceRegion="//div[@class='job-info']//h3//a/@src")
//@HelpUrl(value="https://www.liepin.com/sojob/?dqs=020&&d_curPage=0&curPage=0")
public class LieTouJobInfo {

//    @ExtractBy(value = "//h1/text()",notNull=true)
    @NonNull
    private String title="";

//    @ExtractBy(value = "//p[@class='job-item-title']/text()",notNull=true)
    @NonNull
    private String salary="";

//    @ExtractBy(value = "//div[@class='title-info']/h3/a/text()",notNull=true)
    @NonNull
    private String company="";

//    @ExtractBy(value = "//div[@class='content content-word']/allText()",notNull=true)
    @NonNull
    private String description;

    private String source="liepin.com";

//    @ExtractByUrl(notNull=true)
    @NonNull
    private String url;

    private String urlMd5;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description!=null){
            this.description = description;
        }
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
        this.urlMd5 = DigestUtils.md5Hex(url);
    }

    public String getUrlMd5() {
        return urlMd5;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }


    public String toString2() {
        return "JobInfo{" +
                "title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return "JobInfo{" +
                "title='" + title + '\'' +
                ", salary='" + salary + '\'' +
                ", company='" + company + '\'' +
                ", source='" + source + '\'' +
                ", url='" + url + '\'' +
                ", urlMd5='" + urlMd5 + '\'' +
                '}';
    }



}
