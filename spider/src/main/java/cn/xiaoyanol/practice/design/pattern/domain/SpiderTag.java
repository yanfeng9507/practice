package cn.xiaoyanol.practice.design.pattern.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class SpiderTag implements Serializable {
    private Long id;

    /**
     * "图集id"
     */
    private Long imagesId;

    /**
     * "标签名"
     */
    private String tag;

    private Date ctime;

    private Date utime;

    private String status;

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

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}