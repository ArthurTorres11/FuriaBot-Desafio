package com.furia.furiabot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/opcao")
public class BotController {

    @GetMapping("/{opcao}")
    public ResponseEntity<String> responderOpcao(@PathVariable String opcao) {
        switch (opcao.toLowerCase()) {
            case "conheca":
                return ResponseEntity.ok(gerarConheca());
            case "equipes":
                return ResponseEntity.ok(gerarOpcoesEquipes());
            case "loja":
                return ResponseEntity.ok(gerarLoja());
            case "quiz":
                return ResponseEntity.ok(gerarQuizIntro());
            case "cs":
                return ResponseEntity.ok(gerarEquipeCS());
            case "valorant":
                return ResponseEntity.ok(gerarEquipeValorant());
            case "lol":
                return ResponseEntity.ok(gerarEquipeLoL());
            case "r6":
                return ResponseEntity.ok(gerarEquipeR6());
            case "kings":
                return ResponseEntity.ok(gerarEquipeKings());
            default:
                return ResponseEntity.ok("❌ Opção não reconhecida.");
        }
    }

    private String gerarConheca() {
        return "<p>🎥 Conheça a história da FURIA clicando abaixo:</p>"
                + "<a href='https://www.youtube.com/watch?v=dQw4w9WgXcQ' target='_blank'>▶️ Assistir Vídeo Oficial</a>";
    }

    private String gerarOpcoesEquipes() {
        return "<p><strong>Escolha uma equipe:</strong></p>"
                + "<button class='option-button' onclick=\"handleOption('cs')\">🔥 CS:GO</button> "
                + "<button class='option-button' onclick=\"handleOption('valorant')\">🚀 Valorant</button> "
                + "<button class='option-button' onclick=\"handleOption('lol')\">🛡 League of Legends</button> "
                + "<button class='option-button' onclick=\"handleOption('r6')\">🎯 Rainbow Six</button> "
                + "<button class='option-button' onclick=\"handleOption('kings')\">👑 Kings League</button> "
                + "<button class='option-button' onclick=\"handleOption('menu')\">⬅ Voltar ao Menu</button>";
    }

    private String gerarLoja() {
        return "<p>🛍 Confira nossa loja oficial:</p>"
                + "<a href='https://loja.furia.gg' target='_blank'>🛒 Acessar Loja Oficial</a>";
    }

    private String gerarQuizIntro() {
        return "<p>🎯 Vamos testar seus conhecimentos sobre a FURIA!</p>"
                + "<button class='option-button' onclick=\"handleOption('quiz_pergunta1')\">🎯 Começar Quiz</button> "
                + "<button class='option-button' onclick=\"handleOption('menu')\">⬅ Voltar ao Menu</button>";
    }

    private String gerarEquipeCS() {
        return "<p>🔥 <strong>FURIA CS:GO</strong></p>"
                + "<p>Um dos melhores times do Brasil e presença constante nos maiores torneios internacionais.</p>"
                + "<p><strong>Elenco:</strong></p>"
                + "<ul>"
                + "<li>FalleN</li>"
                + "<li>KSCERATO</li>"
                + "<li>yuurih</li>"
                + "<li>YEKINDAR</li>"
                + "<li>MOLODOY </li>"
                + "<li>Hep (Coach)</li>"
                + "<li>sidde (Coach)</li>"
                + "</ul>"
                + "<button class='option-button' onclick=\"handleOption('menu')\">⬅ Voltar ao Menu</button>";
    }

    private String gerarEquipeValorant() {
        return "<p>🚀 <strong>FURIA Valorant</strong></p>"
                + "<p>Uma equipe que desafia os limites e representa o Brasil no cenário mundial de Valorant.</p>"
                + "<p><strong>Elenco:</strong></p>"
                + "<ul>"
                + "<li>xand</li>"
                + "<li>qck</li>"
                + "<li>nzr</li>"
                + "<li>mazin</li>"
                + "<li>kon4n (Coach)</li>"
                + "</ul>"
                + "<button class='option-button' onclick=\"handleOption('menu')\">⬅ Voltar ao Menu</button>";
    }

    private String gerarEquipeLoL() {
        return "<p>🛡 <strong>FURIA League of Legends</strong></p>"
                + "<p>Equipe que disputa o CBLOL e representa o orgulho da selva brasileira!</p>"
                + "<p><strong>Elenco:</strong></p>"
                + "<ul>"
                + "<li>Guigo</li>"
                + "<li>Tatu</li>"
                + "<li>Tutsz</li>"
                + "<li>Ayu</li>"
                + "<li>JoJo</li>"
                + "<li>Furyz (Coach) </li>"
                + "<li> Thinkcard (Coach)</li>"
                + "</ul>"
                + "<button class='option-button' onclick=\"handleOption('menu')\">⬅ Voltar ao Menu</button>";
    }

    private String gerarEquipeR6() {
        return "<p>🎯 <strong>FURIA Rainbow Six</strong></p>"
                + "<p>Competindo no cenário nacional e mundial de Rainbow Six com muita garra.</p>"
                + "<p><strong>Elenco:</strong></p>"
                + "<ul>"
                + "<li>Handyy</li>"
                + "<li>Lenize</li>"
                + "<li>R4re</li>"
                + "<li>Miracle</li>"
                + "<li>Twister (Coach)</li>"
                + "</ul>"
                + "<button class='option-button' onclick=\"handleOption('menu')\">⬅ Voltar ao Menu</button>";
    }

    private String gerarEquipeKings() {
        return "<p>👑 <strong>FURIA Kings League</strong></p>"
                + "<p>Representando a ousadia no futebol 7 da Kings League.</p>"
                + "<p><strong>Elenco:</strong></p>"
                + "<ul>"
                + "<li>Jogador 1</li>"
                + "<li>Jogador 2</li>"
                + "<li>Jogador 3</li>"
                + "<li>Técnico: Técnico Kings</li>"
                + "</ul>"
                + "<button class='option-button' onclick=\"handleOption('menu')\">⬅ Voltar ao Menu</button>";
    }
}
