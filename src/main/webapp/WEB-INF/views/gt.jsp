<!DOCTYPE html>
<html xmlns:th="http://www.w3.org/1999/xhtml">
<head>
    <title>JoaoDuraes' Twitter Bootstrap example</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"> </meta>
    <!-- Bootstrap -->
    <link href="/webjars/bootstrap.min.css" rel="stylesheet" media="screen"> </link>

    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css">
</head>
<body>

<p th:text="'Hello, ' + ${username} + '!'" />

<div class="btn-group">
    <button type="button" class="btn btn-success">This is a success button</button>
    <button type="button" class="btn btn-warning">This is a warning button</button>
    <button type="button" class="btn btn-danger">This is a danger button</button>
</div>
</body>
</html>