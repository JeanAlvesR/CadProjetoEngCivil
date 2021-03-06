/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Principal.IntefaceProjeto;

import Entidades.Cliente;
import Entidades.DetalhesProjeto;
import Entidades.Endereco;
import Entidades.Projeto;
import javax.swing.JOptionPane;


public class MenuConsultaProjeto extends javax.swing.JFrame {

    private static MenuConsultaProjeto menuConsultaProjeto = null;
    private Cliente cliente = null;
    private Projeto projeto = null;
    private MenuConsultaProjeto() {
        initComponents();
    }

    public static MenuConsultaProjeto getMenuConsultaProjeto(){
        if(menuConsultaProjeto == null){
            menuConsultaProjeto = new MenuConsultaProjeto();
        }
        return menuConsultaProjeto;
    }
    
    public void insereDadosProj(Cliente cliente, Projeto pj) {

        cxNomeCliente.setText(cliente.getNome());
        cxCpfCliente.setText(cliente.getCpf());
       
        cxNomeProj.setText(pj.getNome());
        cxCodigo.setText(pj.getCodigoId());
        
        cxComprimento.setText((pj.getDetalhesProjeto().getComprimento()).toString());
        cxLargura.setText(pj.getDetalhesProjeto().getLargura().toString());
        cxInclinacao.setText(pj.getDetalhesProjeto().getInclinacao().toString());
        cxTipoSolo.setText(pj.getDetalhesProjeto().getTipoSolo());
        cxArea.setText(pj.getDetalhesProjeto().getAreaTotal().toString());
        
        cxRua.setText(pj.getDetalhesProjeto().getEndereco().getRua());
        cxNum.setText(pj.getDetalhesProjeto().getEndereco().getNum());
        cxBairro.setText(pj.getDetalhesProjeto().getEndereco().getBairro());
        cxCep.setText(pj.getDetalhesProjeto().getEndereco().getBairro());
        cxCidade.setText(pj.getDetalhesProjeto().getEndereco().getCidade());
        
        this.cliente = cliente;
        this.projeto = pj;
    }
    
