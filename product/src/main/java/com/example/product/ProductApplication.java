package com.example.product;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@SpringBootApplication
public class ProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);
	}
	
	@Bean    //  sqlSession 객체를 사용하기 위해 SqlSessionFactory 생성
	public SqlSessionFactory sqlSessionFactory ( DataSource dataSource)
		throws Exception {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		Resource[] res = new PathMatchingResourcePatternResolver() //해당 리소스 정보를 가져옴.
				.getResources("classpath:mappers/*.xml");
		bean.setMapperLocations(res);
		return bean.getObject(); // dataSource, res 주입하고 오브젝트로 반환
	}
	
	@Bean
	public SqlSessionTemplate sqlSession(SqlSessionFactory factory) {
		return new SqlSessionTemplate(factory); // SqlSessionTemplate 생성자에 Mybatis 매퍼 설정 정보가 있는 SqlSessionFactory 빈을 전달해서 빈을 생성
	}

}
