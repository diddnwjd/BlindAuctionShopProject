package com.blindauction.blindauctionshopproject.util.security;

import com.blindauction.blindauctionshopproject.dto.security.SecurityExceptionDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;

@Component
public class CustomAccessDeniedHandler implements AccessDeniedHandler {
//    private static final SecurityExceptionDto exceptionDto =
//            new SecurityExceptionDto(HttpStatus.FORBIDDEN.value(), "접근이 거부되었습니다. 권한이 없습니다");

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response,
                       AccessDeniedException accessDeniedException) throws IOException {

        response.sendError(HttpServletResponse.SC_FORBIDDEN, "접근이 거부되었습니다. 권한이 없습니다."); // 권한이 존재하지 않는경우 403
//        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
//        response.setStatus(HttpStatus.FORBIDDEN.value());
//
//        try (OutputStream os = response.getOutputStream()) {
//            ObjectMapper objectMapper = new ObjectMapper();
//            objectMapper.writeValue(os, exceptionDto);
//            os.flush();
//        }

    }
}
