<html>
<head>
<link rel="shortcut icon" type="image/png" href="/static/images/favicon.ico" />
<script type="text/javascript", src="/static/js/hello.js"></script>
<link rel="stylesheet" type="text/css" href="/static/css/alien.css" />
   <script>
      document.addEventListener("DOMContentLoaded",function(){

       var body=document.body;
        setInterval(createStar,100);
        function createStar(){
          var right=Math.random()*500;
          var top=Math.random()*screen.height;
          var star=document.createElement("div");
       star.classList.add("star")
        body.appendChild(star);
        setInterval(runStar,10);
          star.style.top=top+"px";
        function runStar(){
          if(right>=screen.width){
            star.remove();
          }
          right+=3;
          star.style.right=right+"px";
        }
        }
      })
      </script>



</head>
<body>
      <div class="text">
        <div>ERROR</div>
        <h1>404</h1>
        <hr>
        <div>Page Not Found</div>
      </div>

      <div class="astronaut">
        <img src="https://images.vexels.com/media/users/3/152639/isolated/preview/506b575739e90613428cdb399175e2c8-space-astronaut-cartoon-by-vexels.png" alt="" class="src">
      </div>


</body>

</html>
