package com.oauth.facebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
@EnableOAuth2Sso // to do authentication; single signon application
public class OauthfacebookLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(OauthfacebookLoginApplication.class, args);
	}

}
