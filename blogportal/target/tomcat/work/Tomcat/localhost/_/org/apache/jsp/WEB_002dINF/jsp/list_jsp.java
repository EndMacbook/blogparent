/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-03-26 09:06:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!doctype html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <title>首页_陈C个人博客 - 一个站在java后端开发之路的技术员个人博客网站</title>\r\n");
      out.write("  <meta name=\"keywords\" content=\"个人博客,陈C个人博客,个人博客模板,陈C\" />\r\n");
      out.write("  <meta name=\"description\" content=\"陈C个人博客，是一个站在java后端开发之路的萌新程序员个人网站。\" />\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("  <link href=\"css/base.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"css/index.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"css/m.css\" rel=\"stylesheet\">\r\n");
      out.write("  <script src=\"js/jquery.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("  <script type=\"text/javascript\" src=\"js/hc-sticky.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\" src=\"js/comm.js\"></script>\r\n");
      out.write("  <!--[if lt IE 9]-->\r\n");
      out.write("  <script src=\"js/modernizr.js\"></script>\r\n");
      out.write("  <!--[endif]-->\r\n");
      out.write("  <script src=\"/js/vue.js\"></script>\r\n");
      out.write("  <script src=\"/js/public.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("      $(function(){\r\n");
      out.write("          getBlogList(1,10);\r\n");
      out.write("      });\r\n");
      out.write("\r\n");
      out.write("      function getBlogList(page,rows){\r\n");
      out.write("          var obj={page:page,rows:rows};\r\n");
      out.write("          doDataSyn(\"/blog/list\",obj,function(data){\r\n");
      out.write("              new Vue({\r\n");
      out.write("                  el:\"#blogList\",\r\n");
      out.write("                  data:data,\r\n");
      out.write("\r\n");
      out.write("              });\r\n");
      out.write("          });\r\n");
      out.write("      }\r\n");
      out.write("  </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<header class=\"header-navigation\" id=\"header\">\r\n");
      out.write("  <nav><div class=\"logo\"><a href=\"/\">陈C个人博客</a></div>\r\n");
      out.write("    <h2 id=\"mnavh\"><span class=\"navicon\"></span></h2>\r\n");
      out.write("    <ul id=\"starlist\">\r\n");
      out.write("      <li><a href=\"index.html\">网站首页</a></li>\r\n");
      out.write("      <li><a href=\"share.html\">我的相册</a></li>\r\n");
      out.write("      <li><a href=\"list.html\">我的日记</a></li>\r\n");
      out.write("      <li><a href=\"about.html\">关于我</a></li>\r\n");
      out.write("      <li><a href=\"gbook.html\">留言</a></li>\r\n");
      out.write("      <li><a href=\"info.html\">内容页</a></li>\r\n");
      out.write("      <li><a href=\"infopic.html\">内容页</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </nav>\r\n");
      out.write("</header>\r\n");
      out.write("<article>\r\n");
      out.write("  <aside class=\"l_box\">\r\n");
      out.write("    <div class=\"search\">\r\n");
      out.write("      <form action=\"/e/search/index.php\" method=\"post\" name=\"searchform\" id=\"searchform\">\r\n");
      out.write("        <input name=\"keyboard\" id=\"keyboard\" class=\"input_text\" value=\"请输入关键字词\" style=\"color: rgb(153, 153, 153);\" onfocus=\"if(value=='请输入关键字词'){this.style.color='#000';value=''}\" onblur=\"if(value==''){this.style.color='#999';value='请输入关键字词'}\" type=\"text\">\r\n");
      out.write("        <input name=\"show\" value=\"title\" type=\"hidden\">\r\n");
      out.write("        <input name=\"tempid\" value=\"1\" type=\"hidden\">\r\n");
      out.write("        <input name=\"tbname\" value=\"news\" type=\"hidden\">\r\n");
      out.write("        <input name=\"Submit\" class=\"input_submit\" value=\"搜索\" type=\"submit\">\r\n");
      out.write("      </form>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"fenlei\">\r\n");
      out.write("      <h2>文章分类</h2>\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li><a href=\"/\">学无止境（33）</a></li>\r\n");
      out.write("        <li><a href=\"/\">日记（19）</a></li>\r\n");
      out.write("        <li><a href=\"/\">慢生活（520）</a></li>\r\n");
      out.write("        <li><a href=\"/\">美文欣赏（40）</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"tuijian\">\r\n");
      out.write("      <h2>站长推荐</h2>\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li><a href=\"/\">你是什么人便会遇上什么人</a></li>\r\n");
      out.write("        <li><a href=\"/\">帝国cms 列表页调用子栏目，没有则不显示栏目名称</a></li>\r\n");
      out.write("        <li><a href=\"/\">第二届 优秀个人博客模板比赛参选活动</a></li>\r\n");
      out.write("        <li><a href=\"/\">个人博客模板《绅士》后台管理</a></li>\r\n");
      out.write("        <li><a href=\"/\">你是什么人便会遇上什么人</a></li>\r\n");
      out.write("        <li><a href=\"/\">帝国cms 列表页调用子栏目，没有则不显示栏目名称</a></li>\r\n");
      out.write("        <li><a href=\"/\">第二届 优秀个人博客模板比赛参选活动</a></li>\r\n");
      out.write("        <li><a href=\"/\">个人博客模板《绅士》后台管理</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"tuijian\">\r\n");
      out.write("      <h2>点击排行</h2>\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li><a href=\"/\">你是什么人便会遇上什么人</a></li>\r\n");
      out.write("        <li><a href=\"/\">帝国cms 列表页调用子栏目，没有则不显示栏目名称</a></li>\r\n");
      out.write("        <li><a href=\"/\">第二届 优秀个人博客模板比赛参选活动</a></li>\r\n");
      out.write("        <li><a href=\"/\">个人博客模板《绅士》后台管理</a></li>\r\n");
      out.write("        <li><a href=\"/\">你是什么人便会遇上什么人</a></li>\r\n");
      out.write("        <li><a href=\"/\">帝国cms 列表页调用子栏目，没有则不显示栏目名称</a></li>\r\n");
      out.write("        <li><a href=\"/\">第二届 优秀个人博客模板比赛参选活动</a></li>\r\n");
      out.write("        <li><a href=\"/\">个人博客模板《绅士》后台管理</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"cloud\">\r\n");
      out.write("      <h2>标签云</h2>\r\n");
      out.write("      <ul>\r\n");
      out.write("        <a href=\"/\">陌上花开</a> <a href=\"/\">校园生活</a> <a href=\"/\">html5</a> <a href=\"/\">SumSung</a> <a href=\"/\">青春</a> <a href=\"/\">温暖</a> <a href=\"/\">阳光</a> <a href=\"/\">三星</a><a href=\"/\">索尼</a> <a href=\"/\">华维荣耀</a> <a href=\"/\">三星</a> <a href=\"/\">索尼</a>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"guanzhu\">\r\n");
      out.write("      <h2>关注我 么么哒</h2>\r\n");
      out.write("      <ul>\r\n");
      out.write("        <img src=\"images/wx.jpg\">\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("  </aside>\r\n");
      out.write("  <main id=\"blogList\" class=\"r_box\">\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <li v-for=\"blog in rows\">\r\n");
      out.write("      <i><a href=\"/\"><img src=\"images/4.jpg\"></a></i>\r\n");
      out.write("      <h3><a :href=\"'/blog/'+blog.id+'.html'\">{{ blog.title }}</a></h3>\r\n");
      out.write("      <p>{{ blog.summary }}</p>\r\n");
      out.write("    </li>\r\n");
      out.write("    <div class=\"pagelist\"><a class=\"allpage\"><b>99</b></a>&nbsp;&nbsp;<a href=\"#\" class=\"curPage\">1</a>&nbsp;&nbsp;<a href=\"#\" onclick=\"page(2)\">2</a>&nbsp;&nbsp;<a href=\"#\" onclick=\"page(3)\">3</a>&nbsp;&nbsp;<a href=\"#\" onclick=\"page(4)\">4</a>&nbsp;&nbsp;<a href=\"#\" onclick=\"page(5)\">5</a>&nbsp;&nbsp;<a href=\"#\" onclick=\"page(6)\">6</a>&nbsp;&nbsp;<a href=\"#\" onclick=\"page(7)\">7</a>&nbsp;&nbsp;<a href=\"#\" onclick=\"page(8)\">8</a>&nbsp;&nbsp;<a href=\"#\" onclick=\"page(9)\">9</a>&nbsp;&nbsp;<a href=\"#\" onclick=\"page(2)\">下一页</a></div>\r\n");
      out.write("  </main>\r\n");
      out.write("</article>\r\n");
      out.write("<footer>\r\n");
      out.write("  <p>Design by <a href=\"#\" target=\"_blank\">陈C个人博客</a> <a href=\"/\">Copyright © 赣ICP备18013122号</a></p>\r\n");
      out.write("</footer>\r\n");
      out.write("<a href=\"#\" class=\"cd-top\">Top</a>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
