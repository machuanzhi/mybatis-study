package com.smk.pay.macz.action;

import com.smk.pay.macz.model.Blog;
import com.smk.pay.macz.service.SqlMapperManager;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.BasicConfigurator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Project mybatis-study
 * Created by chuanzhi.mcz
 * Date 2016/8/11 10:08
 */
public class SimpleMapper {


    public static void main(String[] args) throws Exception{

        SqlSession session = null;
        BasicConfigurator.configure();
        try {
            SqlSessionFactory sqlSessionFactory = SqlMapperManager.getFactory();
            session = sqlSessionFactory.openSession();
//            Blog blog = (Blog)session.selectOne("selectBlogById", 1);
//            System.out.println(blog);
//
//            System.out.println("===============================");
//
//            Map<String, Object> paraMap = new HashMap<String, Object>();
//            paraMap.put("ID", 2);
//            Blog blog2 = (Blog)session.selectOne("selectBlogByIdMap", paraMap);
//            System.out.println(blog2);
//
//            System.out.println("===============================");
//
//            Blog paraBlog = new Blog();
//            paraBlog.setId(3);
//            Blog blog3 = (Blog)session.selectOne("selectBlogByIdMap", paraBlog);
//            System.out.println(blog3);

            System.out.println("===============================");

            Blog blog4 = (Blog) session.selectOne("selectBlog", 1);
            System.out.println(blog4);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session = null;
        }
    }

}
