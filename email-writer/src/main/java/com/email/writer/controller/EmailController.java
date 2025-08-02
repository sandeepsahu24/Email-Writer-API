package com.email.writer.controller;

import com.email.writer.service.EmailGeneratorService;
import com.email.writer.model.EmailRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/mail")
@CrossOrigin(origins = "*")
@AllArgsConstructor
public class EmailController {

    private final EmailGeneratorService emailGeneratorService;

    @PostMapping("/generate")
    public ResponseEntity<String> generateEmail(@RequestBody EmailRequest emailRequest) {
        String response = emailGeneratorService.generateEmailReply(emailRequest);
        System.out.println(emailRequest);
        System.out.println(" --> " + response);
        return ResponseEntity.ok(response);
    }
}
