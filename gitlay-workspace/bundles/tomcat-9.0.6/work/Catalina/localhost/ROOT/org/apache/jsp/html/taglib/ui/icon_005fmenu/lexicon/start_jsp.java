/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.6
 * Generated at: 2019-09-25 07:30:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.html.taglib.ui.icon_005fmenu.lexicon;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.taglib.aui.AUIUtil;
import java.util.Map;

public final class start_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/tld/c.tld", Long.valueOf(1527272938000L));
    _jspx_dependants.put("/WEB-INF/tld/liferay-aui.tld", Long.valueOf(1527276538000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.liferay.taglib.aui.AUIUtil");
    _jspx_imports_classes.add("java.util.Map");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.Validator");
    _jspx_imports_classes.add("com.liferay.portal.kernel.util.GetterUtil");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005faui_005ficon_0026_005fmarkupView_005fimage_005fcssClass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005faui_005ficon_0026_005fmarkupView_005fimage_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005faui_005fscript_0026_005fuse_005fposition;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005faui_005ficon_0026_005fmarkupView_005fimage_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005faui_005ficon_0026_005fmarkupView_005fimage_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005faui_005fscript_0026_005fuse_005fposition = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005faui_005ficon_0026_005fmarkupView_005fimage_005fcssClass_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005faui_005ficon_0026_005fmarkupView_005fimage_005fnobody.release();
    _005fjspx_005ftagPool_005faui_005fscript_0026_005fuse_005fposition.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

String cssClass = GetterUtil.getString((String)request.getAttribute("liferay-ui:icon-menu:cssClass"));
Map<String, Object> data = (Map<String, Object>)request.getAttribute("liferay-ui:icon-menu:data");
String direction = (String)request.getAttribute("liferay-ui:icon-menu:direction");
String icon = GetterUtil.getString((String)request.getAttribute("liferay-ui:icon-menu:icon"));
String id = GetterUtil.getString((String)request.getAttribute("liferay-ui:icon-menu:id"));
String message = (String)request.getAttribute("liferay-ui:icon-menu:message");
boolean scroll = GetterUtil.getBoolean(request.getAttribute("liferay-ui:icon-menu:scroll"));
String triggerCssClass = GetterUtil.getString((String)request.getAttribute("liferay-ui:icon-menu:triggerCssClass"));
String triggerLabel = GetterUtil.getString((String)request.getAttribute("liferay-ui:icon-menu:triggerLabel"));
String triggerType = GetterUtil.getString(request.getAttribute("liferay-ui:icon-menu:triggerType"));

if (Validator.isNull(icon)) {
	icon = "ellipsis-v";
}

      out.write("\n");
      out.write("\n");
      out.write("<div class=\"dropdown lfr-icon-menu ");
      out.print( cssClass );
      out.write('"');
      out.write(' ');
      out.print( AUIUtil.buildData(data) );
      out.write('>');
      out.write('\n');
      out.write('	');
      out.write('\n');
      out.write('	');
      out.write('	');
if (
 triggerType.equals("button") ) {
      out.write("\n");
      out.write("\t\t\t<button aria-expanded=\"false\" aria-haspopup=\"true\" class=\"btn btn-monospaced btn-secondary dropdown-toggle ");
      out.print( triggerCssClass );
      out.write("\" id=\"");
      out.print( id );
      out.write("\" title=\"");
      out.print( message );
      out.write("\" type=\"button\">\n");
      out.write("\t\t\t\t");
      //  aui:icon
      com.liferay.taglib.aui.IconTag _jspx_th_aui_005ficon_005f0 = (com.liferay.taglib.aui.IconTag) _005fjspx_005ftagPool_005faui_005ficon_0026_005fmarkupView_005fimage_005fcssClass_005fnobody.get(com.liferay.taglib.aui.IconTag.class);
      boolean _jspx_th_aui_005ficon_005f0_reused = false;
      try {
        _jspx_th_aui_005ficon_005f0.setPageContext(_jspx_page_context);
        _jspx_th_aui_005ficon_005f0.setParent(null);
        // /html/taglib/ui/icon_menu/lexicon/start.jsp(50,4) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_aui_005ficon_005f0.setCssClass("inline-item");
        // /html/taglib/ui/icon_menu/lexicon/start.jsp(50,4) name = image type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_aui_005ficon_005f0.setImage( icon );
        // /html/taglib/ui/icon_menu/lexicon/start.jsp(50,4) name = markupView type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_aui_005ficon_005f0.setMarkupView("lexicon");
        int _jspx_eval_aui_005ficon_005f0 = _jspx_th_aui_005ficon_005f0.doStartTag();
        if (_jspx_th_aui_005ficon_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005faui_005ficon_0026_005fmarkupView_005fimage_005fcssClass_005fnobody.reuse(_jspx_th_aui_005ficon_005f0);
        _jspx_th_aui_005ficon_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_aui_005ficon_005f0, _jsp_getInstanceManager(), _jspx_th_aui_005ficon_005f0_reused);
      }
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t");
if (
 Validator.isNotNull(triggerLabel) ) {
      out.write("\n");
      out.write("\t\t\t\t\t<span class=\"btn-section\">");
      out.print( triggerLabel );
      out.write("</span>\n");
      out.write("\t\t\t\t");
}
      out.write("\n");
      out.write("\t\t\t</button>\n");
      out.write("\t\t");
      out.write('\n');
      out.write('	');
      out.write('	');
}
else {
      out.write("\n");
      out.write("\t\t\t<a class=\"direction-");
      out.print( direction );
      out.write(" dropdown-toggle icon-monospaced ");
      out.print( triggerCssClass );
      out.write("\" href=\"javascript:;\" id=\"");
      out.print( id );
      out.write("\" title=\"");
      out.print( message );
      out.write("\">\n");
      out.write("\t\t\t\t");
      //  aui:icon
      com.liferay.taglib.aui.IconTag _jspx_th_aui_005ficon_005f1 = (com.liferay.taglib.aui.IconTag) _005fjspx_005ftagPool_005faui_005ficon_0026_005fmarkupView_005fimage_005fnobody.get(com.liferay.taglib.aui.IconTag.class);
      boolean _jspx_th_aui_005ficon_005f1_reused = false;
      try {
        _jspx_th_aui_005ficon_005f1.setPageContext(_jspx_page_context);
        _jspx_th_aui_005ficon_005f1.setParent(null);
        // /html/taglib/ui/icon_menu/lexicon/start.jsp(59,4) name = image type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_aui_005ficon_005f1.setImage( icon );
        // /html/taglib/ui/icon_menu/lexicon/start.jsp(59,4) name = markupView type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_aui_005ficon_005f1.setMarkupView("lexicon");
        int _jspx_eval_aui_005ficon_005f1 = _jspx_th_aui_005ficon_005f1.doStartTag();
        if (_jspx_th_aui_005ficon_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005faui_005ficon_0026_005fmarkupView_005fimage_005fnobody.reuse(_jspx_th_aui_005ficon_005f1);
        _jspx_th_aui_005ficon_005f1_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_aui_005ficon_005f1, _jsp_getInstanceManager(), _jspx_th_aui_005ficon_005f1_reused);
      }
      out.write("\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t");
      out.write('\n');
      out.write('	');
}
      out.write('\n');
      out.write('\n');
      out.write('	');
      //  aui:script
      com.liferay.taglib.aui.ScriptTag _jspx_th_aui_005fscript_005f0 = (com.liferay.taglib.aui.ScriptTag) _005fjspx_005ftagPool_005faui_005fscript_0026_005fuse_005fposition.get(com.liferay.taglib.aui.ScriptTag.class);
      boolean _jspx_th_aui_005fscript_005f0_reused = false;
      try {
        _jspx_th_aui_005fscript_005f0.setPageContext(_jspx_page_context);
        _jspx_th_aui_005fscript_005f0.setParent(null);
        // /html/taglib/ui/icon_menu/lexicon/start.jsp(64,1) name = position type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_aui_005fscript_005f0.setPosition("inline");
        // /html/taglib/ui/icon_menu/lexicon/start.jsp(64,1) name = use type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_aui_005fscript_005f0.setUse("liferay-menu");
        int _jspx_eval_aui_005fscript_005f0 = _jspx_th_aui_005fscript_005f0.doStartTag();
        if (_jspx_eval_aui_005fscript_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          if (_jspx_eval_aui_005fscript_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_aui_005fscript_005f0);
          }
          do {
            out.write("\n");
            out.write("\t\tLiferay.Menu.register('");
            out.print( id );
            out.write("');\n");
            out.write("\t");
            int evalDoAfterBody = _jspx_th_aui_005fscript_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
          if (_jspx_eval_aui_005fscript_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            out = _jspx_page_context.popBody();
          }
        }
        if (_jspx_th_aui_005fscript_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005faui_005fscript_0026_005fuse_005fposition.reuse(_jspx_th_aui_005fscript_005f0);
        _jspx_th_aui_005fscript_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_aui_005fscript_005f0, _jsp_getInstanceManager(), _jspx_th_aui_005fscript_005f0_reused);
      }
      out.write('\n');
      out.write('\n');
      out.write('	');
      out.write('\n');
      out.write('	');
      out.write('	');
if (
 scroll ) {
      out.write("\n");
      out.write("\t\t\t<div class=\"dropdown-menu dropdown-menu-");
      out.print( direction );
      out.write("\">\n");
      out.write("\t\t\t\t<ul class=\"inline-scroller\">\n");
      out.write("\t\t");
      out.write('\n');
      out.write('	');
      out.write('	');
}
else {
      out.write("\n");
      out.write("\t\t\t<ul class=\"dropdown-menu dropdown-menu-");
      out.print( direction );
      out.write("\">\n");
      out.write("\t\t");
      out.write('\n');
      out.write('	');
}
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
