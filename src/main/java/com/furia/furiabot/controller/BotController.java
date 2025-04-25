package com.furia.furiabot.controller;

import com.furia.furiabot.service.BotService;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/opcao")  // Base comum para todas as opções
public class BotController {

    private final BotService botService;

    // Injeção de dependência (Spring cria o BotService automaticamente)
    public BotController(BotService botService) {
        this.botService = botService;
    }

    // Endpoint principal para receber a opção escolhida no chat
    @GetMapping("/{opcao}")
    public ResponseEntity<String> responderOpcao(@PathVariable String opcao) {
        String respostaHtml = botService.responderOpcao(opcao);
        return ResponseEntity.ok(respostaHtml);
    }
}
