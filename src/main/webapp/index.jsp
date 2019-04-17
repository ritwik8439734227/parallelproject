<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<title>welcome to CUB bank</title>
</head>
<body>
<h1>WELCOME TO CUB BANK </h1>
<br>
<br>
<!-- <h2><a href="../admin.jsp">ADMIN</a></h2>
<br>
<br>
<h2><a href="../customer.jsp">CUSTOMER LOGIN</a></h2>
<br>
 -->
<nav class="navbar navbar-expand-lg">
				
                <ul class="navbar-nav">
                    <li class="active">
                        <a href="../admin.jsp" class="nav-link">Admin Login</a>
                    </li>
                   
                   
                    <li class="nav-item">
                        <a href="../customer.jsp" class="nav-link">Customer Login</a>
                    </li>
                    
                   <!--  <li class="nav-item">
                        <a href="#" class="nav-link">Contact Us</a>
                    </li> -->
                </ul>
            </div>
        </nav>
        
        <style>
        .nav-item::after{
    content:'';
    display:block;
    width:0px;
    height:4px;
    background:#ff0000;
    transition: 0.2s;
    margin-top:-10px;
}

.nav-item:hover::after{width:100%;}


.nav-link{padding:15px 5px;transition:0.2s;}

.navbar-nav .nav-link {
    
    color:#000;
    font-weight:bold;
    font-size:18px;
}

.navbar-nav .active > .nav-link{
  
    width:100%;
    height:51px;
    
  border-bottom: .25rem solid transparent;
  border-bottom-color: #ed4137;
   
}
        </style>
</body>
</html>