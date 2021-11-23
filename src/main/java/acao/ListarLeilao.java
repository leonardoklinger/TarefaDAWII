package acao;
import DAO.LeilaoDaoSession;
import Entidades.Leilao;
import Enumeradores.SituacaoEnum;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListarLeilao {

    private final HttpServletResponse resp;
    private final HttpServletRequest req;

    public ListarLeilao(HttpServletRequest req, HttpServletResponse resp){
        this.resp = resp;
        this.req = req;
    }

    public void executa() throws IOException, ServletException {
        LeilaoDaoSession dao = new LeilaoDaoSession();
        List<Leilao> list = dao.list();
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/pages/modules/leiloes.jsp");
        req.setAttribute("list", list);
        dispatcher.forward(req, resp);
    }

}
