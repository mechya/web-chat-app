<%@page import="org.springframework.validation.BindingResultUtils"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page session="false"%>
<html>
<head>
<script src="<c:url value="/resources/js/sockjs.js" />"></script>
<script src="<c:url value="/resources/js/stomp.js" />"></script>
<script src="<c:url value="/resources/js/home.js" />"></script>

<title>Home</title>
</head>
    <body onload="home.init();">
        <div>
            <div>
                <input type="text" id="from" placeholder="Choose a nickname"/>
            </div>
            <br />
            <div>
                <button id="connect" onclick="home.connect();return false;">Connect</button>
                <button id="disconnect" disabled="disabled" onclick="home.disconnect();return false;">
                    Disconnect
                </button>
            </div>
            <br />
            <div id="conversationDiv">
                <input type="text" id="text" placeholder="Write a message..."/>
                <button id="sendMessage" onclick="home.sendMessage();return false;">Send</button>
                <p id="response"></p>
            </div>
        </div>
 
    </body>
</html>