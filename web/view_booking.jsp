
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><center>VIEW BOOKING</center></h1>
        <fieldset>
            <form action="viewReservation" method="get">
                <table>
                    <tr>
                        <td>name: </td>
                        <td><input type="text" name="name"></td>
                    </tr>
                    <tr><td colspan="2"><input type="submit" name="submit"></td></tr>
                </table>
            </form>
        </fieldset>
    </body>
</html>
