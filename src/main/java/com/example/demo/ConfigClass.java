package com.example.demo;


import com.example.wsdl.ObjectFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class ConfigClass {
//
//    @Bean
//    public Jaxb2Marshaller marshaller(){
//        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
//
//        marshaller.setContextPath("com.example.wsdl");
//        return marshaller;
//    }
//
//    @Bean
//    public ObjectFactory objectFactory(){
//        ObjectFactory objectFactory = new ObjectFactory();
//        return objectFactory;
//    }
//
//    @Bean
//    public EPassClient ePassClient(Jaxb2Marshaller marshaller, ObjectFactory objectFactory){
//        EPassClient ePassClient = new EPassClient();
//        ePassClient.setDefaultUri("http://www.epass.by:80/BEPTGlobalService");
//        ePassClient.setUnmarshaller(marshaller);
//        ePassClient.setMarshaller(marshaller);
//
//        ePassClient.setObjectFactory(objectFactory);
//        return ePassClient;
//    }

}
