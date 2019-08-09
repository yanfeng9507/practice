package cn.xiaoyanol.practice.design.pattern.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class SpiderImages implements Serializable {
    private Long id;

    /**
     * "所属分类"
     */
    private Long categoryId;

    /**
     * ”发行机构“
     */
    private String issuer;

    /**
     * "期刊编号"
     */
    private String numbers;

    /**
     * "图片数量"
     */
    private Integer total;

    /**
     * 分辨率
     */
    private String resolvingPower;

    /**
     * "模特名称"
     */
    private String name;

    /**
     * "发行时间"
     */
    private String publishTime;

    /**
     * "备注"
     */
    private String remarks;

    /**
     * "图集本地地址"
     */
    private String localPath;

    /**
     * "当前图集其实url"
     */
    private String url;

    /**
     * "是否下载完成 0 - 未下载 1 - 下载完成"
     */
    private Integer isDownload;

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

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public String getNumbers() {
        return numbers;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getResolvingPower() {
        return resolvingPower;
    }

    public void setResolvingPower(String resolvingPower) {
        this.resolvingPower = resolvingPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getLocalPath() {
        return localPath;
    }

    public void setLocalPath(String localPath) {
        this.localPath = localPath;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getIsDownload() {
        return isDownload;
    }

    public void setIsDownload(Integer isDownload) {
        this.isDownload = isDownload;
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