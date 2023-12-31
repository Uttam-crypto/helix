<html>
<link rel="shortcut icon" type="image/png" href="/static/images/favicon.ico" />
<head>
     <script
     			  src="https://code.jquery.com/jquery-3.6.3.min.js"
     			  integrity="sha256-pvPw+upLPUjgMXY0G+8O0xUf+/Im1MZjXxxgOcBQBXU="
     			  crossorigin="anonymous"></script>
       <style>
               @import url("https://fonts.googleapis.com/css2?family=Poppins&display=swap");

               * {
                 margin: 0;
                 padding: 0;
                 box-sizing: border-box;
                 font-family: "Poppins", sans-serif;
               }

               body {
                 background-color: #00acee;
                 width: 100%;
                 min-height: 100vh;

                 display: flex;
                 align-items: center;
                 justify-content: center;
               }

               button,
               input {
                 border: none;
                 outline: none;
               }

               /****************
                     FORM
               *****************/
               .signup {
                 background-color: white;
                 width: 100%;
                 max-width: 500px;
                 padding: 50px 70px;
                 display: flex;
                 flex-direction: column;
                 justify-content: center;

                 border-radius: 20px;
                 box-shadow: 0 10px 15px -3px rgba(0, 0, 0, 0.1),
                   0 4px 6px -2px rgba(0, 0, 0, 0.05);
               }

               h1 {
                 text-align: center;
                 color: #00acee;
               }
               h2 {
                 text-align: center;
                 font-size: 1.2rem;
                 font-weight: lighter;

                 margin-bottom: 40px;
               }

               h2 span {
                 text-decoration: underline;
                 cursor: pointer;
                 color: #00acee;
               }

               /*  Field */
               .signup__field {
                 display: flex;
                 flex-direction: column;
                 width: 100%;
                 position: relative;
                 margin-bottom: 50px;
               }

               .signup__field:before {
                 content: "";
                 display: inline-block;
                 position: absolute;
                 width: 0px;
                 height: 2px;
                 background: #00acee;
                 bottom: 0;
                 left: 50%;
                 transform: translateX(-50%);
                 transition: all 0.4s ease;
               }

               .signup__field:hover:before {
                 width: 100%;
               }

               /*  Input */
               .signup__input {
                 width: 100%;
                 height: 100%;
                 font-size: 1.2rem;
                 padding: 10px 2px 0;
                 border-bottom: 2px solid #e0e0e0;
               }

               /*  Label */
               .signup__label {
                 color: #bdbdbd;
                 position: absolute;
                 top: 50%;
                 transform: translateY(-50%);
                 left: 2px;
                 font-size: 1.2rem;
                 transition: all 0.3s ease;
               }

               .signup__input:focus + .signup__label,
               .signup__input:valid + .signup__label {
                 top: 0;
                 font-size: 1rem;
                 background-color: white;
               }

               /*  Button */
               button {
                 background: #00acee;
                 color: white;
                 padding: 12px 0;
                 font-size: 1.2rem;
                 border-radius: 25px;
                 cursor: pointer;
               }

               button:hover {
                 background: #00acee;
               }


       </style>
</head>
       <body>
       <form class="signup" onsubmit="return false" autocomplete="off">
         <h1>Create your Account</h1>
         <h2>Welcome to the social network of coders by Mission Helix</h2>

         <div class="signup__field">
           <input class="signup__input" type="text" name="username" id="username" required />
           <label class="signup__label" for="username">Username</label>
         </div>

         <div class="signup__field">
           <input class="signup__input" type="text" name="email" id="email" required />
           <label class="signup__label" for="email">Email</label>
         </div>

         <div class="signup__field">
           <input class="signup__input" type="password" name="password" id="password" required />
           <label class="signup__label" for="password">Password</label>
         </div>
         <p style="color:red; display:none" id="signup-error"></p>
         <button type="button" id="btn-signup">Sign up</button>
       </form>
              <script>
              function validateSignupForm(){
              var name=$("#username").val();
              var email=$("#email").val();
              var password=$("#password").val();
              var error="";
              if(!name){
              error+="Name is empty.";
              }
              if(!email){
              error+="Email is empty.";
              }
              if(!password){
              error+="Password is empty.";
              }
              if(!!password && password.length<=3){
              error+="Password length must be greater than 3 characters.";
              }
              $("#signup-error").html(error);
              if(error.length>0){
              return false;
              }
              return true;
              }


                       $("#btn-signup").click(function(){
                       var isFormValid=validateSignupForm()
                       if(isFormValid){
                       $("#signup-error").hide();
                       var name=$("#username").val();
                       var email=$("#email").val();
                       var password=$("#password").val();
                       var user={
                       "name":name,
                       "email":email,
                       "password":password };

                       $.ajax({
                       type: "POST",
                       dataType: "json",
                       url: "/signup",
                       data: JSON.stringify(user),
                       success: function(response){if(!!response){ alert(response.message); } },
                       contentType: 'application/json'
                       });
                       }
                       else{
                          $("#signup-error").show();
                       }
                       });
              </script>
       </body>
</html>
