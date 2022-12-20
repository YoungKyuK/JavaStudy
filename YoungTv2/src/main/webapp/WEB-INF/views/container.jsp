<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.example.model1.CommentTO" %>
<%
    String seq = request.getParameter("seq");
	
	
	ArrayList<CommentTO> commentLists = (ArrayList)request.getAttribute("commentLists");
	System.out.println( commentLists );
	StringBuilder commentSb = new StringBuilder();
	for ( CommentTO cto : commentLists ){
		
			commentSb.append(" <div class='writer'>");
			commentSb.append( cto.getWriter() + "<input type='text' name='cwriter' maxlength='10' class='coment_input' />&nbsp;&nbsp;");
			commentSb.append(cto.getPassword()+ "<input type='password' name='cpassword' class='coment_input pR10' />&nbsp;&nbsp;");
			commentSb.append("<h3>댓글 23개</h3>");
			commentSb.append(" </div> <!-- writer-->");
			commentSb.append("<form>");
			commentSb.append("<textarea class='textarea' placeholder='댓글을 입력해주세요'></textarea>");
			commentSb.append("</form>");
			commentSb.append("<input class='comment keyup'type='submit' value='댓글등록'>");
			commentSb.append("<ul class='comments'>");
			commentSb.append("<li>"+ cto.getWriter() +"</li>");
			commentSb.append("<span>"+cto.getContent()+"</span>");
		
	}




%>

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
     <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no">
    <title>container</title>
    
  <link href="${pageContext.request.contextPath}/css/stylesheet.css" rel="stylesheet" type="text/css">
  <link href="${pageContext.request.contextPath}/css/sidebar.css" rel="stylesheet" type="text/css">
  <link href="${pageContext.request.contextPath}/css/container.css" rel="stylesheet" type="text/css">
<!-- <link rel="stylesheet" href="stylesheet.css">
<link rel="stylesheet" href="sidebar.css">
<link rel="stylesheet" href="container.css"> -->

<link href="http://hangeul.pstatic.net/hangeul_static/css/nanum-square.css" rel="stylesheet">
<script src="https://kit.fontawesome.com/c85ddc4e85.js" crossorigin="anonymous"></script>
<!-- 
<script src="main.js" defer></script>
<script src="comments.js"></script> -->
 
