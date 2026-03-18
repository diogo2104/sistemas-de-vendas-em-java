package sistemaDeVendas;
import java.awt.*; 
import javax.swing.*;

public class sistemasDeVendas {
    public static void main(String[] args) {
        JFrame sistemasDeVendas = new JFrame();
        sistemasDeVendas.setTitle("Sistema de Vendas");
        sistemasDeVendas.setSize(900, 600);
        sistemasDeVendas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sistemasDeVendas.setLayout(new FlowLayout());
        JMenuBar menuAcesso = new JMenuBar();
        //Menu de acesso

        //Acesso dos produtos
        JMenu menuCadastro = new JMenu("Produtos");
        JMenuItem itemCadastro = new JMenuItem("Novo Produto");
        JMenuItem itemEditar = new JMenuItem("Editar Produto");
        JMenuItem itemExcluir = new JMenuItem("Excluir Produto");
        menuAcesso.add(menuCadastro);
        menuCadastro.add(itemCadastro);
        menuCadastro.add(itemEditar);
        menuCadastro.add(itemExcluir);

        //Acesso dos clientes
        JMenu menuClientes = new JMenu("Clientes");
        JMenuItem itemCadastroCliente = new JMenuItem("Novo Cliente");
        JMenuItem itemVizualizarCliente = new JMenuItem("Visualizar Cliente");
        menuAcesso.add(menuClientes);
        menuClientes.add(itemCadastroCliente);
        menuClientes.add(itemVizualizarCliente);


        //Acesso a vendas
        JMenu menuVendas = new JMenu ("Vendas");
        JMenuItem itemHistoricoVendas = new JMenuItem("Histórico de Vendas");
        JMenuItem itemDashboardVendas = new JMenuItem("Dashboard de Vendas");
        
        menuAcesso.add(menuVendas);
        menuVendas.add(itemHistoricoVendas);
        menuVendas.add(itemDashboardVendas);
        

       //Acesso a relatórios
        JMenu menuRelatorios = new JMenu("Relatórios");












        sistemasDeVendas.setJMenuBar(menuAcesso);
        sistemasDeVendas.setVisible(true);
    }
}
