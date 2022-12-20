<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<head>
    <meta charset="UTF-8">
    <title>JQuery_Ajax_연습</title>
    
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

    <style type="text/css">
        div.question-box {
            margin: 10px 0 20px 0;
        }

        table {
            border: 1px solid;
            border-collapse: collapse;
        }

        td,
        th {
            padding: 10px;
            border: 1px solid;
        }
    </style>
    
   
    
     <script>
        function q1() {
            $.ajax({
                type: "GET",
                url: "http://spartacodingclub.shop/sparta_api/seoulbike",
                data: {},
                success: function(response){
                    $("#names-q1").empty()
                    let bike_list = response["getStationList"]["row"]
                    for (let i = 0; i < bike_list.length; i++){
                        let name_stat = bike_list[i]["stationName"]
                        let rack_cnt = bike_list[i]["rackTotCnt"]
                        let park_bike = bike_list[i]["parkingBikeTotCnt"]
                        
                       
                      
                        $("#names-q1").append("<tr>")
                        $("#names-q1").append("<td>" + name_stat + "</td>")
                        $("#names-q1").append("<td>" + rack_cnt + "</td>")
                         $("#names-q1").append("<td>" + park_bike + "</td>")
                        $("#names-q1").append("</tr>")
                       
                    }
                }
            })
        }
    </script>

</head>

<body>
    <h1>이전에 다룬 jQuery와 Ajax를 활용해보자</h1>

    <hr />

    <div class="question-box">
        <h2>서울시 따릉이 OpenAPI 사용하기</h2>
        <p>모든 위치의 따릉이 현황을 보여주세요</p>
        <p>업데이트 버튼을 누를 때마다 지웠다 새로 씌여져야 합니다.</p>
        <button onclick="q1()">업데이트</button>
        <table>
            <thead>
                <tr>
                    <td>거치대 위치</td>
                    <td>거치대 수</td>
                    <td>현재 거치된 따릉이 수</td>
                </tr>
            </thead>
            <tbody id="names-q1">
            <!-- 
                <tr>
                    <td>102. 망원역 1번출구 앞</td>
                    <td>22</td>
                    <td>0</td>
                </tr>
                <tr>
                    <td>103. 망원역 2번출구 앞</td>
                    <td>16</td>
                    <td>0</td>
                </tr>
                <tr>
                    <td>104. 합정역 1번출구 앞</td>
                    <td>16</td>
                    <td>0</td>
                </tr>
                 -->
            </tbody>
        </table>
    </div>
</body>