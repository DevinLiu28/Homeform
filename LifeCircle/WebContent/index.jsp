<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>
	<%
			int x=1;
			out.println("JSP就是可以写JAVA代码的HTML啊！"+x);
			out.println("<br /><%@ 这个东西叫JSP的指令，一般处于JSP文件的顶端%@> ");
	%>
	
	<!-- jsp的小脚本 -->
	<%
		int num1=1;
		int num2=2;
		int num3=num1+num2;
		
	%>
	<!--这个叫JSP的表达式  -->
	<%=num3 %>
	<!--这个叫JSP的声明  -->
	<%!
		public String show(String str){
			return str;
	}
	%>
	
	<%=
		show("生活不止眼前的苟且！")
	%>
	<h1>还有诗和JSP</h1>
	</h1>
	<h1>黄景星讲的：开心就好，结果不重要了
	
	</h1>
</body>
</html>