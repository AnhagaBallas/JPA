package com.netology.daohibarnate.security;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@EnableMethodSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("Ivan").password("{noop}password").authorities("/persons/by-city").roles("READ", "WRITE")
                .and()
                .withUser("Petr").password("{noop}password").authorities("persons/by-age").roles("DELETE");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin()
                .and()
                .authorizeRequests().antMatchers("persons/by-name").anonymous()
                .and()
                .authorizeRequests().antMatchers("/persons/by-city").hasAuthority("/persons/by-city")
                .and()
                .authorizeRequests().antMatchers("persons/by-age").hasAuthority("persons/by-age")
                .and()
                .authorizeRequests().anyRequest().authenticated();
    }
}
