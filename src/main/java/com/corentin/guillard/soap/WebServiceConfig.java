package com.corentin.guillard.soap;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {
	
	@Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(
            ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<MessageDispatcherServlet>(servlet, "/ws/*");
    }

	@Bean(name = "author")
	public DefaultWsdl11Definition authordWsdl11Definitionr(XsdSchema authorSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("AuthorPort");
		wsdl11Definition.setLocationUri("/ws");
		wsdl11Definition.setTargetNamespace("http://localhost:7050/ws/author");
		wsdl11Definition.setSchema(authorSchema);
		return wsdl11Definition;
	}

	@Bean
	public XsdSchema authorSchema() {
		return new SimpleXsdSchema(new ClassPathResource("author.xsd"));
	}
	
	@Bean(name = "author")
	public DefaultWsdl11Definition bookWsdl11DefinitionBook(XsdSchema bookSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("AuthorPort");
		wsdl11Definition.setLocationUri("/ws");
		wsdl11Definition.setTargetNamespace("http://localhost:7050/ws/book");
		wsdl11Definition.setSchema(bookSchema);
		return wsdl11Definition;
	}

	@Bean
	public XsdSchema bookSchema() {
		return new SimpleXsdSchema(new ClassPathResource("author.xsd"));
	}

}
