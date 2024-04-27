package com.example.customvalidator.controller;

import com.example.customvalidator.controller.dto.MemberReq;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class MemberController {

    @Operation(summary = "Emoji 조회")
    @PostMapping("/emoji")
    public void post(@Valid @RequestBody MemberReq req) {
    }
}
