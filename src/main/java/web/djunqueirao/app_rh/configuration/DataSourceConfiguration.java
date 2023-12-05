package web.djunqueirao.app_rh.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class DataSourceConfiguration {

    @Bean
    DataSource getDataSource() {
    	DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
    	driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/AppRh?createDatabaseIfNotExist=true");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("toor");
		return driverManagerDataSource;
	}

    @Bean
    JpaVendorAdapter setJpaVendorAdapter() {
    	HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
    	adapter.setDatabase(Database.MYSQL);
    	adapter.setShowSql(true);
    	adapter.setGenerateDdl(true);
    	adapter.setPrepareConnection(true);
    	return adapter;
    }
}