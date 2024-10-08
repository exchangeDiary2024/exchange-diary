package com.exchangediary.member.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class JwtServiceTest {
    @Autowired
    private JwtService jwtService;

    @Test
    void 토큰_발급_성공() {
        Long memberId = 1L;
        String token = jwtService.generateToken(memberId);

        Long result = jwtService.extractMemberId(token);

        assertThat(result).isEqualTo(memberId);
    }

    @Test
    void 토큰_만료기간_확인() {
        Long memberId = 1L;
        String token = jwtService.generateToken(memberId);

        boolean result = jwtService.verifyToken(token);

        assertThat(result).isTrue();
    }
}
