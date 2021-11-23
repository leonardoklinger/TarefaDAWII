package acao;
import Entidades.Participante;
import regras.ParticipanteRegras;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CadastrarParticipante {

    private final HttpServletResponse resp;
    private final HttpServletRequest req;

    public CadastrarParticipante(HttpServletRequest req, HttpServletResponse resp){
        this.resp = resp;
        this.req = req;
    }

    public void executa() throws IOException, ServletException {
        String nome = req.getParameter("input-name");
        String sobrenome = req.getParameter("input-sobrenome");
        String cpf = req.getParameter("input-cpf");
        if(nome != null){
            ParticipanteRegras participanteRegras = new ParticipanteRegras(resp, req);
                Participante participante = new Participante(nome, sobrenome, cpf);
                participanteRegras.Verificar(participante);
        }
        req.getRequestDispatcher("/WEB-INF/pages/modules/cadastro-participante.jsp").forward(req, resp);
    }

}
