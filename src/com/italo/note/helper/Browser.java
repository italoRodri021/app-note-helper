package com.italo.note.helper;

import javafx.application.Platform;
import javafx.beans.value.ObservableValue;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Browser extends JFrame {

    private final JFXPanel jfxPanel = new JFXPanel();
    private final JPanel painel = new JPanel(new BorderLayout());
    private final JButton btnPesquisar = new JButton("Recarregar");
    private final JButton btnPaginaInicial = new JButton("Pesquisar");
    private final JTextField caixaTextoURL = new JTextField();
    private WebEngine engine;

    // -> Construtor
    public Browser() {
        super();

        initComponents();
        mudarIcone();
    }

    // -> Configurando Icone
    private void mudarIcone() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagens/icone_logo_roxo.png")));

    }

    // -> Iniciando componentes
    private void initComponents() {

        // -> Criando cena
        createScene();

        // -> Ouvinte para o btn Pesquisar
        ActionListener acaoPesquisar = (ActionEvent e) -> {
            carregarURL(caixaTextoURL.getText());
        };

        // -> Ouvinte para o btn Recarregar
        ActionListener acaoPaginaInicial = (ActionEvent e) -> {
            carregarURL("www.google.com.br");
        };

        // -> Referencias
        btnPesquisar.addActionListener(acaoPesquisar);
        btnPaginaInicial.addActionListener(acaoPaginaInicial);
        caixaTextoURL.addActionListener(acaoPesquisar);
        caixaTextoURL.setSelectionColor(Color.cyan);

        // -> Cor do navegador
        Color corOriginal = new Color(65, 0, 255);

        // -> Configurando Fote e cores dos componentes
        btnPesquisar.setBackground(Color.white);
        btnPesquisar.setForeground(corOriginal);
        btnPesquisar.setFont(new java.awt.Font("Bahnschrift", 1, 15));

        btnPaginaInicial.setBackground(Color.white);
        btnPaginaInicial.setForeground(corOriginal);
        btnPaginaInicial.setFont(new java.awt.Font("Bahnschrift", 1, 15));

        // -> Configurando caixa de texto de URL
        caixaTextoURL.setBackground(corOriginal);
        caixaTextoURL.setForeground(Color.white);
        caixaTextoURL.setFont(new java.awt.Font("Bahnschrift", 1, 15));

        // -> Configurando Paineis
        jfxPanel.setBackground(corOriginal);
        painel.setBackground(corOriginal);

        // -> Configurando barra Superior
        JPanel barraSuperior = new JPanel(new BorderLayout(10, 0));
        barraSuperior.setBorder(BorderFactory.createEmptyBorder(3, 5, 3, 5));

        // -> Add componentes a barra Superior
        barraSuperior.add(caixaTextoURL, BorderLayout.CENTER);
        barraSuperior.add(btnPesquisar, BorderLayout.WEST);
        barraSuperior.add(btnPaginaInicial, BorderLayout.EAST);

        // -> Cor da barra Superior
        barraSuperior.setBackground(corOriginal);

        // -> Adicionando e configurando layout
        painel.add(barraSuperior, BorderLayout.NORTH);
        painel.add(jfxPanel, BorderLayout.CENTER);

        // -> Add
        getContentPane().add(painel);

        // -> Configurando dimensão do Frame
        setPreferredSize(new Dimension(1248, 682));

        // -> setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }

    // -> Criando scene
    private void createScene() {

        Platform.runLater(() -> {
            // -> WebView
            WebView view = new WebView();
            engine = view.getEngine();
            // -> Habilitando javaScript
            engine.setJavaScriptEnabled(true);

            engine.titleProperty().addListener((ObservableValue<? extends String> observable,
                    String oldValue, final String newValue) -> {
                SwingUtilities.invokeLater(() -> {
                    Browser.this.setTitle(newValue);
                });
            });

            engine.locationProperty().addListener((ObservableValue<? extends String> ov, String oldValue, final String newValue) -> {
                SwingUtilities.invokeLater(() -> {
                    caixaTextoURL.setText(newValue);
                });
            });

            jfxPanel.setScene(new Scene(view));
        });
    }

    // -> Configurando Carregamento da URL
    public void carregarURL(final String url) {
        Platform.runLater(() -> {
            String tmp = toURL(url);

            if (tmp == null) {
                tmp = toURL("https://" + url);
            }

            engine.load(tmp);
        });
    }

    // -> Tratando excessão da URL
    private static String toURL(String str) {
        try {
            return new URL(str).toExternalForm();
        } catch (MalformedURLException exception) {
            return null;
        }
    }

    // -> Metodo main
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Browser navegador = new Browser();
            navegador.setVisible(true);
            navegador.carregarURL("https://www.google.com.br");
        } // -> Configurando página inicial da URL
        );
    }

}
