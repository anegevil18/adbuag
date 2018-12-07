package adesba.config;



//@Configuration
public class HibernateUtil {
//    @Autowired
//    private Environment env;
//
//
//    @Bean
//    public LocalSessionFactoryBean sessionFactory() {
//        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
//        sessionFactory.setDataSource(restDataSource());
//        sessionFactory.setPackagesToScan(new String[]{"adesba.model"});
//        sessionFactory.setHibernateProperties(hibernateProperties());
//
//        return sessionFactory;
//    }
//
//
//    @Bean
//    public DataSource restDataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName(env.getProperty("jdbc.driverClassName"));
//        dataSource.setUrl(env.getProperty("jdbc.url"));
//        dataSource.setUsername(env.getProperty("jdbc.user"));
//        dataSource.setPassword(env.getProperty("jdbc.password"));
//
//        return dataSource;
//    }
//
//
//    @Bean
//    @Autowired
//    public HibernateTransactionManager transactionManager(
//            SessionFactory sessionFactory) {
//
//        HibernateTransactionManager txManager = new HibernateTransactionManager();
//        txManager.setSessionFactory(sessionFactory);
//
//        return txManager;
//    }
//
//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
//        final LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
//        emf.setDataSource(restDataSource());
//        emf.setPackagesToScan(new String[] { "mx.org.infonavit.safe.procesadorarchivos.model.persistence" });
//
//        final JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//        emf.setJpaVendorAdapter(vendorAdapter);
//        emf.setJpaProperties(hibernateProperties());
//
//        return emf;
//    }
//
//
//    @Bean
//    public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
//        return new PersistenceExceptionTranslationPostProcessor();
//    }
//
//
//    Properties hibernateProperties() {
//        return new Properties() {
//            {
//                setProperty("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
//                setProperty("hibernate.dialect", env.getProperty("hibernate.dialect"));
//                setProperty("hibernate.globally_quoted_identifiers", "true");
//                setProperty("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
//                setProperty("hibernate.temp.use_jdbc_metadata_defaults","false");
//            }
//        };
//    }
}
