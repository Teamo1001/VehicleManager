/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-12-28 11:30:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head id=\"Head1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>管理系统</title>\n");
      out.write("<link href=\"css/default.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"js/themes/default/easyui.css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"js/themes/icon.css\" />\n");
      out.write("<script type=\"text/javascript\" src=\"js/utils/jquery-1.7.2.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/utils/jquery.easyui.1.2.6.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src='js/utils/index.js'></script>\n");
      out.write("<script type=\"text/javascript\" src='js/utils/utils.js'></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("$(function() {\n");
      out.write("\tvar messageType =\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.type}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\";\n");
      out.write("\tif(messageType!=null&&messageType==\"超级管理员\"&&messageType!=\"\"||messageType==\"管理员\"){\n");
      out.write("\t\t$.get(\"/approvalListWhereNo.action\",function(data){\n");
      out.write("\t\t    $.messager.show({\n");
      out.write("\t\t\t\ttitle : \"待审核消息提醒\",\n");
      out.write("\t\t\t\tmsg : \"亲爱的");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.type}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("，您有\"+data+\"条待审核信息，请您及时审核！！！\",\n");
      out.write("\t\t\t\ttimeout : 5000\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("\tif(messageType!=null&&messageType==\"申请人\"&&messageType!=\"\"){\n");
      out.write("\t    $.messager.show({\n");
      out.write("\t\t\ttitle : \"消息查收\",\n");
      out.write("\t\t\tmsg : \"亲爱的");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.type}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("，您有新的信息，请您及时查收！！！\",\n");
      out.write("\t\t\ttimeout : 5000\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("})\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body class=\"easyui-layout\" style=\"overflow-y: hidden\" fit=\"true\" scroll=\"no\">\n");
      out.write("\t<noscript>\n");
      out.write("\t\t<div style=\"position: absolute; z-index: 100000; height: 2046px; top: 0px; left: 0px; width: 100%; background: white; text-align: center;\">\n");
      out.write("\t\t\t<img src=\"images/noscript.gif\" alt='抱歉，请开启脚本支持！' />\n");
      out.write("\t\t</div>\n");
      out.write("\t</noscript>\n");
      out.write("\n");
      out.write("\t<div region=\"north\" split=\"false\" border=\"false\" style=\"overflow: hidden; height: 30px; background: url(images/layout-browser-hd-bg.gif) #7f99be repeat-x center 50%; line-height: 20px; color: #fff; font-family: Verdana, 微软雅黑, 黑体\">\n");
      out.write("\t\t<!-- \t\t<div data-options=\"iconCls:'icon-help'\" onclick=\"showAbout()\">关于</div> -->\n");
      out.write("\t\t<span style=\"float: right; padding-right: 20px;\" class=\"head\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.type}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a href=\"#\" id=\"editpass\">修改密码</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/userlogout.action\" id=\"loginOut\">安全退出</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a href=\"#\" onclick=\"showAbout()\">联系我们</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t</span> <span style=\"padding-left: 10px; font-size: 16px;\"> <img src=\"images/blocks.gif\" width=\"20\" height=\"20\" align=\"absmiddle\" /> 车辆管理系统\n");
      out.write("\t\t</span>\n");
      out.write("\t</div>\n");
      out.write("\t<div region=\"south\" split=\"false\" style=\"height: 30px; background: #D2E0F2;\">\n");
      out.write("\t\t<div class=\"footer\">车辆管理系统 V1.0</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div region=\"west\" split=\"true\" title=\"导航菜单\" style=\"width: 180px;\" id=\"west\">\n");
      out.write("\t\t<div id=\"nav\">\n");
      out.write("\t\t\t<!--导航内容 -->\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"mainPanle\" region=\"center\" style=\"background: #eee; overflow-y: hidden\">\n");
      out.write("\t\t<div id=\"tabs\" class=\"easyui-tabs\" fit=\"true\" border=\"false\">\n");
      out.write("\t\t\t<div title=\"欢迎使用\" style=\"padding: 20px; overflow: hidden; color: red;\">\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<img src=\"images/welcome.png\" style=\"height: 100%; width: 100%\"></img>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!--修改密码窗口-->\n");
      out.write("\t<div id=\"w\" class=\"easyui-window\" title=\"修改密码\" collapsible=\"false\" minimizable=\"false\" maximizable=\"false\" icon=\"icon-save\" style=\"width: 300px; height: 150px; padding: 5px; background: #fafafa;\">\n");
      out.write("\t\t<div class=\"easyui-layout\" fit=\"true\">\n");
      out.write("\t\t\t<div region=\"center\" border=\"false\" style=\"padding: 10px; background: #fff; border: 1px solid #ccc;\">\n");
      out.write("\t\t\t\t<table cellpadding=3>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<td>新密码：</td>\n");
      out.write("\t\t\t\t\t\t<td><input id=\"txtNewPass\" type=\"password\" class=\"txt01\" /></td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<td>确认密码：</td>\n");
      out.write("\t\t\t\t\t\t<td><input id=\"txtRePass\" type=\"password\" class=\"txt01\" /></td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t</table>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div region=\"south\" border=\"false\" style=\"text-align: right; height: 30px; line-height: 30px;\">\n");
      out.write("\t\t\t\t<a id=\"btnEp\" class=\"easyui-linkbutton\" icon=\"icon-ok\" href=\"javascript:void(0)\"> 确定</a> <a id=\"btnCancel\" class=\"easyui-linkbutton\" icon=\"icon-cancel\" href=\"javascript:void(0)\">取消</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div id=\"mm\" class=\"easyui-menu\" style=\"width: 150px;\">\n");
      out.write("\t\t<div id=\"tabupdate\">刷新</div>\n");
      out.write("\t\t<div class=\"menu-sep\"></div>\n");
      out.write("\t\t<div id=\"close\">关闭</div>\n");
      out.write("\t\t<div id=\"closeall\">全部关闭</div>\n");
      out.write("\t\t<div id=\"closeother\">除此之外全部关闭</div>\n");
      out.write("\t\t<div class=\"menu-sep\"></div>\n");
      out.write("\t\t<div id=\"closeright\">当前页右侧全部关闭</div>\n");
      out.write("\t\t<div id=\"closeleft\">当前页左侧全部关闭</div>\n");
      out.write("\t\t<div class=\"menu-sep\"></div>\n");
      out.write("\t\t<div id=\"exit\">退出</div>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("\n");
      out.write("</html>");
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