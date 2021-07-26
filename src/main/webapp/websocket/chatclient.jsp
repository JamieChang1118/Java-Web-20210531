<%-- 
    Document   : chatclient
    Created on : 2021/7/26, 下午 07:21:14
    Author     : boddy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Chat Client</title>
        <link rel="stylesheet" href="https://unpkg.com/purecss@2.0.6/build/pure-min.css">
        <script>
            // char server 路徑
            var chaturl = 'ws://localhost:8080/JavaWeb20210531/websocket/chat';
            // 建立 websocket 物件
            var ws = null;
            
            function onOpen(){  
                ws = new WebSocket(chaturl);    // 發送連線
                ws.onopen = function(evt){      // Server 回應
                    console.log('server onopen:' + evt.data);
                    result.insertAdjacentHTML("beforeend" , '連到 server <br>');
                };
                
                ws.onmessage = function(evt){     
                    console.log('server onmessage:' + evt.data);
                    result.insertAdjacentHTML("beforeend" , evt.data + '<br>');
                };
                
                ws.onclose = function(evt){      
                    console.log('server onclose:' + evt);
                    result.insertAdjacentHTML("beforeend" , '關閉連線 <br>');
                    ws = null;
                };
            }
            
            function send(){
                ws.send(message.value);
            }
            
            function onClose(){
                if(ws != null){
                    ws.close();
                } else {
                    alert('請先按下 Open 鍵')
                }
            }
        </script>
    </head>
    <body style="padding: 20px">
        <form class="pure-form">
            <fieldset>
                <legend>Chat Client</legend>
                <input type="text" id="message" placeholder="請輸入字串" />

                <button type="button" onclick="onOpen()" class="pure-button pure-button-primary">Open</button>
                <button type="button" onclick="send()" class="pure-button pure-button-primary">Send</button>
                <button type="button" onclick="onClose()" class="pure-button pure-button-primary">Close</button>

            </fieldset>
        </form>
        <div id="result"></div>
    </body>
</html>
