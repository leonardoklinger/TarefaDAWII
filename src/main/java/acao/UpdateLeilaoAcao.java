package acao;

import DAO.LeilaoDaoSession;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

public class UpdateLeilaoAcao {

    private final HttpServletRequest req;
    private final HttpServletResponse resp;

    public UpdateLeilaoAcao(HttpServletResponse resp, HttpServletRequest req) throws ServletException, IOException {
        this.req = req;
        this.resp = resp;
    }

    public void executa() throws IOException, ServletException {

        String id = req.getParameter("pID");
        LeilaoDaoSession dao = new LeilaoDaoSession();

        String campoNome = req.getParameter("objeto");
        Integer valorMinimo = Integer.valueOf(req.getParameter("valor"));
        LocalDate data = LocalDate.parse(req.getParameter("data"));
        String status = req.getParameter("status");
        //Leilao leilao = new Leilao((campoNome),valorMinimo,data,status);


        //dao.update(leilao);
        resp.sendRedirect(req.getServletContext().getContextPath() + "/entrada?acao=listarLeilao");

    }

}
