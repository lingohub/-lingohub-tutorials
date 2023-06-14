package com.lingohub.tutorials.springboot;

import java.util.Locale;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Configuration
public class MyBeansConfig {

  @Bean
  public LocaleResolver localeResolver() {
    SessionLocaleResolver sessionResolver = new SessionLocaleResolver();
    sessionResolver.setDefaultLocale(Locale.US);
    return sessionResolver;
  }

  @Bean
  public LocaleChangeInterceptor localeChangeInterceptor() {
    LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
    localeChangeInterceptor.setParamName("localeCode");

    return localeChangeInterceptor;
  }

}
