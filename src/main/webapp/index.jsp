<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SSM 框架整合</title>
</head>
<body>
<c:forEach items="${speaker.list }" var="speaker">
    <tr>  <td><input type="checkbox" name="bookname"></td>
        <td>${speaker.id}</td>
        <td>${speaker.speaker_name}</td>
        <td>${speaker.speaker_job}</td>
        <td style="overflow:hidden;white-space:nowrap;text-overflow:ellipsis;">${speaker.speaker_desc}</td>
            <%-- <td>${course.subject_id}</td> --%>
        <td> <a type="button"  href="${path}/getSpeaker.do?id=${speaker.id}" class="btn btn-info btn-sm">
            <span class="" aria-hidden="true"></span>
            编辑</a></td>
        <td>

            <a type="button"  href="${path}/delSpeaker.do?id=${speaker.id}" class="btn btn-danger btn-sm">
                <span class="" aria-hidden="true" ></span>
                删除</a>
        </td>
    </tr>
</c:forEach>
</body>
</html>


