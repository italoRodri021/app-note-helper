package com.italo.note.helper;

import helper.Data;
import config.Config;
import java.awt.Color;
import java.awt.Toolkit;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * Dev: Italo Rodri Versão: 2.2.5 Ano: 2020
 *
 */
public final class main extends javax.swing.JFrame {

    private static void jPanel1(String string) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public main() {
        initComponents();

        // -> Configurando icone
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagens/icone_logo_roxo.png")));

        // -> Configurações iniciais
        btnSaveNote.setVisible(false);
        labelNome.setVisible(false);
        editNameNote.setVisible(false);
        labelLocal.setVisible(false);
        editLocaleFile.setVisible(false);
        btnSaveHistory.setVisible(false);
        labelAlertDialog.setVisible(false);

        // -> Colocando Configurações para invisivel
        settingsBar.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoRadions = new javax.swing.ButtonGroup();
        telaInicial = new javax.swing.JPanel();
        painelMenuTelaInicial = new javax.swing.JPanel();
        jSeparator6 = new javax.swing.JSeparator();
        labelContatos = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableContacts = new javax.swing.JTable();
        jSeparator7 = new javax.swing.JSeparator();
        labelHistorico = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        editTextHistoryNote = new javax.swing.JTextPane();
        btnFile = new javax.swing.JButton();
        btnUploadHistory = new javax.swing.JButton();
        btnNewNote = new javax.swing.JButton();
        btnSettings = new javax.swing.JButton();
        painelDoBloco = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        editTextNewNote = new javax.swing.JTextPane();
        checkBox01 = new javax.swing.JCheckBox();
        checkBox03 = new javax.swing.JCheckBox();
        checkBox04 = new javax.swing.JCheckBox();
        checkBox05 = new javax.swing.JCheckBox();
        checkBox02 = new javax.swing.JCheckBox();
        btnSearch = new javax.swing.JButton();
        btnHangouts = new javax.swing.JButton();
        btnMeet = new javax.swing.JButton();
        btnWhatsapp = new javax.swing.JButton();
        labelSelecioneiAnotacoesParaVoce = new javax.swing.JLabel();
        editNameNote = new javax.swing.JTextField();
        editLocaleFile = new javax.swing.JTextField();
        btnSaveNote = new javax.swing.JButton();
        labelNome = new javax.swing.JLabel();
        labelLocal = new javax.swing.JLabel();
        labelOperador = new javax.swing.JLabel();
        btnSaveHistory = new javax.swing.JButton();
        labelAlertDialog = new javax.swing.JLabel();
        settingsBar = new javax.swing.JPanel();
        btnModeDark = new javax.swing.JToggleButton();
        btnModeTheme = new javax.swing.JToggleButton();
        btnSizeFont = new javax.swing.JToggleButton();
        spinnerFont = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(0, 680));

        telaInicial.setBackground(new java.awt.Color(255, 255, 255));
        telaInicial.setForeground(new java.awt.Color(40, 0, 204));
        telaInicial.setMaximumSize(new java.awt.Dimension(1248, 682));
        telaInicial.setMinimumSize(new java.awt.Dimension(0, 680));

