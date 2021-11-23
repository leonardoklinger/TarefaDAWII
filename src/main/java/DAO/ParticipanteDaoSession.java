package DAO;

import Entidades.Participante;
import Interface.IRepository;
import controler.BancoDeDados;

import java.util.*;

public class ParticipanteDaoSession implements IRepository<Participante, Long> {

    private final BancoDeDados conexao = new BancoDeDados();
    Participante participante = new Participante();
    @Override
    public void salva(Participante participante) {
        conexao.session.beginTransaction();
        conexao.session.save(participante);
        conexao.session.getTransaction().commit();
    }

    @Override
    public void remove(Participante participante) {
        conexao.session.getTransaction().begin();
        Participante participante1 = conexao.session.find(Participante.class, participante.getId());
        conexao.session.remove(participante1);
        conexao.session.getTransaction().commit();
    }

    @Override
    public Participante get(Long id) {
        return conexao.session.find(Participante.class, id);
    }

    @Override
    public List<Participante> list() {
        return BancoDeDados.session.createQuery("FROM " + Participante.class.getName()).getResultList();
    }
}
