import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowires
import org.springframework.beans.factory.annotation.Values;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentification.builders.AuthentificationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.Configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.Configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrupt.BcryptPassordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity

public class SecrityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	private BcryptPassordEncoder bcryptPassordEncoder;

	@Autowired
	private DataSource datasource;
	@Value("${spring.queries.users-query}")
	private String usersQuery;
}