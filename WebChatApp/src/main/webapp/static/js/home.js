//home.jsp専用のjsオブジェクト
var home = new Object();
//Global変数
var stompClient = null;
/***
 * 初期表示処理
 * */
home.init = function(){
	home.disconnect();
}

home.setConnected = function(connected) {
    document.getElementById('connect').disabled = connected;
    document.getElementById('disconnect').disabled = !connected;
    document.getElementById('conversationDiv').style.visibility = connected ? 'visible' : 'hidden';
    document.getElementById('response').innerHTML = '';
}
 
home.connect = function() {
    var socket = new SockJS('/WebChatApp/chat');
    stompClient = Stomp.over(socket);  
    stompClient.connect({}, function(frame) {
        home.setConnected(true);
        console.log('Connected: ' + frame);
        stompClient.subscribe('/topic/messages', function(messageOutput) {
            home.showMessageOutput(JSON.parse(messageOutput.body));
        });
    });
}
 
home.disconnect=function() {
    if(stompClient != null) {
        stompClient.disconnect();
    }
    home.setConnected(false);
    console.log("Disconnected");
}
 
home.sendMessage = function() {
    var from = document.getElementById('from').value;
    var text = document.getElementById('text').value;
    stompClient.send("/app/chat", {}, JSON.stringify({'from':from, 'text':text}));
}
 
home.showMessageOutput=function(messageOutput) {
    var response = document.getElementById('response');
    var p = document.createElement('p');
    p.style.wordWrap = 'break-word';
    p.appendChild(document.createTextNode(messageOutput.from + ": " + messageOutput.text + " (" + messageOutput.time + ")"));
    response.appendChild(p);
}