<script type="text/javascript" src="https://openapi.map.naver.com/openapi/v3/maps.js?ncpClientId=gcxmtcrq93"></script>
</head>
<body>
   <nav class="navbar">
        <div class="navbar_logo">
            <a href="" class="navbar_btn">
                <i class="fa-solid fa-bars"></i>
            </a>
                <a href="main">YoungKyu</a>
        </div>

        <div class="navbar_search">
            <input type="search" id="totalSearch" placeholder="검색어를 입력해주세요." maxlength  = "20">
            <button class="icon"><a href="#"><i class="fa fa-search"></i></a></button>
        </div>

        <div class="navbar_login">
            <a href="">로그인</a>

        </div>

   </nav>

   <section id="main">
    <div class="wrap">
       
        <div class="side_menu">
            <ul>
                <li><i class="fa-solid fa-house"></i>홈</li>
                <li class="starvideo" style="margin-left:0px;"><i class="fa-solid fa-star"></i>인기영상</li>
            </ul>

           <ul>
            <li> <i class="fa-solid fa-video"></i>영화</li>
            <li>한국영화</li>
            <li>해외영화</li>
            <li>[극장판]애니메이션</li>
           </ul>

           <ul>
            <li><i class="fa-solid fa-tv"></i>방송프로그램</li>
            <li>드라마</li>
            <li>예능프로그램</li>
            <li>다큐/시사</li>
            <li>해외드라마</li>
           </ul>

           <ul>
            <li><i class="fa-solid fa-ticket"></i>추억의 저장소</li>
            <li>추억의 드라마</li>
            <li>추억의 예능</li>
           </ul>

        </div> <!-- side_menu-->
   
        <div class="container">
          

            <iframe width="1250px" height="500px" src="https://www.youtube.com/embed/pSkKGLQ6Z7Q" 
            title="YouTube video player" frameborder="0" 
            allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" 
            allowfullscreen></iframe>

            <div class="borderline">
            <h3>금수저 10화</h3>
            <span class="font">조회수 100</span>
            <span class="register font">등록일 1일 전</span>
             </div><!--borderline-->

             <div class="borderline">
                <h3>줄거리</h3>
                <span class="font">#금수저</span>
                <p>가난한 집에서 태어난 아이가 우연히 얻게 된 금수저를 통해 부잣집에서 태어난 친구와 운명을 바꿔 후천적 금수저가 된 인생 어드벤처 이야기. 동명 웹툰 원작.</p>
             </div><!--borderline-->

             <div class="borderline">
                <h3>출연진</h3>

                <ul id="header_navi">
                    <li><a href="#"><img src="img/gold1.jpg"><span>Yook Sung-jae <br/>Lee Seung-chun</span></a></li>
                    <li><a href="#"><img src="img/gold2.jpg"><span>Lee Joung-won <br/>Hwang Tae-yong</span></a></li>
                    <li><a href="#"><img src="img/gold3.jpg"><span>Jung Chae-yeon <br/>Na Ju-hee</span></a></li>
                    <li><a href="#"><img src="img/gold4.jpg"><span>Yeon-woo <br/> Oh Yeo-jin</span></a></li>
                    <li><a href="#"><img src="img/gold5.jpg"><span>Choi Won-young <br/> Hwang Hyeon-do</span></a></li>
                    <li><a href="#"><img src="img/gold6.jpg"><span>Choi Dae-chul <br/> Lee Chul</span></a></li>
                    <li><a href="#"><img src="img/gold7.jpg"><span>Han Chae-ah <br/> Jin Sun-hye</span></a></li>
                  </ul>

                </div><!--borderline-->


                <div class="borderline textline">

			<%=commentSb %>
			<!--  
                  <div class="writer">

                    글쓴이 <input type="text" name="cwriter" maxlength="10" class="coment_input" />&nbsp;&nbsp;
					비밀번호 <input type="password" name="cpassword" class="coment_input pR10" />&nbsp;&nbsp;

                  <h3>댓글 23개</h3>
                </div> <!-- writer-->
                <!--<form>
                    <textarea class="textarea" placeholder="댓글을 입력해주세요"></textarea>
                  </form>
                  <input class="comment keyup"type="submit" value="댓글등록">
                  <ul class="comments">
                    <li>Name</li>
                    <span>하이</span>
               -->
                </div><!--borderline-->
        </div><!-- container-->
    </div> <!-- wrap-->

   </section>
   
<script>
var mapOptions = {
    center: new naver.maps.LatLng(37.3595704, 127.105399),
    zoom: 10
};

var map = new naver.maps.Map('map', mapOptions);

var HOME_PATH = window.HOME_PATH || '.';
var cityhall = new naver.maps.LatLng(37.5666805, 126.9784147),
    map = new naver.maps.Map('map', {
        center: cityhall,
        zoom: 15
    }),
    marker = new naver.maps.Marker({
        map: map,
        position: cityhall
    });

var contentString = [
        '<div class="iw_inner">',
        '   <h3>서울특별시청</h3>',
        '   <p>서울특별시 중구 태평로1가 31 | 서울특별시 중구 세종대로 110 서울특별시청<br />',
        '       <img src="'+ HOME_PATH +'/img/example/hi-seoul.jpg" width="55" height="55" alt="서울시청" class="thumb" /><br />',
        '       02-120 | 공공,사회기관 &gt; 특별,광역시청<br />',
        '       <a href="http://www.seoul.go.kr" target="_blank">www.seoul.go.kr/</a>',
        '   </p>',
        '</div>'
    ].join('');

var infowindow = new naver.maps.InfoWindow({
    content: contentString,
    maxWidth: 140,
    backgroundColor: "#eee",
    borderColor: "#2db400",
    borderWidth: 5,
    anchorSize: new naver.maps.Size(30, 30),
    anchorSkew: true,
    anchorColor: "#eee",
    pixelOffset: new naver.maps.Point(20, -20)
});

naver.maps.Event.addListener(marker, "click", function(e) {
    if (infowindow.getMap()) {
        infowindow.close();
    } else {
        infowindow.open(map, marker);
    }
});
</script>
    
</body>
</html>