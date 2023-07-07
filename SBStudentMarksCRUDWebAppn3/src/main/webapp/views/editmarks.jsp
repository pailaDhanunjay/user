<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<body bgcolor="olive">
<h1>Edit Product Details</h1>
<form:form method="POST" action="/update">
    <table>
        <tr>
            <td>Customer ID:</td>
            <td><form:hidden path="sid"/></td>
        </tr>
        <tr>
            <td>First Name:</td>
            <td><form:input path="firstName"/></td>
        </tr>
        <tr>
            <td>Last Name:</td>
            <td><form:input path="lastName"/></td>
        </tr>
        <tr>
            <td>Subject1:</td>
            <td><form:input path="sub1"/></td>
        </tr>
        <tr>
            <td>Subject2:</td>
            <td><form:input path="sub2"/></td>
        </tr>
        <tr>
            <td>Subject3:</td>
            <td><form:input path="sub3"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="GetResult"></td>
        </tr>
    </table>
</form:form>
<a href="/views">GetResult</a><p></p>
<a href="/">Add New Student</a><p></p>
</body>