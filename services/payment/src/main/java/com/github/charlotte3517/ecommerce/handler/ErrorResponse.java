package com.github.charlotte3517.ecommerce.handler;

import java.util.Map;

public record ErrorResponse(
        Map<String, String> errors
) {

}
