package com.github.demo.springbootmybatisjta.config;

import com.alibaba.druid.pool.xa.DruidXADataSource;
import com.atomikos.jdbc.AtomikosDataSourceBean;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = {"com.github.demo.springbootmybatisjta.dao.luckdog"}, sqlSessionTemplateRef = "sqlSessionTemplateLuckDog") // 扫描dao或mapper接口
public class DataSourceLuckDogConfig {

    @Primary
    @Bean(name = "dataSourceLuckdog")
    public DataSource dataSourceCar(DataSourceLuckDogProperties dataSourceLuckDogProperties){
        DruidXADataSource dataSource = new DruidXADataSource();
        BeanUtils.copyProperties(dataSourceLuckDogProperties,dataSource);
        AtomikosDataSourceBean xaDataSource = new AtomikosDataSourceBean();
        xaDataSource.setXaDataSource(dataSource);
        xaDataSource.setUniqueResourceName("dataSourceLuckdog");
        return xaDataSource;
    }


    @Bean(name = "sqlSessionFactoryLuckDog")
    public SqlSessionFactory sqlSessionFactoryCar(@Qualifier("dataSourceLuckdog") DataSource dataSource)
            throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setTypeAliasesPackage("com.github.demo.springbootmybatisjta.entity");
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:/mapper/luckdog/*Mapper.xml"));
        return bean.getObject();
    }

    @Bean(name = "sqlSessionTemplateLuckDog")
    public SqlSessionTemplate sqlSessionTemplateCar(
            @Qualifier("sqlSessionFactoryLuckDog") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
