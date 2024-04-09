
<%@ page isELIgnored ="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Error Page</title>
<style>
  body {
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
    background-color: #f8f9fa;
  }
  .error-container {
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
    flex-direction: column;
    text-align: center;
  }
  .error-code {
    font-size: 72px;
    color: #dc3545; /* red color */
  }
  .error-message {
    font-size: 24px;
    margin-top: 20px;
    margin-bottom: 40px;
    color: #6c757d; /* dark grey color */
  }
  .error-button {
    padding: 10px 20px;
    background-color: #007bff;
    color: #fff;
    border: none;
    border-radius: 4px;
    cursor: pointer;
    font-size: 16px;
    text-decoration: none;
  }
  .error-button:hover {
    background-color: #0056b3;
  }
</style>
</head>
<body>

<div class="error-container">
  <div class="error-code">500</div>
  <div class="error-message">Oops! ${msg} </div>
  <a href="" class="error-button">Go to Home Page</a>
</div>

</body>
</html>
