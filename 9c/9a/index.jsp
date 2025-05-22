<!DOCTYPE html>
<html>
<head>
    <title>Delete Coffee Product</title>
</head>
<body>
    <h2>Delete Coffee Product by ID</h2>
    <form action="deleteCoffee.jsp" method="post">
        <label>Enter Coffee ID to Delete:</label>
        <input type="number" name="id" required>
        <input type="submit" value="Delete Coffee">
    </form>

    <hr>
    <h2>All Coffee Records</h2>
    <jsp:include page="displayCoffee.jsp" />
</body>
</html>
