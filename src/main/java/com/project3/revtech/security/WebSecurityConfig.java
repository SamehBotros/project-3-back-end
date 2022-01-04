package com.project3.revtech.security;

import org.h2.server.web.WebServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.project3.revtech.security.jwt.AuthEntryPointJwt;
import com.project3.revtech.security.jwt.AuthTokenFilter;
import com.project3.revtech.security.service.UserDetailsServiceImpl;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(
		prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
  @Autowired
  UserDetailsServiceImpl userDetailsService;

  @Autowired
  private AuthEntryPointJwt unauthorizedHandler;

  @Bean
  public AuthTokenFilter authenticationJwtTokenFilter() {
    return new AuthTokenFilter();
  }

  @Override
  public void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
    authenticationManagerBuilder.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
  }

  @Bean
  @Override
  public AuthenticationManager authenticationManagerBean() throws Exception {
    return super.authenticationManagerBean();
  }

  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }
  @Bean
  ServletRegistrationBean h2servletRegistration() {
      ServletRegistrationBean registrationBean = new ServletRegistrationBean(new WebServlet());
      registrationBean.addUrlMappings("/h2-console/*");
      return registrationBean;
  }
  @Override
  protected void configure(HttpSecurity http) throws Exception {

	   http.cors().and().csrf().disable()
	  .exceptionHandling().authenticationEntryPoint(unauthorizedHandler).and()
	  .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).
	   and().authorizeRequests().antMatchers("/api/auth/**").permitAll().and()
	  .authorizeRequests().antMatchers("/h2-console/**").permitAll().and()
      .authorizeRequests().antMatchers("/api/product-discount").permitAll().and()
      .authorizeRequests().antMatchers("/api/product-discount/**").permitAll().and()
      .authorizeRequests().antMatchers("/api/products").permitAll().and()
      .authorizeRequests().antMatchers("/api/auth/signup").permitAll().and()
      .authorizeRequests().antMatchers("/combined/Disc/Products").permitAll().and()
	  .authorizeRequests().antMatchers("/api/products/{pid}").permitAll().and()
	  .authorizeRequests().antMatchers("/file/upload").permitAll().and()
      .authorizeRequests().antMatchers("/discounts/update").permitAll().and()
      .authorizeRequests().antMatchers("/discounts/remove/{discId}").permitAll().and()
      .authorizeRequests().antMatchers("/discounts/add").permitAll().and()
      .authorizeRequests().antMatchers("/api/transaction").permitAll().and()
      .authorizeRequests().antMatchers("/api/transaction/**").permitAll().and()
      .authorizeRequests().antMatchers("/api/cart-items").permitAll().and()
      .authorizeRequests().antMatchers("/api/cart-items/**").permitAll().and()
      .authorizeRequests().antMatchers("/file").permitAll().and()
      .authorizeRequests().antMatchers("/file/**").permitAll().and()
      .authorizeRequests().antMatchers("/api/cart-and-items").permitAll().and()
      .authorizeRequests().antMatchers("/api/cart-and-items/**").permitAll().and()
      .authorizeRequests().antMatchers("/api/cart").permitAll().and()
      .authorizeRequests().antMatchers("/combined/Disc/Products").permitAll().and()
      .authorizeRequests().antMatchers("/api/test/**").permitAll().and()
      .authorizeRequests().antMatchers("/cart/{bid}").permitAll().and()
      .authorizeRequests().antMatchers("/user/{bid}").permitAll()
	  .anyRequest().authenticated();
	   http.headers().frameOptions().disable();

		  
	   http.addFilterBefore(authenticationJwtTokenFilter(),
	   UsernamePasswordAuthenticationFilter.class);
		 
			/*
			 * http.cors().and().csrf().disable().authorizeRequests().anyRequest().permitAll
			 * (); http.headers().frameOptions().disable();
			 */
    
  }
 
  

}
