<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<div th:if="${#httpServletRequest.remoteUser !=null}">
    <p th:text="${#httpServletRequest.remoteUser}">
        sample_user
    </p>
</div>


<form th:th:action="@{/logout}" method="post">
    <input type="submit" value="Log out" />
</form>
