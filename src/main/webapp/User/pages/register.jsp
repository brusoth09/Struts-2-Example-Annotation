<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>

</head>
<body>
<h1>Struts 2 Hello World Example</h1>
<s:form action="Welcome">
    <s:textfield name="username" label="Username"/>
    <s:password name="password1" label="Password"/>
    <s:password name="password2" label="Retype Password"/>
    <s:submit />
</s:form>
</body>
</html>