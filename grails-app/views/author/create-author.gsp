<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Form</title>
</head>
<body>
<g:form controller="author" action="save">
    <label>Author Name: </label>
    <g:textField name="name"/><br/>

    <label>First Book Name: </label>
    <g:textField name="books[0].name"/><br/>
    <label>First Book Genre: </label>
    <g:textField name="books[0].genre"/><br/>


    <label>Second Book Name: </label>
    <g:textField name="books[1].name"/><br/>
    <label>Second Book Genre: </label>
    <g:textField name="books[1].genre"/><br/>

    <g:actionSubmit value="Save"/>
</g:form>
</body>
</html>