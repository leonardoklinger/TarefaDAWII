package acao;
import Entidades.Leilao;
import Enumeradores.SituacaoEnum;
import regras.LeilaoRegras;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CadastrarLeilao {

    private final HttpServletResponse resp;
    private final HttpServletRequest req;

    public CadastrarLeilao(HttpServletRequest req, HttpServletResponse resp){
        this.resp = resp;
        this.req = req;
    }

    public void executa() throws IOException, ServletException {
        String nome = req.getParameter("input-name");
        String situacao = req.getParameter("input-descricao");
        String status = req.getParameter("status");
        if(nome != null){
            LeilaoRegras leilaoRegras = new LeilaoRegras(resp, req);
            if(leilaoRegras.VerificarCampo(nome, situacao) == true){
                SituacaoEnum v = SituacaoEnum.valueOf(status.toUpperCase());
                Leilao leilao = new Leilao(nome, situacao, v.getPrice());
                leilaoRegras.Verificar(leilao);
            }
        }
        req.getRequestDispatcher("/WEB-INF/pages/modules/cadastro-leilao.jsp").forward(req, resp);
    }

}
