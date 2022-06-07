package com.springboot.blog;

import com.springboot.blog.entity.Post;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.util.NumberUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

@SpringBootApplication
public class SpringbootBlogRestApiApplication {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }


    public static void main(String[] args) {

//        String s = "Success Count : 1 and Fail Count : 10000";
//        int firstNumberBeginIndex = 16;
//        String firstNumber = "";
//        while( Character.isDigit(s.charAt(firstNumberBeginIndex))){
//            firstNumber += s.charAt(firstNumberBeginIndex);
//            firstNumberBeginIndex++;
//        }
//        String secondNumber = "";
//        int secondNumberEndIndex = s.length() - 1;
//        while(Character.isDigit(s.charAt(secondNumberEndIndex))){
//            secondNumber += s.charAt(secondNumberEndIndex);
//            secondNumberEndIndex--;
//        }
//        secondNumber = new StringBuilder(secondNumber).reverse().toString();
//        System.out.println("First one " + firstNumber + " second number " + secondNumber);




//        System.out.println("\n\n\n\n\n\n\n\n");


        SpringApplication.run(SpringbootBlogRestApiApplication.class, args);
//        for (Method field : SpringbootBlogRestApiApplication.class.getDeclaredMethods()) {
//            String fieldName = field.getName();
//            System.out.println(fieldName);
//        }
    }

}
