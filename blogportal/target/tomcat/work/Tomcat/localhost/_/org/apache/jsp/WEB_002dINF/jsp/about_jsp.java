/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-03-26 08:49:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>首页_陈C个人博客 - 一个站在java后端开发之路的技术员个人博客网站</title>\r\n");
      out.write("    <meta name=\"keywords\" content=\"个人博客,陈C个人博客,个人博客模板,陈C\" />\r\n");
      out.write("    <meta name=\"description\" content=\"陈C个人博客，是一个站在java后端开发之路的萌新程序员个人网站。\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link href=\"css/base.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/index.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/m.css\" rel=\"stylesheet\">\r\n");
      out.write("    <script src=\"js/jquery.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/hc-sticky.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/comm.js\"></script>\r\n");
      out.write("    <!--[if lt IE 9]-->\r\n");
      out.write("    <script src=\"js/modernizr.js\"></script>\r\n");
      out.write("    <!--[endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<header class=\"header-navigation\" id=\"header\">\r\n");
      out.write("    <nav><div class=\"logo\"><a href=\"/\">陈C个人博客</a></div>\r\n");
      out.write("        <h2 id=\"mnavh\"><span class=\"navicon\"></span></h2>\r\n");
      out.write("        <ul id=\"starlist\">\r\n");
      out.write("            <li><a href=\"index.html\">网站首页</a></li>\r\n");
      out.write("            <li><a href=\"share.html\">我的相册</a></li>\r\n");
      out.write("            <li><a href=\"list.html\">我的日记</a></li>\r\n");
      out.write("            <li><a href=\"about.html\">关于我</a></li>\r\n");
      out.write("            <li><a href=\"gbook.html\">留言</a></li>\r\n");
      out.write("            <li><a href=\"info.html\">内容页</a></li>\r\n");
      out.write("            <li><a href=\"infopic.html\">内容页</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </nav>\r\n");
      out.write("</header>\r\n");
      out.write("<article>\r\n");
      out.write("    <aside class=\"l_box\">\r\n");
      out.write("        <div class=\"about_me\">\r\n");
      out.write("            <h2>关于我</h2>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <i><img src=\"images/4.jpg\"></i>\r\n");
      out.write("                <p><b>陈C</b>\r\n");
      out.write("                    ，一个90后萌新站长！17年入坑。一直潜心研究java后端技术，一边学习一边积累经验，分享一些个人学习心得。</p>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"wdxc\">\r\n");
      out.write("            <h2>我的相册</h2>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><a href=\"/\"><img src=\"images/1.jpg\"></a></li>\r\n");
      out.write("                <li><a href=\"/\"><img src=\"images/2.jpg\"></a></li>\r\n");
      out.write("                <li><a href=\"/\"><img src=\"images/4.jpg\"></a></li>\r\n");
      out.write("                <li><a href=\"/\"><img src=\"images/1.jpg\"></a></li>\r\n");
      out.write("                <li><a href=\"/\"><img src=\"images/2.jpg\"></a></li>\r\n");
      out.write("                <li><a href=\"/\"><img src=\"images/4.jpg\"></a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"search\">\r\n");
      out.write("            <form action=\"/e/search/index.php\" method=\"post\" name=\"searchform\" id=\"searchform\">\r\n");
      out.write("                <input name=\"keyboard\" id=\"keyboard\" class=\"input_text\" value=\"请输入关键字词\" style=\"color: rgb(153, 153, 153);\" onfocus=\"if(value=='请输入关键字词'){this.style.color='#000';value=''}\" onblur=\"if(value==''){this.style.color='#999';value='请输入关键字词'}\" type=\"text\">\r\n");
      out.write("                <input name=\"show\" value=\"title\" type=\"hidden\">\r\n");
      out.write("                <input name=\"tempid\" value=\"1\" type=\"hidden\">\r\n");
      out.write("                <input name=\"tbname\" value=\"news\" type=\"hidden\">\r\n");
      out.write("                <input name=\"Submit\" class=\"input_submit\" value=\"搜索\" type=\"submit\">\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"fenlei\">\r\n");
      out.write("            <h2>文章分类</h2>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><a href=\"/\">学无止境（33）</a></li>\r\n");
      out.write("                <li><a href=\"/\">日记（19）</a></li>\r\n");
      out.write("                <li><a href=\"/\">慢生活（520）</a></li>\r\n");
      out.write("                <li><a href=\"/\">美文欣赏（40）</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"guanzhu\">\r\n");
      out.write("            <h2>关注我 么么哒</h2>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <img src=\"images/wx.jpg\">\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </aside>\r\n");
      out.write("    <main class=\"r_box\">\r\n");
      out.write("        <div class=\"about\">\r\n");
      out.write("            <p>陈C，一个90后萌新站长！17年入行。一直潜心研究java后端技术，一边学习一边积累经验。<br />\r\n");
      out.write("                <br />\r\n");
      out.write("                我目前还在学习阶段，所以不存在所谓的成熟且稳定的开发团队，到目前为止只是跟着教程从零开发过一个电商网站，\r\n");
      out.write("                但是我并不满足于此，教程终究只是一个思想及经验，不自己动手消化是没用的，为了让自己得到更多锻炼，我还是决定自己实现一个网站，思来想去，什么网站好呢?于是我选择了个人博客项目。\r\n");
      out.write("                <br />\r\n");
      out.write("                <br />\r\n");
      out.write("                为什么我选择博客，个人认为有以下好处，在博客的开发过程会涉及很多实用的系统，比如博客cms系统，\r\n");
      out.write("                评论系统，用户管理系统，如果我能开发出这些系统的主要逻辑，那相信这些将会成为将来开发道路上宝贵的经验。<br />\r\n");
      out.write("                <br />\r\n");
      out.write("                最后，虽然我目前在博客园上分享技术心得，但是我始终希望能有自己的博客站点来陪伴我成长。\r\n");
      out.write("\r\n");
      out.write("                <br>\r\n");
      out.write("                <img src=\"images/4.jpg\">\r\n");
      out.write("                <br />\r\n");
      out.write("\r\n");
      out.write("                我的个人微信号 Chen1029693356</p>\r\n");
      out.write("            <br />\r\n");
      out.write("            <h2>About my blog</h2>\r\n");
      out.write("            &nbsp;\r\n");
      out.write("            <p>域 名：www.chencblog.xyz</p>\r\n");
      out.write("            <br />\r\n");
      out.write("            <p>服务器：腾讯云学生服务器</p>\r\n");
      out.write("            <br />\r\n");
      out.write("            <p>备案号：Copyright © 赣ICP备18013122号</p>\r\n");
      out.write("            <br />\r\n");
      out.write("            <p>程 序：前台修改自杨青前辈的模板，服务端程序为本人设计</p>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </main>\r\n");
      out.write("</article>\r\n");
      out.write("<footer>\r\n");
      out.write("    <p>Design by <a href=\"#\" target=\"_blank\">陈C个人博客</a> <a href=\"/\">Copyright © 赣ICP备18013122号</a></p>\r\n");
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
