package acao;

import DAO.LeilaoDaoSession;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

public class dashboard {

    private final HttpServletRequest req;
    private final HttpServletResponse resp;

    public dashboard(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.req = req;
        this.resp = resp;
    }

    public void executa() throws IOException, ServletException {
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }

}

