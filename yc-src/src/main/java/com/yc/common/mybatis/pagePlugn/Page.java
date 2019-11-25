package com.yc.common.mybatis.pagePlugn;

/**
 * @创建人 zhangpj
 * @创建时间 2017/11/28
 * @描述
 **/

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**自己看看，需要什么字段加什么字段吧*/
public class Page<T> {

    public static final int DEFAULT_PAGE_SIZE = 20;

    protected int pageNo = 1; // 当前页, 默认为第1页
    protected int pageSize = DEFAULT_PAGE_SIZE; // 每页记录数
    protected long totalRecord = -1; // 总记录数, 默认为-1, 表示需要查询
    protected int totalPage = -1; // 总页数, 默认为-1, 表示需要计算

    protected List<T> results; // 当前页记录List形式


    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
        computeTotalPage();
    }

    public long getTotalRecord() {
        return totalRecord;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalRecord(long totalRecord) {
        this.totalRecord = totalRecord;
        computeTotalPage();
    }

    protected void computeTotalPage() {
        if (getPageSize() > 0 && getTotalRecord() > -1) {
            this.totalPage = (int) (getTotalRecord() % getPageSize() == 0 ? getTotalRecord() / getPageSize() : getTotalRecord() / getPageSize() + 1);
        }
    }

    public List<T> getResults() {
        return results;
    }

    public void setResults(List<T> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder().append("Page [pageNo=").append(pageNo).append(", pageSize=").append(pageSize)
                .append(", totalRecord=").append(totalRecord < 0 ? "null" : totalRecord).append(", totalPage=")
                .append(totalPage < 0 ? "null" : totalPage).append(", results=").append(results == null ? "null" : results).append("]");
        return builder.toString();
    }

    public Map getPageResult(List<Map> list) {
        Map map = new HashMap();
        map.put("data",list);
        map.put("total",this.getTotalRecord());
        map.put("totalPage",this.getTotalPage());
        return map;
    }

}