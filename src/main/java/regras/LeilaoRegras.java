package regras;
import DAO.LeilaoDaoSession;
import Entidades.Leilao;
import controler.BancoDeDados;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


public class LeilaoRegras {
    private final HttpServletResponse resp;
    private final HttpServletRequest req;
    BancoDeDados conexao = new BancoDeDados();
    LeilaoDaoSession dao = new LeilaoDaoSession();

    public LeilaoRegras(HttpServletResponse resp, HttpServletRequest req) {
        this.resp = resp;
        this.req = req;
    }
    public void Verificar(Leilao leilao){
        String hql = "from Leilao l where l.nome = :leilao";
        List result = conexao.session.createQuery(hql).setParameter("leilao", leilao.getNome()).list();
        if (result.size() > 0){
            req.setAttribute("Verificar", "Leilão " + leilao.getNome() + " já existe !");
        } else {
            dao.salva(leilao);
        }
    }

    public boolean VerificarCampo(String nome, String situacao){
        boolean valido = false;
        if(nome.equals("")){
            req.setAttribute("VerificarCampo", "Campo nome obrigatório !");
        } else if(situacao.equals("")) {
            req.setAttribute("VerificarCampo", "Campo descrição obrigatório !");
        } else {
            valido = true;
        }
        return valido;
    }
}
