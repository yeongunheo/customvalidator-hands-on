package com.example.customvalidator.controller.dto;

import com.example.customvalidator.validator.OnlyEmoji;

public record MemberReq(
        @OnlyEmoji(message = "올바른 이모지를 입력해주세요.")
        String emoji
) {
}
