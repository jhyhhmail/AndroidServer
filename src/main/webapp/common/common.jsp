<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<script>

function getContextPath() {
    return "${pageContext.request.contextPath}";
} 


</script> 
<script src="<c:url value="/resources/js/core/jquery.min.js" />"></script>
