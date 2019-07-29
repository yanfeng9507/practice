package cn.xiaoyanol.practice.spider.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class SpiderImagesUrl implements Serializable {
    private Long id;

    /**
     * "图集Id"
     */
    private Long imagesId;

    private Integer no;

    /**
     * "图片具体地址"
     */
    private String url;

    /**
     * "图片所在页面url"
     */
    private String referUrl;

    private Date ctime;

    private Date utime;

    private Integer status;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getImagesId() {
        return imagesId;
    }

    public void setImagesId(Long imagesId) {
        this.imagesId = imagesId;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getReferUrl() {
        return referUrl;
    }

    public void setReferUrl(String referUrl) {
        this.referUrl = referUrl;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Date getUtime() {
        return utime;
    }

    public void setUtime(Date utime) {
        this.utime = utime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}