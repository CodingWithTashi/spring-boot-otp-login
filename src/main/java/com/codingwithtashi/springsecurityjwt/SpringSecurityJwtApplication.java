package com.codingwithtashi.springsecurityjwt;

import com.codingwithtashi.springsecurityjwt.config.TwilioConfig;
import com.codingwithtashi.springsecurityjwt.model.User;
import com.codingwithtashi.springsecurityjwt.repository.UserRepository;
import com.twilio.Twilio;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
@OpenAPIDefinition( info = @Info(title = "Spring boot otp authentication",version = "1.0.0"))
public class SpringSecurityJwtApplication {
	@Autowired
	private UserRepository repository;
	@Autowired
	private TwilioConfig twilioConfig;

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJwtApplication.class, args);
	}


	@PostConstruct
	public void initTwilio(){
		Twilio.init(twilioConfig.getAccountSid(),twilioConfig.getAuthToken());
	}


	@PostConstruct
	public void initUsers() {
		User user = new User();
		user.setUserName( "7022752477");
		List<User> users = Stream.of(user
		).collect(Collectors.toList());
		repository.saveAll(users);
	}
}
