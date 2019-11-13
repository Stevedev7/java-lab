<!DOCTYPE html>
<html lang="en" dir="ltr">
    <head>
        <meta charset="utf-8">
        <title>Result</title>
    </head>
    <body>
        <%
        try {
            int a = Integer.parseInt(request.getParameter("a"));
            int b = Integer.parseInt(request.getParameter("b"));
            int op = Integer.parseInt(request.getParameter("op"));
            String result = "";
            String symb = "";
            int res = 0;
            switch(op){
                case 1:
                    result = "Sum";
                    symb = " + ";
                    res = a + b;
                    break;
                case 2:
                    result = "Product";
                    symb = " * ";
                    res = a * b;
                    break;
                case 3:
                    result = "Difference";
                    symb = " - ";
                    res = a - b;
                    break;
                case 4:
                    result = "Quotitent";
                    symb = " / ";
                    res = a / b;
                    break;
            }
            out.println("<h1>" + result + "</h1> <br>");
            out.println("<h1>" + a + symb + b + " = " + res + "</h1>");
        } catch(Exception e){
            out.println("<h1>" + e + "</h1>");
            out.println("<a href=\"clculator.jsp\">Go back</a>");
        }
        %>
    </body>
</html>
