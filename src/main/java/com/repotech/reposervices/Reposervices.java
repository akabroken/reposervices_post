/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.repotech.reposervices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.sql.init.SqlInitializationAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 *
 * @author amahayak
 */
//@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class,
//    SqlInitializationAutoConfiguration.class},
//        scanBasePackages = {"com.repotech.reposervices","com.repotech.reposervices.controller"})
//@EnableCaching
//@ComponentScan(basePackages = "com.repotech.reposervices")
//@EnableAutoConfiguration
////@ComponentScan(basePackageClasses  = RepoResrController.class)
//@EntityScan("com.repotech.reposervices.*")
@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class,
   SqlInitializationAutoConfiguration.class})
@EnableJpaRepositories(basePackages = "com.repotech.reposervices.repository")
@EntityScan("com.repotech.reposervices.entity")
public class Reposervices {

    public static void main(String... args) {
       
       SpringApplication.run(Reposervices.class, args);
    }
}
