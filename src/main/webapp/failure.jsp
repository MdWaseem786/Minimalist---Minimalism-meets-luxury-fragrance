<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login Failed</title>
    <style>
        body {
            font-family: 'Segoe UI', sans-serif;
            background-color: #fff3e0;
            display: flex;
            flex-direction: column;
            align-items: center;
            padding: 40px;
        }
        .box {
            background: #ffffff;
            padding: 30px;
            border-radius: 12px;
            box-shadow: 0 0 15px rgba(0,0,0,0.15);
            text-align: center;
            max-width: 400px;
            width: 100%;
        }
        .fail {
            color: red;
            font-size: 18px;
            margin-bottom: 20px;
        }
        img {
            width: 120px;
            margin-bottom: 20px;
        }
        a {
            text-decoration: none;
            color: #0077cc;
            font-weight: bold;
        }
    </style>
</head>
<body>
    <div class="box">
      
        <div class="fail">❌ Login Failed. Please try again.</div>
        <a href="login.html">Back to Login</a>
    </div>
</body>
</html>
