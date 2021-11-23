package acao;

import DAO.LeilaoDaoSession;
import Entidades.Leilao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class DeletarLeilao {

    private final HttpServletRequest req;
    private final HttpServletResponse resp;

    public DeletarLeilao(HttpServletRequest req, HttpServletResponse resp){
        this.resp = resp;
        this.req = req;
    }

    public void executa() throws ServletException, IOException {
        String id = req.getParameter("id");
        LeilaoDaoSession dao = new LeilaoDaoSession();
        Leilao l = dao.get(Long.parseLong(id));
        dao.remove(l);
        ListarLeilao listarLeilao = new ListarLeilao(req, resp);
        listarLeilao.executa();
    }

}
