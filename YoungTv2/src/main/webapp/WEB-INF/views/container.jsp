<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>container</title>
    
  <link href="${pageContext.request.contextPath}/css/stylesheet.css" rel="stylesheet" type="text/css">
  <link href="${pageContext.request.contextPath}/css/sidebar.css" rel="stylesheet" type="text/css">
  <link href="${pageContext.request.contextPath}/css/container.css" rel="stylesheet" type="text/css">
<!-- <link rel="stylesheet" href="stylesheet.css">
<link rel="stylesheet" href="sidebar.css">
<link rel="stylesheet" href="container.css"> -->

<link href="http://hangeul.pstatic.net/hangeul_static/css/nanum-square.css" rel="stylesheet">
<script src="https://kit.fontawesome.com/c85ddc4e85.js" crossorigin="anonymous"></script>
<script src="main.js" defer></script>
<script src="comments.js"></script>
</head>
<body>
   <nav class="navbar">
        <div class="navbar_logo">
            <a href="" class="navbar_btn">
                <i class="fa-solid fa-bars"></i>
            </a>
                <a href="">YoungKyu</a>
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

                  <div class="writer">

                    글쓴이 <input type="text" name="cwriter" maxlength="10" class="coment_input" />&nbsp;&nbsp;
					비밀번호 <input type="password" name="cpassword" class="coment_input pR10" />&nbsp;&nbsp;

                  <h3>댓글 23개</h3>
                </div> <!-- writer-->
                  <form>
                    <textarea class="textarea" placeholder="댓글을 입력해주세요"></textarea>
                  </form>
                  <input class="comment keyup"type="submit" value="댓글등록">




                  <ul class="comments">
                    <li>Name</li>
                    <span>하이</span>
              
                </div><!--borderline-->

               

                   

           
                  
                 

             

            

           
        </div><!-- container-->
    </div> <!-- wrap-->

   </section>

    
</body>
</html>