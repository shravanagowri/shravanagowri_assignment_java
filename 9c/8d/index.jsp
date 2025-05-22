<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html>
<head><title>Update Employee</title></head>
<body>
    <h2>Update Employee Record</h2>
    <form action="update.jsp" method="post">
        Emp No: <input type="text" name="empno" required><br>
        Emp Name: <input type="text" name="empname" required><br>
        Basic Salary: <input type="text" name="salary" required><br><br>
        <input type="submit" value="Update">
    </form>
</body>
</html>
