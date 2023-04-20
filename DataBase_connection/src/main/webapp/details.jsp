<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Data Base connection</title>
</head>
<body>
    <h1 style="color: red;">Enter Details:</h1>
    <form action="savestudent">
        <label for=""  style="color:blue">Student Id:</label>
        <input type="text" name="sid" placeholder="enter id">
        <br>
        <label for=""  style="color:blue">Student name:</label>
        <input type="text" name="sname" placeholder="enter name">
        <br>
        <label for="" style="color:blue"> Student Email:</label>
        <input type="text" name="email" placeholder="enter email">
        <br>
        <label for=""  style="color:blue">Student phno:</label>
        <input type="text" name="phno" placeholder="enter phno">
        <br>
        <input type="submit">
    </form>

     <h1 style="color: red;">Please enter the SID for the details:</h1>
    <form action="getById">
        <label for=""  style="color:blue">Student Id:</label>
        <input type="text" name="sid" placeholder="enter Student id">
        <input type="submit">
    </form>

    <h1 style="color: red;">Please enter the SID for the deletion:</h1>
    <form action="deleteById">
        <label for=""  style="color:blue">Student Id:</label>
        <input type="text" name="sid" placeholder="enter Student id">
        <input type="submit">
    </form>
    <h1 style="color: red;">${message}</h1>

    <h1 style="color: red;">Please enter the SID for the update Name:</h1>
    <form action="updateById">
        <label for=""  style="color:blue">Student Id:</label>
        <input type="text" name="sid" placeholder="enter Student id">
        <label for=""  style="color:blue">Update Student Name:</label>
        <input type="text" name="sname" placeholder="enter Student name">
        <input type="submit">
    </form>
    <h1 style="color: red;">${message1}</h1>
</body>
</html>