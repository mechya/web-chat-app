package com.web.chat.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
@EnableWebSecurity
public class WebChatAppSecurityConfig  extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
	     .antMatchers("/home").permitAll()
				//.antMatchers("/signup/**","/login_00_00/**").permitAll()
				.antMatchers("/contact/**").hasAuthority("USER")
				.and()
				.formLogin()
				.loginPage("/login")
				//.loginProcessingUrl("/login_00_00/auth")
				.usernameParameter("username")
				.passwordParameter("password");
	}
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/static/**");
	}

}
