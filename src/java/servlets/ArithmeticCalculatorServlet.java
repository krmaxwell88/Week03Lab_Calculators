
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 585594
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int nom1 = Integer.parseInt(request.getParameter("num1"));
        int nom2 = Integer.parseInt(request.getParameter("num2"));
        
        request.setAttribute("enum1", nom1);
        request.setAttribute("enum2", nom2);
        
        String empty1 = request.getParameter("num1");
        String empty2 = request.getParameter("num2");
        
        int entry1 = 0;
        int entry2 = 0;
        int result = 0;
        
       
        String operation = request.getParameter("calc");
        while (empty1.equals("") && empty2.equals("")){
            request.setAttribute("message", "Results: ---");
            if ("+".equals(operation) || "-".equals(operation) || "*".equals(operation) || "%".equals(operation)){
                request.setAttribute("message", "Results: invalid");
                
                
            }
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
            //return;
        }
        while ("" != empty1 && "" != empty2){
            if ("+".equals(operation)){
            result = nom1 + nom2;
            request.setAttribute("result", result);
        } 
        else if ("-".equals(operation)) {
            result = nom1 - nom2;
            request.setAttribute("result", result);
        }
        else if ("*".equals(operation)) {
            result = nom1 * nom2;
            request.setAttribute("result", result);
        }
        else if ("%".equals(operation)) {
            result = nom1 % nom2;
            request.setAttribute("result", result);
        }
        
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
        }
        
    }

    

}