        painelMenuTelaInicial.setBackground(new java.awt.Color(65, 0, 255));

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));

        labelContatos.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        labelContatos.setForeground(new java.awt.Color(255, 255, 255));
        labelContatos.setText("Contatos");
        labelContatos.setToolTipText("");
        labelContatos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jScrollPane2.setBorder(null);

        tableContacts.setBackground(new java.awt.Color(255, 255, 255));
        tableContacts.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        tableContacts.setForeground(new java.awt.Color(65, 0, 255));
        tableContacts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Nome exemplo 1", "(83)912345-6789"},
                {"Nome exemplo 2", "(83)912345-6789"},
                {"Nome exemplo 3", "(83)912345-6789"},
                {"Nome exemplo 4", "(83)912345-6789"},
                {"Nome exemplo 5", "(83)912345-6789"},
                {"Nome exemplo 6", "(83)912345-6789"},
                {"Nome exemplo 7", "(83)912345-6789"}
            },
            new String [] {
                "Nome", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableContacts.setGridColor(new java.awt.Color(0, 51, 153));
        tableContacts.setSelectionBackground(new java.awt.Color(0, 255, 255));
        tableContacts.setSelectionForeground(new java.awt.Color(65, 0, 255));
        jScrollPane2.setViewportView(tableContacts);

        jSeparator7.setBackground(new java.awt.Color(255, 255, 255));

        labelHistorico.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        labelHistorico.setForeground(new java.awt.Color(255, 255, 255));
        labelHistorico.setText("Histórico de anotações");

        jScrollPane5.setBackground(new java.awt.Color(0, 0, 102));
        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setAutoscrolls(true);
        jScrollPane5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        editTextHistoryNote.setBackground(new java.awt.Color(255, 255, 255));
        editTextHistoryNote.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255)));
        editTextHistoryNote.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        editTextHistoryNote.setForeground(new java.awt.Color(65, 0, 255));
        editTextHistoryNote.setCaretColor(new java.awt.Color(65, 0, 255));
        editTextHistoryNote.setMaximumSize(new java.awt.Dimension(303, 288));
        editTextHistoryNote.setMinimumSize(new java.awt.Dimension(303, 288));
        editTextHistoryNote.setSelectedTextColor(new java.awt.Color(65, 0, 255));
        editTextHistoryNote.setSelectionColor(new java.awt.Color(0, 255, 255));
        jScrollPane5.setViewportView(editTextHistoryNote);

        btnFile.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        btnFile.setForeground(new java.awt.Color(255, 255, 255));
        btnFile.setText("Arquivo");
        btnFile.setBorderPainted(false);
        btnFile.setContentAreaFilled(false);
        btnFile.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFile(evt);
            }
        });

        btnUploadHistory.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        btnUploadHistory.setForeground(new java.awt.Color(255, 255, 255));
        btnUploadHistory.setText("Carregar anotação");
        btnUploadHistory.setBorderPainted(false);
        btnUploadHistory.setContentAreaFilled(false);
        btnUploadHistory.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUploadHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadHistory(evt);
            }
        });

        btnNewNote.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        btnNewNote.setForeground(new java.awt.Color(255, 255, 255));
        btnNewNote.setText("Nova anotação");
        btnNewNote.setBorderPainted(false);
        btnNewNote.setContentAreaFilled(false);
        btnNewNote.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNewNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewNote(evt);
            }
        });

        btnSettings.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        btnSettings.setForeground(new java.awt.Color(255, 255, 255));
        btnSettings.setText("Configurações");
        btnSettings.setBorderPainted(false);
        btnSettings.setContentAreaFilled(false);
        btnSettings.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettings(evt);
            }
        });

        javax.swing.GroupLayout painelMenuTelaInicialLayout = new javax.swing.GroupLayout(painelMenuTelaInicial);
        painelMenuTelaInicial.setLayout(painelMenuTelaInicialLayout);
        painelMenuTelaInicialLayout.setHorizontalGroup(
            painelMenuTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMenuTelaInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelMenuTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelMenuTelaInicialLayout.createSequentialGroup()
                        .addGroup(painelMenuTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUploadHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(painelMenuTelaInicialLayout.createSequentialGroup()
                        .addGroup(painelMenuTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelContatos, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFile, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNewNote, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        painelMenuTelaInicialLayout.setVerticalGroup(
            painelMenuTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMenuTelaInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnFile, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNewNote, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(btnUploadHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(labelContatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelHistorico)
                .addGap(2, 2, 2)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelDoBloco.setBackground(new java.awt.Color(65, 0, 255));

        jScrollPane6.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255)));
        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane6.setAutoscrolls(true);
        jScrollPane6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        editTextNewNote.setBackground(new java.awt.Color(255, 255, 255));
        editTextNewNote.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255)));
        editTextNewNote.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        editTextNewNote.setForeground(new java.awt.Color(65, 0, 255));
        editTextNewNote.setCaretColor(new java.awt.Color(65, 0, 255));
        editTextNewNote.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        editTextNewNote.setSelectedTextColor(new java.awt.Color(65, 0, 255));
        editTextNewNote.setSelectionColor(new java.awt.Color(0, 255, 255));
        jScrollPane6.setViewportView(editTextNewNote);

        javax.swing.GroupLayout painelDoBlocoLayout = new javax.swing.GroupLayout(painelDoBloco);
        painelDoBloco.setLayout(painelDoBlocoLayout);
        painelDoBlocoLayout.setHorizontalGroup(
            painelDoBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDoBlocoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 849, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelDoBlocoLayout.setVerticalGroup(
            painelDoBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDoBlocoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                .addContainerGap())
        );

        checkBox01.setBackground(new java.awt.Color(255, 255, 255));
        grupoRadions.add(checkBox01);
        checkBox01.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        checkBox01.setForeground(new java.awt.Color(50, 0, 255));
        checkBox01.setText("Lista de compras");

        checkBox03.setBackground(new java.awt.Color(255, 255, 255));
        grupoRadions.add(checkBox03);
        checkBox03.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        checkBox03.setForeground(new java.awt.Color(50, 0, 255));
        checkBox03.setText("Lista de convidados");

        checkBox04.setBackground(new java.awt.Color(255, 255, 255));
        grupoRadions.add(checkBox04);
        checkBox04.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        checkBox04.setForeground(new java.awt.Color(50, 0, 255));
        checkBox04.setText("Lista de casamento");

        checkBox05.setBackground(new java.awt.Color(255, 255, 255));
        grupoRadions.add(checkBox05);
        checkBox05.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        checkBox05.setForeground(new java.awt.Color(50, 0, 255));
        checkBox05.setText("Lista de compras para a festa");

        checkBox02.setBackground(new java.awt.Color(255, 255, 255));
        grupoRadions.add(checkBox02);
        checkBox02.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        checkBox02.setForeground(new java.awt.Color(50, 0, 255));
        checkBox02.setText("Lista de tarefas");

        btnSearch.setBackground(new java.awt.Color(65, 0, 255));
        btnSearch.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ic_navegador.png"))); // NOI18N
        btnSearch.setText("Pesquisar");
        btnSearch.setBorder(null);
        btnSearch.setBorderPainted(false);
        btnSearch.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch(evt);
            }
        });

        btnHangouts.setBackground(new java.awt.Color(65, 0, 255));
        btnHangouts.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        btnHangouts.setForeground(new java.awt.Color(255, 255, 255));
        btnHangouts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ic_hangouts.png"))); // NOI18N
        btnHangouts.setText("Google Hangouts");
        btnHangouts.setBorder(null);
        btnHangouts.setBorderPainted(false);
        btnHangouts.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnHangouts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHangouts(evt);
            }
        });

        btnMeet.setBackground(new java.awt.Color(65, 0, 255));
        btnMeet.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        btnMeet.setForeground(new java.awt.Color(255, 255, 255));
        btnMeet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ic_chat_video.png"))); // NOI18N
        btnMeet.setText("Google Meet");
        btnMeet.setBorder(null);
        btnMeet.setBorderPainted(false);
        btnMeet.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMeet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMeet(evt);
            }
        });

        btnWhatsapp.setBackground(new java.awt.Color(65, 0, 255));
        btnWhatsapp.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        btnWhatsapp.setForeground(new java.awt.Color(255, 255, 255));
        btnWhatsapp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ic_whatsapp.png"))); // NOI18N
        btnWhatsapp.setText("Whatsapp");
        btnWhatsapp.setBorder(null);
        btnWhatsapp.setBorderPainted(false);
        btnWhatsapp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnWhatsapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWhatsapp(evt);
            }
        });

        labelSelecioneiAnotacoesParaVoce.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        labelSelecioneiAnotacoesParaVoce.setForeground(new java.awt.Color(65, 0, 255));
        labelSelecioneiAnotacoesParaVoce.setText("Selecionei algumas anotações para você utilizar.");

        editNameNote.setBackground(new java.awt.Color(255, 255, 255));
        editNameNote.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        editNameNote.setForeground(new java.awt.Color(65, 0, 255));
        editNameNote.setText("MinhaAnotacao");
        editNameNote.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        editNameNote.setPreferredSize(new java.awt.Dimension(90, 30));
        editNameNote.setSelectedTextColor(new java.awt.Color(65, 0, 255));
        editNameNote.setSelectionColor(new java.awt.Color(0, 255, 255));

        editLocaleFile.setBackground(new java.awt.Color(255, 255, 255));
        editLocaleFile.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        editLocaleFile.setForeground(new java.awt.Color(65, 0, 255));
        editLocaleFile.setText("C:\\Users\\italo\\Documents");
        editLocaleFile.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        editLocaleFile.setPreferredSize(new java.awt.Dimension(90, 30));
        editLocaleFile.setSelectedTextColor(new java.awt.Color(65, 0, 255));
        editLocaleFile.setSelectionColor(new java.awt.Color(0, 255, 255));

        btnSaveNote.setBackground(new java.awt.Color(65, 0, 255));
        btnSaveNote.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        btnSaveNote.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveNote.setText("Salvar");
        btnSaveNote.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSaveNote.setBorderPainted(false);
        btnSaveNote.setMinimumSize(new java.awt.Dimension(164, 32));
        btnSaveNote.setPreferredSize(new java.awt.Dimension(90, 30));
        btnSaveNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveNote(evt);
            }
        });

        labelNome.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        labelNome.setForeground(new java.awt.Color(65, 0, 255));
        labelNome.setText("Nome:");
        labelNome.setPreferredSize(new java.awt.Dimension(90, 30));

        labelLocal.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        labelLocal.setForeground(new java.awt.Color(65, 0, 255));
        labelLocal.setText("Pasta local:");
        labelLocal.setPreferredSize(new java.awt.Dimension(90, 30));

        labelOperador.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelOperador.setForeground(new java.awt.Color(65, 0, 255));
        labelOperador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelOperador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnSaveHistory.setBackground(new java.awt.Color(65, 0, 255));
        btnSaveHistory.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        btnSaveHistory.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveHistory.setText("Salvar histórico");
        btnSaveHistory.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSaveHistory.setBorderPainted(false);
        btnSaveHistory.setPreferredSize(new java.awt.Dimension(90, 30));
        btnSaveHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveHistory(evt);
            }
        });

        labelAlertDialog.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        labelAlertDialog.setForeground(new java.awt.Color(65, 0, 255));
        labelAlertDialog.setText("Salvo");

        settingsBar.setBackground(new java.awt.Color(255, 255, 255));

        btnModeDark.setBackground(new java.awt.Color(65, 0, 255));
        btnModeDark.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        btnModeDark.setForeground(new java.awt.Color(255, 255, 255));
        btnModeDark.setText("Modo normal");
        btnModeDark.setBorderPainted(false);
        btnModeDark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModeDarkActionPerformed(evt);
            }
        });

        btnModeTheme.setBackground(new java.awt.Color(65, 0, 255));
        btnModeTheme.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        btnModeTheme.setForeground(new java.awt.Color(255, 255, 255));
        btnModeTheme.setText("Tema");
        btnModeTheme.setBorderPainted(false);
        btnModeTheme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModeThemeActionPerformed(evt);
            }
        });

        btnSizeFont.setBackground(new java.awt.Color(65, 0, 255));
        btnSizeFont.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        btnSizeFont.setForeground(new java.awt.Color(255, 255, 255));
        btnSizeFont.setText("Alterar tamanho da fonte");
        btnSizeFont.setBorderPainted(false);
        btnSizeFont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSizeFontActionPerformed(evt);
            }
        });

        spinnerFont.setModel(new javax.swing.SpinnerNumberModel(15, 3, 48, 1));

        javax.swing.GroupLayout settingsBarLayout = new javax.swing.GroupLayout(settingsBar);
        settingsBar.setLayout(settingsBarLayout);
        settingsBarLayout.setHorizontalGroup(
            settingsBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnModeDark)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnModeTheme)
                .addGap(33, 33, 33)
                .addComponent(btnSizeFont)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spinnerFont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        settingsBarLayout.setVerticalGroup(
            settingsBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(settingsBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModeDark)
                    .addComponent(btnModeTheme)
                    .addComponent(btnSizeFont)
                    .addComponent(spinnerFont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout telaInicialLayout = new javax.swing.GroupLayout(telaInicial);
        telaInicial.setLayout(telaInicialLayout);
        telaInicialLayout.setHorizontalGroup(
            telaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaInicialLayout.createSequentialGroup()
                .addComponent(painelMenuTelaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(telaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelDoBloco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(telaInicialLayout.createSequentialGroup()
                        .addGroup(telaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(telaInicialLayout.createSequentialGroup()
                                .addComponent(btnSaveNote, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editNameNote, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editLocaleFile, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSaveHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(telaInicialLayout.createSequentialGroup()
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnHangouts, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMeet, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnWhatsapp, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(6, 6, 6))
                    .addGroup(telaInicialLayout.createSequentialGroup()
                        .addGroup(telaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(telaInicialLayout.createSequentialGroup()
                                .addComponent(checkBox01)
                                .addGap(18, 18, 18)
                                .addComponent(checkBox02)
                                .addGap(18, 18, 18)
                                .addComponent(checkBox03))
                            .addComponent(labelSelecioneiAnotacoesParaVoce, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(telaInicialLayout.createSequentialGroup()
                                .addComponent(checkBox04)
                                .addGap(18, 18, 18)
                                .addComponent(checkBox05)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(telaInicialLayout.createSequentialGroup()
                        .addComponent(labelAlertDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(telaInicialLayout.createSequentialGroup()
                        .addComponent(settingsBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        telaInicialLayout.setVerticalGroup(
            telaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaInicialLayout.createSequentialGroup()
                .addGroup(telaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(btnHangouts)
                    .addComponent(btnMeet)
                    .addComponent(btnWhatsapp))
                .addGap(17, 17, 17)
                .addComponent(labelAlertDialog)
                .addGroup(telaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaInicialLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(telaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editNameNote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editLocaleFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaInicialLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(telaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSaveHistory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSaveNote, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelDoBloco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSelecioneiAnotacoesParaVoce)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(telaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaInicialLayout.createSequentialGroup()
                        .addGroup(telaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkBox01)
                            .addComponent(checkBox02)
                            .addComponent(checkBox03))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(telaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkBox04)
                            .addComponent(checkBox05)))
                    .addComponent(labelOperador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(settingsBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(painelMenuTelaInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(telaInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(telaInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // -> Metodo para abrir o Navegador Web
    private void btnSearch(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch

        // -> Chamando metodo main do navegador
        String[] args = null;
        Browser.main(args);

    }//GEN-LAST:event_btnSearch

    // -> Btn Google Hangouts 
    private void btnHangouts(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHangouts

        // -> Código para abrir o link do Hangouts
        Config.initBrowserLink("https://hangouts.google.com");
    }//GEN-LAST:event_btnHangouts

    // -> Btn Carregar Anotacao 
    private void btnUploadHistory(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadHistory

        settingsBar.setVisible(false);

        // -> Verificando qual dos checkBox estão selecionados
        if (checkBox01.isSelected()) {
            editTextNewNote.setText(Data.TEXT01);
        } else if (checkBox02.isSelected()) {
            editTextNewNote.setText(Data.TEXT02);
        } else if (checkBox03.isSelected()) {
            editTextNewNote.setText(Data.TEXT03);
        } else if (checkBox04.isSelected()) {
            editTextNewNote.setText(Data.TEXT04);
        } else if (checkBox05.isSelected()) {
            editTextNewNote.setText(Data.TEXT05);
        }

    }//GEN-LAST:event_btnUploadHistory

    // -> Btn Google Meet
    private void btnMeet(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMeet

        Config.initBrowserLink("https://apps.google.com/meet/");
    }//GEN-LAST:event_btnMeet

    // -> Btn Whatsapp Web 
    private void btnWhatsapp(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWhatsapp

        Config.initBrowserLink("https://web.whatsapp.com");
    }//GEN-LAST:event_btnWhatsapp

    // -> Metodo Salvar anotação 
    public void recoverAndSave() throws IOException, ParseException {

        // -> Recuperando textos
        String textNote = editTextNewNote.getText();
        String textNameFile = editNameNote.getText();
        String textLocaleSave = editLocaleFile.getText();
        String dateHour = Config.getDateHour();
        String dateHourName = Config.getDateHourName();

        // -> Verificando se os campos estão preenchidos
        if (!textNameFile.isEmpty()) {
            if (!textLocaleSave.isEmpty()) {

                try (
                        // -> Local a ser salvo
                        FileWriter arq = new FileWriter(textLocaleSave + "\\" + textNameFile + dateHourName + ".txt")) {
                    PrintWriter printArq = new PrintWriter(arq);
                    printArq.printf("ANOTAÇÃO SALVA NO DIA: " + dateHour + "\n\n" + textNote);
                }
                labelAlertDialog.setVisible(true);
                labelAlertDialog.setText("Sua anotação foi salva com sucesso!");
            } else {
                editLocaleFile.setText("C:\\Users\\italo\\Documents");
                labelAlertDialog.setVisible(true);
                labelAlertDialog.setText("Ops! Defina o local a ser salvo!");
            }
        } else {
            labelAlertDialog.setVisible(true);
            labelAlertDialog.setText("Ops! Defina o nome da anotação antes de salvar!");
        }

    }

    // -> Btn Salvar Anotação 
    private void btnSaveNote(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveNote

        try {
            recoverAndSave();
        } catch (IOException | ParseException e) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btnSaveNote

    // -> Btn Nova Anotação 
    private void btnNewNote(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewNote

        // -> Recuperando textos
        String textHistory = editTextHistoryNote.getText();
        String textNote = editTextNewNote.getText();
        String dateHour = Config.getDateHour();

        // -> Recuperando anotação e adicionando ao histórico  
        if (!textNote.isEmpty()) {
            editTextHistoryNote.setText(" ___________________________________________ \n\n"
            + "ANOTAÇÃO FEITA NO DIA: " + dateHour + "\n\n" + textNote + "\n\n" + textHistory);
        }

        // -> Configurações
        editTextNewNote.setText("");
        btnSaveNote.setVisible(false);
        labelNome.setVisible(false);
        editNameNote.setVisible(false);
        labelLocal.setVisible(false);
        editLocaleFile.setVisible(false);
        btnSaveHistory.setVisible(false);
        labelAlertDialog.setVisible(false);

        // -> Colocando Configurações para invisivel 
        settingsBar.setVisible(false);
    }//GEN-LAST:event_btnNewNote

    // -> Btn Arquivo 
    private void btnFile(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFile

        btnSaveNote.setVisible(true);
        labelNome.setVisible(true);
        editNameNote.setVisible(true);
        labelLocal.setVisible(true);
        editLocaleFile.setVisible(true);
        btnSaveHistory.setVisible(true);

        // Colocando Configurações para invisivel
        settingsBar.setVisible(false);
    }//GEN-LAST:event_btnFile

    // -> Btn Salvar Histórico 
    private void btnSaveHistory(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveHistory

        try {
            recoverHistory();
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSaveHistory

    // -> Btn Configuração 
    private void btnSettings(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettings

        // -> Colocando Configurações para invisivel
        settingsBar.setVisible(true);
    }//GEN-LAST:event_btnSettings

    // -> Btn Modo Dark 
    private void btnModeDarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModeDarkActionPerformed

        Color corOriginal = new Color(65, 0, 255);
        Color corDark = new Color(35, 45, 54);
        Color corSecundariaDark = new Color(16, 29, 37);
        Color corBtnDark = new Color(0, 17, 156);

        if (btnModeDark.isSelected()) {

            btnModeDark.setText("Modo Dark");

            painelMenuTelaInicial.setBackground(corDark);
            painelDoBloco.setBackground(corDark);
            btnSearch.setBackground(corBtnDark);
            btnHangouts.setBackground(corBtnDark);
            btnMeet.setBackground(corBtnDark);
            btnWhatsapp.setBackground(corBtnDark);
            btnModeDark.setBackground(corBtnDark);
            telaInicial.setBackground(corSecundariaDark);
            btnModeTheme.setBackground(corBtnDark);
            labelSelecioneiAnotacoesParaVoce.setForeground(Color.white);
            checkBox01.setForeground(Color.white);
            checkBox04.setForeground(Color.white);
            checkBox02.setForeground(Color.white);
            checkBox05.setForeground(Color.white);
            checkBox03.setForeground(Color.white);
            tableContacts.setForeground(Color.black);
            editTextNewNote.setForeground(corSecundariaDark);
            editTextHistoryNote.setForeground(corSecundariaDark);
            labelOperador.setForeground(Color.white);
            labelAlertDialog.setForeground(Color.white);
            labelNome.setForeground(Color.white);
            editNameNote.setForeground(corSecundariaDark);
            labelLocal.setForeground(Color.white);
            editLocaleFile.setForeground(corSecundariaDark);
            btnSaveNote.setBackground(corBtnDark);
            btnSaveHistory.setBackground(corBtnDark);
            tableContacts.setForeground(corSecundariaDark);
            settingsBar.setBackground(corSecundariaDark);
            btnSizeFont.setBackground(corBtnDark);

        } else {

            btnModeDark.setText("Modo normal");

            painelMenuTelaInicial.setBackground(corOriginal);
            painelDoBloco.setBackground(corOriginal);
            btnSearch.setBackground(corOriginal);
            btnHangouts.setBackground(corOriginal);
            btnMeet.setBackground(corOriginal);
            btnWhatsapp.setBackground(corOriginal);
            btnModeDark.setBackground(corOriginal);
            telaInicial.setBackground(Color.white);
            btnModeTheme.setBackground(corOriginal);
            labelSelecioneiAnotacoesParaVoce.setForeground(corOriginal);
            checkBox01.setForeground(corOriginal);
            checkBox04.setForeground(corOriginal);
            checkBox02.setForeground(corOriginal);
            checkBox05.setForeground(corOriginal);
            checkBox03.setForeground(corOriginal);
            editTextNewNote.setForeground(corOriginal);
            editTextHistoryNote.setForeground(corOriginal);
            labelOperador.setForeground(corOriginal);
            labelAlertDialog.setForeground(corOriginal);
            labelNome.setForeground(corOriginal);
            editNameNote.setForeground(corOriginal);
            labelLocal.setForeground(corOriginal);
            editLocaleFile.setForeground(corOriginal);
            btnSaveNote.setBackground(corOriginal);
            btnSaveHistory.setBackground(corOriginal);
            settingsBar.setBackground(Color.white);
            btnSizeFont.setBackground(corOriginal);
        }

    }//GEN-LAST:event_btnModeDarkActionPerformed

    // -> Btn Modo Colorido
    private void btnModeThemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModeThemeActionPerformed

        Color corAzul = new Color(3, 155, 247);
        Color corRosa = new Color(255, 97, 201);

        if (btnModeTheme.isSelected()) {

            btnModeTheme.setText("Tema Blue");
            painelMenuTelaInicial.setBackground(corAzul);
            painelDoBloco.setBackground(corAzul);
            btnSearch.setBackground(corAzul);
            btnHangouts.setBackground(corAzul);
            btnMeet.setBackground(corAzul);
            btnWhatsapp.setBackground(corAzul);
            btnModeDark.setBackground(corAzul);
            telaInicial.setBackground(Color.white);
            btnModeTheme.setBackground(corAzul);
            labelSelecioneiAnotacoesParaVoce.setForeground(corAzul);
            checkBox01.setForeground(corAzul);
            checkBox04.setForeground(corAzul);
            checkBox02.setForeground(corAzul);
            checkBox05.setForeground(corAzul);
            checkBox03.setForeground(corAzul);
            tableContacts.setForeground(corAzul);
            editTextNewNote.setForeground(corAzul);
            editTextHistoryNote.setForeground(corAzul);
            labelOperador.setForeground(corAzul);
            labelAlertDialog.setForeground(corAzul);
            labelNome.setForeground(corAzul);
            editNameNote.setForeground(corAzul);
            labelLocal.setForeground(corAzul);
            editLocaleFile.setForeground(corAzul);
            btnSaveNote.setBackground(corAzul);
            btnSaveHistory.setBackground(corAzul);
            settingsBar.setBackground(Color.white);
            btnSizeFont.setBackground(corAzul);

        } else {

            btnModeTheme.setText("Tema Pink");

            painelMenuTelaInicial.setBackground(corRosa);
            painelDoBloco.setBackground(corRosa);
            btnSearch.setBackground(corRosa);
            btnHangouts.setBackground(corRosa);
            btnMeet.setBackground(corRosa);
            btnWhatsapp.setBackground(corRosa);
            btnModeDark.setBackground(corRosa);
            telaInicial.setBackground(Color.white);
            btnModeTheme.setBackground(corRosa);
            labelSelecioneiAnotacoesParaVoce.setForeground(corRosa);
            checkBox01.setForeground(corRosa);
            checkBox04.setForeground(corRosa);
            checkBox02.setForeground(corRosa);
            checkBox05.setForeground(corRosa);
            checkBox03.setForeground(corRosa);
            editTextNewNote.setForeground(corRosa);
            editTextHistoryNote.setForeground(corRosa);
            labelOperador.setForeground(corRosa);
            labelAlertDialog.setForeground(corRosa);
            labelNome.setForeground(corRosa);
            editNameNote.setForeground(corRosa);
            labelLocal.setForeground(corRosa);
            editLocaleFile.setForeground(corRosa);
            btnSaveNote.setBackground(corRosa);
            btnSaveHistory.setBackground(corRosa);
            settingsBar.setBackground(Color.white);
            btnSizeFont.setBackground(corRosa);

        }

    }//GEN-LAST:event_btnModeThemeActionPerformed

    // -> Btn Alterar Fonte 
    private void btnSizeFontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSizeFontActionPerformed

        int valorSpiner = Integer.parseInt(spinnerFont.getValue().toString());

        editTextNewNote.setFont(new java.awt.Font("Bahnschrift", 1, valorSpiner));

    }//GEN-LAST:event_btnSizeFontActionPerformed

    // -> Metodo Recuperar Histórico 
    public void recoverHistory() throws IOException {

        // -> Recuperando textos dos campos
        String textName = "Histórico de " + editNameNote.getText();
        String textHistory = editTextHistoryNote.getText();
        String localeSaveFile = editLocaleFile.getText();
        String dateHour = Config.getDateHour();
        String dateHourName = Config.getDateHourName();

        // -> Verificando se as caixas estão preenchidas
        if (!textName.isEmpty()) {
            if (!localeSaveFile.isEmpty()) {
                if (!textHistory.isEmpty()) {

                    try ( // Local a ser salvo
                            FileWriter arq = new FileWriter(localeSaveFile + "\\" + textName + dateHourName + ".txt")) {
                        PrintWriter printArq = new PrintWriter(arq);
                        printArq.printf("ANOTAÇÃO SALVA NO DIA: " + dateHour + "\n\n" + textHistory);
                    }

                    labelAlertDialog.setVisible(true);
                    labelAlertDialog.setText("Seu histórico de anotações foi salvo com sucesso!");

                } else {
                    labelAlertDialog.setVisible(true);
                    labelAlertDialog.setText("Ops! O seu histórico está vazio!");
                }
            } else {
                labelAlertDialog.setVisible(true);
                editLocaleFile.setText("C:\\Users\\italo\\Documents");
                labelAlertDialog.setText("Ops! Defina o local a ser salvo!");
            }
        } else {
            labelAlertDialog.setVisible(true);
            labelAlertDialog.setText("Ops! Defina o nome do aquivo!");
        }

    }

    // -> Metodo Main 
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> {
            new main().setVisible(true);
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFile;
    private javax.swing.JButton btnHangouts;
    private javax.swing.JButton btnMeet;
    private javax.swing.JToggleButton btnModeDark;
    private javax.swing.JToggleButton btnModeTheme;
    private javax.swing.JButton btnNewNote;
    private javax.swing.JButton btnSaveHistory;
    private javax.swing.JButton btnSaveNote;
    public static javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSettings;
    private javax.swing.JToggleButton btnSizeFont;
    private javax.swing.JButton btnUploadHistory;
    public javax.swing.JButton btnWhatsapp;
    private javax.swing.JCheckBox checkBox01;
    private javax.swing.JCheckBox checkBox02;
    private javax.swing.JCheckBox checkBox03;
    private javax.swing.JCheckBox checkBox04;
    private javax.swing.JCheckBox checkBox05;
    private javax.swing.JTextField editLocaleFile;
    private javax.swing.JTextField editNameNote;
    public static javax.swing.JTextPane editTextHistoryNote;
    public static javax.swing.JTextPane editTextNewNote;
    private javax.swing.ButtonGroup grupoRadions;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel labelAlertDialog;
    private javax.swing.JLabel labelContatos;
    private javax.swing.JLabel labelHistorico;
    private javax.swing.JLabel labelLocal;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelOperador;
    private javax.swing.JLabel labelSelecioneiAnotacoesParaVoce;
    private javax.swing.JPanel painelDoBloco;
    private javax.swing.JPanel painelMenuTelaInicial;
    private javax.swing.JPanel settingsBar;
    private javax.swing.JSpinner spinnerFont;
    private javax.swing.JTable tableContacts;
    public javax.swing.JPanel telaInicial;
    // End of variables declaration//GEN-END:variables

}
