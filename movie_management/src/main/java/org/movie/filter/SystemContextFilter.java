package org.movie.filter;


import org.movie.utils.SystemContext;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author guowei
 *         修改时间： 2017/3/30.
 */
public class SystemContextFilter implements Filter {

    private int pageSize = 0;

    @Override
    public void init(FilterConfig cfg) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
      try {
          int pageOffset = 0;
          int pageSize = 10;
          String sort = req.getParameter("sort");
          String order = req.getParameter("order");
          try {
              pageOffset = Integer.parseInt(req.getParameter("pager.offset"));
          }catch (NumberFormatException e){

          }
          SystemContext.setOrder(order);
          SystemContext.setSort(sort);
          SystemContext.setPageOffset(pageOffset);
          SystemContext.setPageSize(pageSize);
          chain.doFilter(req,resp);
      }finally {
          SystemContext.removeOrder();
          SystemContext.removeSort();
          SystemContext.removePageOffset();
          SystemContext.removePageSize();
      }
    }

    @Override
    public void destroy() {

    }
}
