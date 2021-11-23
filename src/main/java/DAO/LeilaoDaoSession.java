package DAO;

import Entidades.Leilao;
import Interface.IRepository;
import controler.BancoDeDados;

import java.util.*;

public class LeilaoDaoSession implements IRepository<Leilao, Long> {

    private final BancoDeDados conexao = new BancoDeDados();
    Leilao leilao = new Leilao();

    @Override
    public void salva(Leilao leilao) {
        conexao.session.beginTransaction();
        conexao.session.save(leilao);
        conexao.session.getTransaction().commit();
    }

    @Override
    public void remove(Leilao leilao) {
        conexao.session.getTransaction().begin();
        Leilao leilao1 = conexao.session.find(Leilao.class, leilao.getId());
        conexao.session.remove(leilao1);
        conexao.session.getTransaction().commit();
    }

    @Override
    public Leilao get(Long id) {
        return conexao.session.find(Leilao.class, id);
    }

    @Override
    public List<Leilao> list() {
        return BancoDeDados.session.createQuery("FROM " + Leilao.class.getName()).getResultList();
    }
}
