<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
<body>

	<h1><a>	 		</a></h1>
	<h1 align="center"><a>Cities</a></h1>


<c:forEach items="${cities}" var="city">
            <tr>      
                <td>${city.get(i)}</td>

            </tr>
</c:forEach>	

</body>

</html>