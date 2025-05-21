package com.ezen.shop.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

// 스프링시큐리티 보안기능 설정을 하기위해서 만든 클래스. 
// 목적: 비밀번호 암호화 클래스를 bean으로 생성하는 기능만 사용
@Configuration
public class SecurityConfig {

	// 스프링부트가 시작되면 @Bean 어노테이션의 기능때문에 아래메서드가 자동으로 호출된다.
	// 그리고 객체가 생성되는 데 그 객체를 bean이라고 한다
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
