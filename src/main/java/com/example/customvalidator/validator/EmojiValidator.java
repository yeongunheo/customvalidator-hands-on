package com.example.customvalidator.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class EmojiValidator implements ConstraintValidator<OnlyEmoji, String> {

    public static final String REGEX_PATTERN = "[\uD800-\uDBFF\uDC00-\uDFFF]+";

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || value.isBlank()) {
            return false;
        }

        return value.matches(REGEX_PATTERN);
    }
}
