package cn.xiaoyanol.practice.spider.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class SpiderCategory implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * "类别英文名称"
     */
    private String category;

    /**
     * "类别中文名称"
     */
    private String categoryName;

    /**
     * "当前类的url"
     */
    private String categoryUrl;

    private Date ctime;

    private Date utime;

    /**
     * "是否有效"
     */
    private Integer status;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryUrl() {
        return categoryUrl;
    }

    public void setCategoryUrl(String categoryUrl) {
        this.categoryUrl = categoryUrl;
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