    public Cliente capturaCliente(){
    
        Cliente cliente = new Cliente();
        cliente.setNome(cxNomeCliente.getText());
        cliente.setCpf(cxCpfCliente.getText());
        
        Projeto projeto = new Projeto();
        projeto.setNome(cxNomeProj.getText());
        projeto.setCodigoId(cxCodigo.getText());
        
        DetalhesProjeto dp = new DetalhesProjeto();
        
        try{
            dp.setComprimento(Float.parseFloat(cxComprimento.getText()));
            dp.setLargura(Float.parseFloat(cxLargura.getText()));
            dp.setInclinacao(Float.parseFloat(cxInclinacao.getText()));
            dp.setTipoSolo((cxTipoSolo.getText()));
        }catch(NumberFormatException nfe){
            JOptionPane.showConfirmDialog(null, "O comprimento, inclina????o e largura precisam ser n??meros e separados por ponto!","Error",0);
            return null;
        }

        Endereco end = new Endereco();
        end.setRua(cxRua.getText());
        end.setNum(cxNum.getText());
        end.setBairro(cxBairro.getText());
        end.setCep(cxCep.getText());
        end.setCidade(cxCidade.getText());
        
        dp.setEndereco(end);
        projeto.setDetalhesProjeto(dp);
        
        cliente.addProjeto(projeto);
        
        
        return cliente;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        lbConsulta = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btEditar = new javax.swing.JButton();
        btSairMenuConsultaCliente = new javax.swing.JButton();
        lbCliente = new javax.swing.JLabel();
        cxNomeCliente = new javax.swing.JLabel();
        lbCPF = new javax.swing.JLabel();
        cxCpfCliente = new javax.swing.JLabel();
        lbDetalhesProjeto1 = new javax.swing.JLabel();
        lbEndereco = new javax.swing.JLabel();
        lbCodigoId = new javax.swing.JLabel();
        lbNome2 = new javax.swing.JLabel();
        lbDetalhesProjeto = new javax.swing.JLabel();
        lbComprimento = new javax.swing.JLabel();
        lbLargura = new javax.swing.JLabel();
        lbInclinacao = new javax.swing.JLabel();
        lbTipoSolo = new javax.swing.JLabel();
        lbCidade = new javax.swing.JLabel();
        lbCep = new javax.swing.JLabel();
        lbBairro = new javax.swing.JLabel();
        lbNum = new javax.swing.JLabel();
        lbRua = new javax.swing.JLabel();
        cxCodigo = new javax.swing.JLabel();
        cxNomeProj = new javax.swing.JLabel();
        cxComprimento = new javax.swing.JLabel();
        cxLargura = new javax.swing.JLabel();
        cxInclinacao = new javax.swing.JLabel();
        cxTipoSolo = new javax.swing.JLabel();
        lbArea = new javax.swing.JLabel();
        cxArea = new javax.swing.JLabel();
        cxRua = new javax.swing.JLabel();
        cxNum = new javax.swing.JLabel();
        cxBairro = new javax.swing.JLabel();
        cxCep = new javax.swing.JLabel();
        cxCidade = new javax.swing.JLabel();
        btFuncionarios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu Consulta Projeto");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setLocationByPlatform(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));

        lbConsulta.setFont(new java.awt.Font("Nimbus Mono PS", 1, 24)); // NOI18N
        lbConsulta.setForeground(new java.awt.Color(255, 255, 255));
        lbConsulta.setText("Consulta Projeto");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(lbConsulta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(lbConsulta)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        btEditar.setBackground(new java.awt.Color(102, 102, 102));
        btEditar.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        btEditar.setForeground(new java.awt.Color(255, 255, 255));
        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btSairMenuConsultaCliente.setBackground(new java.awt.Color(102, 102, 102));
        btSairMenuConsultaCliente.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        btSairMenuConsultaCliente.setForeground(new java.awt.Color(255, 255, 255));
        btSairMenuConsultaCliente.setText("Sair");
        btSairMenuConsultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairMenuConsultaClienteActionPerformed(evt);
            }
        });

        lbCliente.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        lbCliente.setForeground(new java.awt.Color(255, 255, 255));
        lbCliente.setText("Cliente:");

        cxNomeCliente.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        cxNomeCliente.setForeground(new java.awt.Color(255, 255, 255));
        cxNomeCliente.setText("...");

        lbCPF.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        lbCPF.setForeground(new java.awt.Color(255, 255, 255));
        lbCPF.setText("CPF: ");

        cxCpfCliente.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        cxCpfCliente.setForeground(new java.awt.Color(255, 255, 255));
        cxCpfCliente.setText("...");

        lbDetalhesProjeto1.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        lbDetalhesProjeto1.setForeground(new java.awt.Color(255, 255, 255));
        lbDetalhesProjeto1.setText("DETALHES DO PROJETO");

        lbEndereco.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        lbEndereco.setForeground(new java.awt.Color(255, 255, 255));
        lbEndereco.setText("ENDERE??O DO PROJETO");

        lbCodigoId.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbCodigoId.setForeground(new java.awt.Color(255, 255, 255));
        lbCodigoId.setText("CodigoId: ");

        lbNome2.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbNome2.setForeground(new java.awt.Color(255, 255, 255));
        lbNome2.setText("Nome: ");

        lbDetalhesProjeto.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        lbDetalhesProjeto.setForeground(new java.awt.Color(255, 255, 255));
        lbDetalhesProjeto.setText("DETALHES DO TERRENO");

        lbComprimento.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbComprimento.setForeground(new java.awt.Color(255, 255, 255));
        lbComprimento.setText("Comprimento:");

        lbLargura.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbLargura.setForeground(new java.awt.Color(255, 255, 255));
        lbLargura.setText("Largura:");

        lbInclinacao.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbInclinacao.setForeground(new java.awt.Color(255, 255, 255));
        lbInclinacao.setText("Inclina????o:");

        lbTipoSolo.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbTipoSolo.setForeground(new java.awt.Color(255, 255, 255));
        lbTipoSolo.setText("Tipo de Solo:");

        lbCidade.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbCidade.setForeground(new java.awt.Color(255, 255, 255));
        lbCidade.setText("Cidade:");

        lbCep.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbCep.setForeground(new java.awt.Color(255, 255, 255));
        lbCep.setText("CEP:");

        lbBairro.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbBairro.setForeground(new java.awt.Color(255, 255, 255));
        lbBairro.setText("Bairro:");

        lbNum.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbNum.setForeground(new java.awt.Color(255, 255, 255));
        lbNum.setText("N??:");

        lbRua.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbRua.setForeground(new java.awt.Color(255, 255, 255));
        lbRua.setText("Rua:");

        cxCodigo.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        cxCodigo.setForeground(new java.awt.Color(255, 255, 255));
        cxCodigo.setText("...");

        cxNomeProj.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        cxNomeProj.setForeground(new java.awt.Color(255, 255, 255));
        cxNomeProj.setText("...");

        cxComprimento.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        cxComprimento.setForeground(new java.awt.Color(255, 255, 255));
        cxComprimento.setText("...");

        cxLargura.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        cxLargura.setForeground(new java.awt.Color(255, 255, 255));
        cxLargura.setText("...");

        cxInclinacao.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        cxInclinacao.setForeground(new java.awt.Color(255, 255, 255));
        cxInclinacao.setText("...");

        cxTipoSolo.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        cxTipoSolo.setForeground(new java.awt.Color(255, 255, 255));
        cxTipoSolo.setText("...");

        lbArea.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbArea.setForeground(new java.awt.Color(255, 255, 255));
        lbArea.setText("??rea do Terreno");

        cxArea.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        cxArea.setForeground(new java.awt.Color(255, 255, 255));
        cxArea.setText("...");

        cxRua.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        cxRua.setForeground(new java.awt.Color(255, 255, 255));
        cxRua.setText("...");

        cxNum.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        cxNum.setForeground(new java.awt.Color(255, 255, 255));
        cxNum.setText("...");

        cxBairro.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        cxBairro.setForeground(new java.awt.Color(255, 255, 255));
        cxBairro.setText("...");

        cxCep.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        cxCep.setForeground(new java.awt.Color(255, 255, 255));
        cxCep.setText("...");

        cxCidade.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        cxCidade.setForeground(new java.awt.Color(255, 255, 255));
        cxCidade.setText("...");

        btFuncionarios.setBackground(new java.awt.Color(102, 102, 102));
        btFuncionarios.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        btFuncionarios.setForeground(new java.awt.Color(255, 255, 255));
        btFuncionarios.setText("Funcion??rios");
        btFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFuncionariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbComprimento, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(lbDetalhesProjeto))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(lbNome2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cxNomeProj, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(lbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(lbCep, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxCep, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(lbBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbEndereco)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(lbRua, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxRua, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(lbNum, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxNum, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(64, 64, 64))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(lbArea, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cxArea, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cxComprimento, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(lbLargura, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cxLargura, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(lbInclinacao, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cxInclinacao, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                        .addComponent(lbTipoSolo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addComponent(cxTipoSolo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btFuncionarios)
                .addGap(18, 18, 18)
                .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btSairMenuConsultaCliente)
                .addContainerGap())
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbCodigoId, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addComponent(lbDetalhesProjeto1))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(lbCliente)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cxNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lbCPF)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cxCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(260, 260, 260)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lbEndereco)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRua)
                    .addComponent(cxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxRua))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNum)
                    .addComponent(lbNome2)
                    .addComponent(cxNomeProj)
                    .addComponent(cxNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBairro)
                    .addComponent(cxBairro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCep)
                            .addComponent(cxCep))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCidade)
                            .addComponent(lbComprimento)
                            .addComponent(cxComprimento)
                            .addComponent(cxCidade))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbLargura)
                            .addComponent(cxLargura))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbInclinacao)
                            .addComponent(cxInclinacao)))
                    .addComponent(lbDetalhesProjeto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTipoSolo)
                    .addComponent(cxTipoSolo))
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbArea)
                    .addComponent(cxArea))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSairMenuConsultaCliente)
                    .addComponent(btEditar)
                    .addComponent(btFuncionarios))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbCliente)
                        .addComponent(lbCPF)
                        .addComponent(cxNomeCliente)
                        .addComponent(cxCpfCliente))
                    .addGap(18, 18, 18)
                    .addComponent(lbDetalhesProjeto1)
                    .addGap(18, 18, 18)
                    .addComponent(lbCodigoId)
                    .addContainerGap(293, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        Cliente cliente = capturaCliente();
        MenuAtualizarProjeto.getMenuAtualizarProjeto().insereDadosProj(cliente, cliente.getProjetos().get(0));
        MenuAtualizarProjeto.getMenuAtualizarProjeto().setVisible(true);
    }//GEN-LAST:event_btEditarActionPerformed

    private void btSairMenuConsultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairMenuConsultaClienteActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Confirma????o de sa??da", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            sair();
        }
    }//GEN-LAST:event_btSairMenuConsultaClienteActionPerformed

    public void sair(){
        this.dispose();
    }
    
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        MenuListaProjetos.getMenuListaProjetos().setVisible(false);
    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        MenuListaProjetos.getMenuListaProjetos().setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void btFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFuncionariosActionPerformed
        MenuCadFuncionarioProj.getMenuCadFuncionarioProj().insereDadosProj(cliente, projeto);
        MenuCadFuncionarioProj.getMenuCadFuncionarioProj().setVisible(true);
    }//GEN-LAST:event_btFuncionariosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuConsultaProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuConsultaProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuConsultaProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuConsultaProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuConsultaProjeto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btFuncionarios;
    private javax.swing.JButton btSairMenuConsultaCliente;
    private javax.swing.JLabel cxArea;
    private javax.swing.JLabel cxBairro;
    private javax.swing.JLabel cxCep;
    private javax.swing.JLabel cxCidade;
    private javax.swing.JLabel cxCodigo;
    private javax.swing.JLabel cxComprimento;
    private javax.swing.JLabel cxCpfCliente;
    private javax.swing.JLabel cxInclinacao;
    private javax.swing.JLabel cxLargura;
    private javax.swing.JLabel cxNomeCliente;
    private javax.swing.JLabel cxNomeProj;
    private javax.swing.JLabel cxNum;
    private javax.swing.JLabel cxRua;
    private javax.swing.JLabel cxTipoSolo;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lbArea;
    private javax.swing.JLabel lbBairro;
    private javax.swing.JLabel lbCPF;
    private javax.swing.JLabel lbCep;
    private javax.swing.JLabel lbCidade;
    private javax.swing.JLabel lbCliente;
    private javax.swing.JLabel lbCodigoId;
    private javax.swing.JLabel lbComprimento;
    private javax.swing.JLabel lbConsulta;
    private javax.swing.JLabel lbDetalhesProjeto;
    private javax.swing.JLabel lbDetalhesProjeto1;
    private javax.swing.JLabel lbEndereco;
    private javax.swing.JLabel lbInclinacao;
    private javax.swing.JLabel lbLargura;
    private javax.swing.JLabel lbNome2;
    private javax.swing.JLabel lbNum;
    private javax.swing.JLabel lbRua;
    private javax.swing.JLabel lbTipoSolo;
    // End of variables declaration//GEN-END:variables
}
