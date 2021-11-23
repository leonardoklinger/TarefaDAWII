package controler;
import acao.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/dashboard")
public class Dashboard extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        String acao = req.getParameter("acao");
        switch (acao) {
            case "cadastraLeilao":
                    CadastrarLeilao cadastrarLeilao = new CadastrarLeilao(req, resp);
                    cadastrarLeilao.executa();
                break;
            case "cadastraParticipante":
                CadastrarParticipante cadastrarParticipante = new CadastrarParticipante(req, resp);
                cadastrarParticipante.executa();
                break;
            case "listarLeilao":
                    ListarLeilao listarLeilao = new ListarLeilao(req, resp);
                    listarLeilao.executa();
                break;
            case "deleta":
                DeletarLeilao deletarLeilao = new DeletarLeilao(req, resp);
                deletarLeilao.executa();
                break;
            case "dashboard":
                dashboard dashboard = new dashboard(req, resp);
                dashboard.executa();
                break;
            default:
                System.out.println("Não existe !");
        }
    }
}