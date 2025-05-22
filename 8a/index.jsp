<!DOCTYPE html>
<html>
<head>
    <title>Add Coffee Product</title>
</head>
<body>
    <h2>Add New Coffee</h2>
    <form action="insertCoffee.jsp" method="post">
        <label>ID:</label>
        <input type="number" name="id" required><br><br>

        <label>Coffee Name:</label>
        <input type="text" name="coffee_name" required><br><br>

        <label>Price:</label>
        <input type="number" step="0.01" name="price" required><br><br>

        <input type="submit" value="Add Coffee">
    </form>

    <hr>
    <h2>All Coffee Records</h2>
    <jsp:include page="displayCoffee.jsp" />
</body>
</html>
