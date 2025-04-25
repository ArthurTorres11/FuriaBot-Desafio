package com.furia.furiabot.service;

import org.springframework.stereotype.Service;

@Service
public class BotService {

    public String responderOpcao(String opcao) {
        switch (opcao.toLowerCase()) {
            case "conheca":
                return gerarConhecaMais();

            case "equipes":
                return gerarOpcoesEquipes();

            case "loja":
                return gerarLoja();

            case "quiz":
                return gerarQuizIntro();

            default:
                return "<p>❌ Opção inválida. Tente novamente ou volte ao menu.</p>"
                        + "<button class='option-button' onclick=\"handleOption('menu')\">⬅ Voltar ao Menu</button>";
        }
    }

    // 🎥 Conheça mais sobre a FURIA
    private String gerarConhecaMais() {
        return "<p><strong>FURIA Esports</strong> é uma organização brasileira de eSports, fundada em 2017.</p>"
                + "<p>Atualmente, compete nas maiores ligas do mundo em CS, Valorant, League of Legends, Rainbow Six e Kings League.</p>"
                + "<p>Veja o vídeo oficial da FURIA no YouTube:</p>"
                + "<a href='https://www.youtube.com/watch?v=dQw4w9WgXcQ' target='_blank'>🎥 Assista aqui</a>";
    }

    // 🐾 Equipes
    private String gerarOpcoesEquipes() {
        return "<p><strong>Escolha uma equipe para saber mais:</strong></p>"
                + "<div class='option-group'>"

                + "<button class='option-button' onclick=\"handleOption('cs')\">"
                + "<img src='/images/modalidades/cs.png' class='option-icon' alt='cs'> CS:GO</button>"

                + "<button class='option-button' onclick=\"handleOption('valorant')\">"
                + "<img src='/images/modalidades/valorant-logo.png' class='option-icon' alt='valorant'> Valorant</button>"

                + "<button class='option-button' onclick=\"handleOption('lol')\">"
                + "<img src='/images/modalidades/lol-logo.png' class='option-icon' alt='lol'> LoL</button>"

                + "<button class='option-button' onclick=\"handleOption('r6')\">"
                + "<img src='/images/modalidades/r6.png' class='option-icon' alt='r6'> Rainbow Six</button>"

                + "<button class='option-button' onclick=\"handleOption('kings')\">"
                + "<img src='/images/modalidades/king-league-logo.png' class='option-icon' alt='kings'> Kings League</button>"

                + "<button class='option-button' onclick=\"handleOption('menu')\">⬅ Voltar ao Menu</button>"

                + "</div>";
    }

        // 🛍 Loja
    private String gerarLoja() {
        return "<p>🛍 Confira nossa loja oficial e vista a camisa da FURIA com orgulho!</p>"
                + "<a href='https://loja.furia.gg' target='_blank'>🛒 Acessar Loja Oficial</a>";
    }

    // 🎯 Quiz
    private String gerarQuizIntro() {
        return "<p>🎯 Vamos descobrir que tipo de torcedor da FURIA você é?</p>"
                + "<button class='option-button' onclick=\"handleOption('quiz_pergunta1')\">🧠 Começar o Quiz</button> "
                + "<button class='option-button' onclick=\"handleOption('menu')\">⬅ Voltar ao Menu</button>";
    }
}
