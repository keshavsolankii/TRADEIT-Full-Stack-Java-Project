package com.trade.config;

import io.jsonwebtoken.security.Keys;

import javax.crypto.SecretKey;

public class JwtProvider {

    private static SecretKey key = Keys.hmacShaKeyFor(JwtConstant.SECRETE_KEY.getBytes());

    public static String generateToken(String subject){
        
        return null;
    }
}
