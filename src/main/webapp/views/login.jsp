<%@ include file="supportFiles/taglib.jspf" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Registration</title>
    <link rel="stylesheet" href="static/css/styleForLogAndRegForms.css" type="text/css">
    <script src='https://www.google.com/recaptcha/api.js'></script>
    <style>
        body{
            background-image: linear-gradient(145deg, #ee82ee, slateblue, #ffd86a, purple);
        }
    </style>
</head>
<body>
<div class="login-page">
    <div class="form">
        <form method="post" action="${fullPath}/loginForm/login">
            <div>
                <input style="float: left;" type="email" placeholder="Email" name="email"/>
            </div>
            <div>
                <input style="float: left;" type="password" placeholder="Password" name="password"/>
            </div>
            <input style="background:greenyellow;" type="submit" value="Login">
        </form>
    </div>
</div>
<center>
    <a href="${fullPath}/">
        <ins>Back</ins>
    </a>
</center>

</body>
</html>

