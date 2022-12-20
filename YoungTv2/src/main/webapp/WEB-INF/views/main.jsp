<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Main</title>
  <link href="${pageContext.request.contextPath}/css/stylesheet.css" rel="stylesheet" type="text/css">
  <link href="${pageContext.request.contextPath}/css/sidebar.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="stylesheet.css">
<link rel="stylesheet" href="sidebar.css">
<link href="http://hangeul.pstatic.net/hangeul_static/css/nanum-square.css" rel="stylesheet">
<script src="https://kit.fontawesome.com/c85ddc4e85.js" crossorigin="anonymous"></script>
<script src="main.js" defer></script>

  <script>
      $(document).ready(function () {
        $.ajax({
          type: "GET",
          url: "https://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=f5eef3421c602c6cb7ea224104795888&targetDt=20221219", //사용자가 가져온 API를 넣으세요
          data: {},
          success: function (response) {
            let movieList = response["boxOfficeResult"]["dailyBoxOfficeList"];
            for (let i = 0; i < movieList.length; i++) {
              let rank = movieList[i]["rank"];
              let movieNm = movieList[i]["movieNm"];
              let movieCd = movieList[i]["movieCd"];
             
            
           

              $(".container").append("<ul>");
              $(".container").append("<li>" + "<a href='container'>" +"<img src='img/gold.jpg'>"+"</a>"+"<span>" + movieNm + 
            		  "</span>" + "<span>" + 드라마 + "</span>" + "<i class='fa-solid fa-heart'>" + "</i>" + 90 + "</span>" + "</li>" );
            }
          },
        });
      });
    </script>

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
            <h2> 지금 나에게 필요한 인기 영상</h2>
            <ul>
                <li><a href="container"><img src="img/gold.jpg"></a><span class="title">금수저</span><span>드라마</span><span><i class="fa-solid fa-heart"></i>90</span></li>
                <li><a href="container"><img src="img/gold.jpg"></a><span class="title">금수저</span><span>드라마</span><span><i class="fa-solid fa-heart"></i>90</span></li>
                <li><a href="container"><img src="img/gold.jpg"></a><span class="title">금수저</span><span>드라마</span><span><i class="fa-solid fa-heart"></i>90</span></li>
                <li><a href="container"><img src="img/gold.jpg"></a><span class="title">금수저</span><span>드라마</span><span><i class="fa-solid fa-heart"></i>90</span></li>
                <li><a href="container"><img src="img/gold.jpg"></a><span class="title">금수저</span><span>드라마</span><span><i class="fa-solid fa-heart"></i>90</span></li>
               
            </ul>

            <h2> 최신 드라마를 감상해보세요</h2>
            <ul>
                <li><img src="img/gold.jpg"><span class="title">금수저</span><span>드라마</span><span><i class="fa-solid fa-heart"></i>90</span></li>
                <li><img src="img/gold.jpg"><span class="title">금수저</span><span>드라마</span><span><i class="fa-solid fa-heart"></i>90</span></li>
                <li><img src="img/gold.jpg"><span class="title">금수저</span><span>드라마</span><span><i class="fa-solid fa-heart"></i>90</span></li>
                <li><img src="img/gold.jpg"><span class="title">금수저</span><span>드라마</span><span><i class="fa-solid fa-heart"></i>90</span></li>
                <li><img src="img/gold.jpg"><span class="title">금수저</span><span>드라마</span><span><i class="fa-solid fa-heart"></i>90</span></li>
            </ul>

            <h2> 당신의 웃음을 책임집니다.</h2>
            <ul>
                <li><img src="img/gold.jpg"><span class="title">금수저</span><span>드라마</span><span><i class="fa-solid fa-heart"></i>90</span></li>
                <li><img src="img/gold.jpg"><span class="title">금수저</span><span>드라마</span><span><i class="fa-solid fa-heart"></i>90</span></li>
                <li><img src="img/gold.jpg"><span class="title">금수저</span><span>드라마</span><span><i class="fa-solid fa-heart"></i>90</span></li>
                <li><img src="img/gold.jpg"><span class="title">금수저</span><span>드라마</span><span><i class="fa-solid fa-heart"></i>90</span></li>
                <li><img src="img/gold.jpg"><span class="title">금수저</span><span>드라마</span><span><i class="fa-solid fa-heart"></i>90</span></li>
            </ul>
        </div><!-- container-->
    </div> <!-- wrap-->

   </section>

    
</body>
</html>