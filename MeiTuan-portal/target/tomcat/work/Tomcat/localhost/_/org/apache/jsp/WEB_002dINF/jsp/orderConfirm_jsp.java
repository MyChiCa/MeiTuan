/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-07-07 11:55:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.MeiTuan.portal.pojo.OrderExtend;
import java.util.List;

public final class orderConfirm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <title>确认订单 | 美团</title>\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-3.3.1.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/main.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/shopcart.css\">\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/sort.js\"></script>\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/holder.js\"></script>\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/sweetalert.min.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/sweetalert.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/order.css\">\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/order.js\"></script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("    \t$(document).ready(function(){\n");
      out.write("\n");
      out.write("    \t\t//关闭修改\n");
      out.write("    \t\t$(\"#back\").click(function(){\n");
      out.write("    \t\t\t$(\"#address_out\").hide();\n");
      out.write("    \t\t\t$(\"html,body\").css({\"overflow\":\"\"});\n");
      out.write("    \t\t});\n");
      out.write("    \t\t//显示地址\n");
      out.write("    \t\t$(\"#managerAddr\").on(\"click\",function(){\n");
      out.write("    \t\t$(\"#address_out\").show();\n");
      out.write("    \t\t\tvar h = $(window).height();\n");
      out.write("    \t\t\tvar w = $(window).width();\n");
      out.write("\t\t\t\t$(\"#address_out\").css({\n");
      out.write("\t\t\t\t\t\t\t\t\t   \"bakcgroundColor\":\"black\",\n");
      out.write("\t\t\t\t\t\t\t\t\t   \"width\":w,\n");
      out.write("\t\t\t\t\t\t\t\t\t   \"height\":h\n");
      out.write("\t\t\t\t\t\t\t\t\t   });\n");
      out.write("\t\t\t\t$(\"#address_in\").css({\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\"width\":\"500px\",\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\"margin\":\"200px auto\"\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\t//去掉滚动条\n");
      out.write("\t\t\t\t$(\"html,body\").css({\"overflow\":\"hidden\"})\n");
      out.write("\t\t\t\t$(\"#address_out\").show();\n");
      out.write("    \t\t});\n");
      out.write("    \t\t\n");
      out.write("    \t\t//修改地址\n");
      out.write("\t\t\t$(\"#confirm_modify\").click(function(){\n");
      out.write("\t\t\tvar $addr = $(\"#addr\").val();\n");
      out.write("\t\t\t\t$.ajax({\n");
      out.write("\t\t\t\t\turl:\"http://localhost:8082/user/address\",\n");
      out.write("\t\t\t\t\ttype:\"post\",\n");
      out.write("\t\t\t\t\tdata:{\"addr\":$addr},\n");
      out.write("\t\t\t\t\tsuccess:function(data){\n");
      out.write("\t\t\t\t\t\t$(\"#managerAddr\").prev().text(data.address);\n");
      out.write("\t\t\t\t\t\t$(\"#address_out\").hide();\n");
      out.write("\t\t\t\t\t\t$(\"html,body\").css({\"overflow\":\"\"});\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\terror:function(){\n");
      out.write("\t\t\t\t\t\talert(\"fail\");\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t//取消订单\n");
      out.write("\t\t\t$(\"#cancel-orders\").click(function(){\n");
      out.write("\t\t\t\twindow.location.href=\"http://localhost:8082/restaurant/restaurantPage\";\n");
      out.write("\t\t\t});\n");
      out.write(" \n");
      out.write("    \t});\n");
      out.write("    </script>\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("    \t#address_out{\n");
      out.write("\t\t\tdisplay:none;\n");
      out.write("    \t\tz-index:999;\n");
      out.write("    \t\tbackground-color:rgba(120,120,120,0.5);\n");
      out.write("    \t\tposition:absolute;\n");
      out.write("    \t}\n");
      out.write("    \t#address_in{\n");
      out.write("    \t\tbackground-color:rgb(255,255,255);\n");
      out.write("    \t\tpadding:10px 20px;\n");
      out.write("    \t\tborder:1px solid rgb(255,255,255);\n");
      out.write("    \t\tborder-radius:5px;\n");
      out.write("    \t}\n");
      out.write("    \t#address_in input{\n");
      out.write("    \t\theight:40px;\n");
      out.write("\t\t\twidth:380px;\n");
      out.write("    \t\toutline: none;\n");
      out.write("    \t\tborder:1px solid rgb(120,120,120);\n");
      out.write("    \t\tborder-radius:5px;\n");
      out.write("    \t\tpadding-left:10px;\n");
      out.write("    \t}\n");
      out.write("    \t#address_in input:hover{\n");
      out.write("    \t\tborder:1px solid rgb(30,144,255);\n");
      out.write("    \t\tbox-shadow: -0.5px -0.5px 0.5px;\n");
      out.write("    \t}\n");
      out.write("    \t#address_in label{\n");
      out.write("    \t\tcolor:rgb(0,0,0);\n");
      out.write("    \t}\n");
      out.write("    \t#address_in button{\n");
      out.write("    \t\toutline: none;\n");
      out.write("    \t\tbackground-color:rgb(30,144,255);\n");
      out.write("    \t\tcolor:rgb(255,255,255);\n");
      out.write("    \t\theight:40px;\n");
      out.write("    \t\tborder:1px solid rgb(30,144,255);\n");
      out.write("    \t\tborder-radius:5px;\n");
      out.write("    \t\tmargin-left:30px;\n");
      out.write("    \t\twidth:70px;\n");
      out.write("    \t}\n");
      out.write("    \t#address_in button:hover{\n");
      out.write("    \t\tbackground-color:rgb(10,120,255);\n");
      out.write("    \t}\n");
      out.write("\t\t#address_in div{\n");
      out.write("\t\t\twidth：100%;\n");
      out.write("\t\t\theight:40px;\n");
      out.write("\t\t\ttext-align: center;\n");
      out.write("\t\t\tmargin-top:15px;\n");
      out.write("\t\t\tvertical-align: middle;\n");
      out.write("\t\t}\n");
      out.write("\t\t#order_head{\n");
      out.write("\t\t\tdisplay:flex;\n");
      out.write("\t\t}\n");
      out.write("\t\t#order_head li:nth-child(2){\n");
      out.write("\t\t\tmargin-left:50px;\n");
      out.write("\t\t}\n");
      out.write("\t\t#order_head li:nth-child(3){\n");
      out.write("\t\t\tmargin-left:50px;\n");
      out.write("\t\t}\n");
      out.write("\t\t.product-name img{\n");
      out.write("\t\t\twidth:100px;\n");
      out.write("\t\t}\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div id=\"address_out\">\n");
      out.write("\t<div id=\"address_in\">\n");
      out.write("\t\t<label for=\"addr\"></label>收货地址：<input type=\"text\" name=\"addr\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginUser.address }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" id=\"addr\">\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<button id=\"back\">返回</button>\n");
      out.write("\t\t\t<button id=\"confirm_modify\">确认修改</button>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<div id=\"main\" class=\"container\">\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("</div>\n");
      out.write("<div class=\"shopping_cart\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-12\">\n");
      out.write("                <div class=\"account_heading account_heading_ah\">\n");
      out.write("                    <h1 class=\"header-border\">确认订单</h1>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/order/updateState\">\n");
      out.write("        <h4 class=\"header-border h4-mar\">确认收货地址：<span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ sessionScope.loginUser.address}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span><a href=\"javascript:void(0)\" class=\"pull-right manage-a\" id=\"managerAddr\">管理收货地址</a></h4>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <h4 class=\"header-border h4-mar-2\">确认收货信息</h4>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"all_wis_frm\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <div class=\"wishlist-content wishlist-content-2\">\n");
      out.write("\n");
      out.write("                        <div class=\"wishlist-table wishlist-table-2 table-responsive\">\n");
      out.write("                        \t<div>\n");
      out.write("                        \t\t<ul id=\"order_head\">\n");
      out.write("                        \t\t\t<li><span class=\"nobr\"> 店铺：<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/food/gulugulu\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rstrName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</a></span></li>\n");
      out.write("                        \t\t\t<li><span class=\"nobr\"> 订单号：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderHead.orderId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span></li>\n");
      out.write("                        \t\t\t");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        \t\t</ul>\n");
      out.write("                        \t</div>\n");
      out.write("                            <table id=\"cart-table\" style=\"text-align: center\">\n");
      out.write("                                <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th class=\"product-name product-name_2\" style=\"text-align: center\"><span\n");
      out.write("                                            class=\"nobr\">商品</span></th>\n");
      out.write("                                    <th class=\"product-stock-stauts\" style=\"text-align: center\"><span class=\"nobr\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t名称</span></th>\n");
      out.write("                                    <th class=\"product-stock-stauts\" style=\"text-align: center\"><span class=\"nobr\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t份数 </span></th>\n");
      out.write("                                    <th class=\"product-add-to-cart\" style=\"text-align: center\"><span class=\"nobr\">价格</span></th>\n");
      out.write("                                </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tbody>\n");
      out.write("                                ");
      out.write("\n");
      out.write("                                ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-5 col-xs-12 form-group form-group-lg\">\n");
      out.write("                                <label class=\"col-sm-2 control-label\" for=\"pay-select\">选择支付方式</label>\n");
      out.write("                                <div class=\"col-sm-10\">\n");
      out.write("                                    <select class=\"form-control\" id=\"pay-select\">\n");
      out.write("                                        <option value=\"1\">在线支付</option>\n");
      out.write("                                        <option value=\"0\">货到付款</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6 col-md-offset-1 col-xs-12\">\n");
      out.write("                                <div class=\"cart_totals\">\n");
      out.write("                                    <h2>总价</h2>\n");
      out.write("                                    <table class=\"shop_table shop_table_responsive\">\n");
      out.write("                                        <tbody>\n");
      out.write("                                        <tr class=\"cart-subtotal\">\n");
      out.write("                                            <th>总额</th>\n");
      out.write("                                            <td data-title=\"Subtotal\"><span\n");
      out.write("                                                    class=\"woocommerce-Price-amount amount\"><span\n");
      out.write("                                                    class=\"woocommerce-Price-currencySymbol\"\n");
      out.write("                                                    id=\"total-old\" style=\"color:red\">￥");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${totalMoney.money}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</span></td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr class=\"order-total\">\n");
      out.write("                                            <th>实付款（含配送费）</th>\n");
      out.write("                                            <td data-title=\"Total\"><strong> <span\n");
      out.write("                                                    class=\"woocommerce-Price-amount amount\"><span\n");
      out.write("                                                    class=\"woocommerce-Price-currencySymbol\"\n");
      out.write("                                                    id=\"total-new\" style=\"color:red\">￥");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${plustakeFare}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("                                            </strong></td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        </tbody>\n");
      out.write("                                    </table>\n");
      out.write("                                    <div class=\"wc-proceed-to-checkout\">\n");
      out.write("                                        <input type=\"submit\" value=\"结算\" class=\"button_act button_act-tc confirm-orders pull-right\">\n");
      out.write("                                        <input type=\"button\" value=\"取消订单\" class=\"button_act button_act-tc confirm-orders pull-right\" id=\"cancel-orders\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<div id=\"path\" hidden>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f0.setParent(null);
    int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
    if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t                        \t\t\t");
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        \t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /WEB-INF/jsp/orderConfirm.jsp(179,28) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ orderHead.orderState == 0}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("                        \t\t\t\n");
        out.write("\t\t                        \t\t\t<li><span class=\"nobr\"> 订单状态：未支付</span></li>\n");
        out.write("\t                        \t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/jsp/orderConfirm.jsp(199,32) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/orderConfirm.jsp(199,32) '${orderList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${orderList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/orderConfirm.jsp(199,32) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("foods");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <tr>\n");
          out.write(" \t\t\t\t\t\t\t\t\t\t<td class=\"product-name product-name_2\" style=\"text-align: center\">\n");
          out.write(" \t\t\t\t\t\t\t\t\t\t\t<img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${foods.foodImage}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">\n");
          out.write("                                        </td>\n");
          out.write("                                        <td class=\"product-name product-name_2\" style=\"text-align: center\">\n");
          out.write("                                        \t<a>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${foods.foodName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</a>\n");
          out.write("                                        </td>\n");
          out.write("                                        <td class=\"product-stock-status\" style=\"text-align: center\">\n");
          out.write("                                            <div class=\"latest_es_from_2\">\n");
          out.write("                                                <span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${foods.foodNum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</span>\n");
          out.write("                                            </div>\n");
          out.write("                                        </td>\n");
          out.write("                                        <td class=\"product-price\" style=\"text-align: center\">\n");
          out.write("                                        \t<span\n");
          out.write("                                                class=\"amount-list amount-list-2\">￥");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${foods.foodMoney}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\n");
          out.write("                                            </span>\n");
          out.write("                                        </td>\n");
          out.write("                                        ");
          out.write("\n");
          out.write("                                    </tr>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
