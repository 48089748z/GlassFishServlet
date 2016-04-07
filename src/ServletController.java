import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletController extends HttpServlet
{
    @Override
    public void init() throws ServletException {super.init();}
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        String value = req.getParameter("value");
        String toPost = Cesar.convert(value);
        PrintWriter pw = resp.getWriter();
        pw.println(toPost);
    }
}
