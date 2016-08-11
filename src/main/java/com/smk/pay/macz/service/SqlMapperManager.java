package com.smk.pay.macz.service;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Project mybatis-study
 * Created by chuanzhi.mcz
 * Date 2016/8/11 10:00
 */
public class SqlMapperManager {

    private static SqlSessionFactory factory = null;

    public static String CONFIGFILE = "configuration.xml";

    public static void initMapper(String configFile) {
        CONFIGFILE = configFile;
    }

    public static SqlSessionFactory getFactory() {

        if (factory == null) {

            try {
                Reader reader = new InputStreamReader(Resources.getResourceAsStream(CONFIGFILE));
                SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
                return sessionFactory;
            } catch (IOException e) {
                return null;
            }
        }
        return factory;

    }
}
