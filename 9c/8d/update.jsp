<%@ page import="java.sql.*, db.DBConnection" %>
<%
    int empno = Integer.parseInt(request.getParameter("empno"));
    String empname = request.getParameter("empname");
    int salary = Integer.parseInt(request.getParameter("salary"));

    Connection con = null;
    PreparedStatement ps = null;
    int result = 0;

    try {
        con = DBConnection.getConnection();
        ps = con.prepareStatement("UPDATE Emp SET Emp_Name = ?, Basicsalary = ? WHERE Emp_NO = ?");
        ps.setString(1, empname);
        ps.setInt(2, salary);
        ps.setInt(3, empno);

        result = ps.executeUpdate();
    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
    } finally {
        if (ps != null) ps.close();
        if (con != null) con.close();
    }

    if (result > 0) {
        response.sendRedirect("status.jsp?msg=success");
    } else {
        response.sendRedirect("status.jsp?msg=fail");
    }
%>
