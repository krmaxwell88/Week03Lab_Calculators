
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
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
                .forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String entry = request.getParameter("userAge");
        
        int yourAge = 0;
        
        if (entry.equals("")) {
            request.setAttribute("messAge", "You must give your current age.");
        } else {
            try{
             yourAge = Integer.parseInt(entry);
        } catch (NumberFormatException ex) {
                 request.setAttribute("message", "You must enter a number.");
            }
        } 
        
        //yourAge = Integer.parseInt(entry);
        if (yourAge > 0) {
            int nextAge = yourAge + 1;
        request.setAttribute("urAge", nextAge);
        request.setAttribute("messsage", "Your age next birthday will be " + nextAge);
        }
       
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
                .forward(request, response);
    }

    

}
