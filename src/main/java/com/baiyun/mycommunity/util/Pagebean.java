package com.baiyun.mycommunity.util;
//分页工具类
public class Pagebean {
    //当前的页数
    private int currentPage=1;
    //每一天显示的个数
    private int limit=5;
    //总的记录数
    private int totalCount;
    //每一天访问的路径
    private String path;

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        if(currentPage>=1){
            this.currentPage = currentPage;
        }

    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        if(limit>=1&&limit<=100){
            this.limit = limit;
        }

    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        if(totalCount>=0){
            this.totalCount = totalCount;
        }

    }
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    //获取当前页的起始行
    public int getIndex(){
        int index=(currentPage-1)*limit;
        return index;
    }
    //获取总的页数
    public int getTotalPage(){
        int totalPage=0;
        if(totalCount%2==0){
            totalPage=totalCount/limit;
        }else{
            totalPage=(totalCount/limit)+1;
        }
        return totalPage;
    }
    //获取起始页码
    public int getFrom(){
        int from=currentPage-2;
        return from<1?1:from;
    }
    //获取结束页码
    public int getEnd(){
        int to=currentPage+2;
        int total=getTotalPage();
        return to>total?total:to;
    }

}
