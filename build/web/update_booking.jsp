
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><center>UPDATE BOOKING</center></h1>
        <fieldset>
            <form>
                <table>
                    <tr>
                        <td>full name</td>
                        <td><input type="text" name="name"></td>
                    </tr>
                    <tr>
                        <td>check-in date</td>
                        <td><input type="date" name="checkin"></td>
                    </tr>
                    <tr>
                        <td>checkout date</td>
                        <td><input type="date" name="checkout"></td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="submit" name="submit" value="UPDATE"></td>
                    </tr>
                </table>
            </form>
        </fieldset>
    </body>
</html>
