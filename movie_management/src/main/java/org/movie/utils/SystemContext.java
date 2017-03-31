package org.movie.utils;

/**
 * @author guowei
 *         修改时间： 2017/3/30.
 */
public class SystemContext {
    private static ThreadLocal<Integer> pageSize=new ThreadLocal<Integer>();
    private static ThreadLocal<Integer> pageIndex=new ThreadLocal<Integer>();
    private static ThreadLocal<Integer> pageOffset=new ThreadLocal<Integer>();
    private static ThreadLocal<String> order = new ThreadLocal<>();
    private static ThreadLocal<String> sort = new ThreadLocal<>();

    public static String getOrder(){
        return  order.get();
    }
    public static void setOrder(String _order){
        order.set(_order);
    }
    public static void removeOrder(){
        order.remove();
    }

    public static Integer getPageSize() {
        return pageSize.get();
    }
    public static void removePageSize(){
        pageSize.remove();
    }
    public static void setPageSize(Integer _pageSize) {
        pageSize.set(_pageSize);
    }

    public static Integer getPageIndex() {
        return pageIndex.get();
    }
    public static void removePageIndex(){
        pageIndex.remove();
    }
    public static void setPageIndex(Integer _pageIndex) {
        pageIndex.set(_pageIndex);
    }

    public static Integer getPageOffset() {
        return pageOffset.get();
    }

    public static void setPageOffset(Integer _pageOffset) {
        pageOffset.set(_pageOffset);
    }
    public static void removePageOffset(){
        pageOffset.remove();
    }

    public static String getSort() {
        return sort.get();
    }

    public static void setSort(String _sort){
        sort.set(_sort);
    }
    public static void removeSort(){
        sort.remove();
    }
}
