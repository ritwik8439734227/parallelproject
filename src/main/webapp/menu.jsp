<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<title>Menu</title>
</head>
<body>
<h1>Welcome User!!!</h1>
<br>
<br>
<!-- <h2><a href="../deposit.jsp">DEPOSIT</a></h2>
<h2><a href="../withdraw.jsp">WITHDRAW</a></h2>
<h2><a href="../account/showbalance">SHOW ACCOUNT BALANCE</a></h2>
<h2><a href="../fundtransfer.jsp">FUND TRANSFER</a></h2>
<h2><a href="../index.jsp">LOGOUT</a></h2> -->
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
<nav class="navbar navbar-expand-lg">

                <ul class="navbar-nav">
                    <li class="active">
                        <a href="../deposit.jsp" class="nav-link">DEPOSIT</a>
                    </li>
                    <li class="nav-item">
                        <a href="../withdraw.jsp" class="nav-link">WITHDRAW</a>
                    </li>
                    
                    <li class="nav-item">
                        <a href="#" class="nav-link">SHOW ACCOUNT BALANCE</a>
                    </li>
                     <li class="nav-item">
                        <a href="../account/showbalance" class="nav-link">FUND TRANSFER</a>
                    </li>
                     <li class="nav-item">
                        <a href="../index.jsp" class="nav-link">LOGOUT</a>
                    </li>
                </ul>
            </div>
        </nav>
</body>
</html>