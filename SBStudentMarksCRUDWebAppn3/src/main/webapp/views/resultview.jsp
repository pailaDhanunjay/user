<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<h1>Product Details</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr>
    <th>SID</th>
    <th>FullName</th>
    <th>Sub1</th>
    <th>Sub2</th>
     <th>Sub3</th>
      <th>Total</th>
      <th>Percentage</th>
        <th>Grade</th>
      <th>Delete</th>
      <th>Update</th>
    </tr>
   <c:forEach var="mark" items="${marks}">   
   <tr>  
   <td>${mark.sid}</td>  
   <td>${mark.fullname}</td> 
   <td>${mark.sub1}</td>   
   <td>${mark.sub2}</td>  
   <td>${mark.sub3}</td> 
   <td>${mark.total}</td>  
   <td>${mark.percentage}</td> 
   <td>${mark.grade}</td>     
   <td><a href="/delete/${mark.sid}">Delete</a></td>
   <td><a href="/update/${mark.sid}">Update</a></td>
    </tr>  
   </c:forEach>  
   </table>  
   <a href="/">Add New Student</a><p></p>
   </body>