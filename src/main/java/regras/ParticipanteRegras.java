package regras;

import DAO.LeilaoDaoSession;
import DAO.ParticipanteDaoSession;
import Entidades.Participante;
import controler.BancoDeDados;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class ParticipanteRegras {
    private final HttpServletResponse resp;
    private final HttpServletRequest req;
    BancoDeDados conexao = new BancoDeDados();
    ParticipanteDaoSession dao = new ParticipanteDaoSession();

    public ParticipanteRegras(HttpServletResponse resp, HttpServletRequest req) {
        this.resp = resp;
        this.req = req;
    }

    public void Verificar(Participante participante){
        String hql = "from Participante l where l.nome = :participante";
        List result = conexao.session.createQuery(hql).setParameter("participante", participante.getNome()).list();
        if (result.size() > 0){
            req.setAttribute("Verificar", "User " + participante.getNome() + " já existe !");
        } else {
            dao.salva(participante);
        }
    }
}
