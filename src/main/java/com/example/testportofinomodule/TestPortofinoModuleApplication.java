package com.example.testportofinomodule;

import com.manydesigns.portofino.ResourceActionsModule;
import com.manydesigns.portofino.microservices.boot.ElementsAutoConfiguration;
import com.manydesigns.portofino.microservices.boot.PortofinoJerseyAutoConfiguration;
import com.manydesigns.portofino.microservices.boot.support.PortofinoDispatcherSupport;
import com.manydesigns.portofino.microservices.boot.support.PortofinoSupport;
import com.manydesigns.portofino.modules.CrudModule;
import com.manydesigns.portofino.modules.DatabaseModule;
import com.manydesigns.portofino.modules.PostgresqlModule;
import com.manydesigns.portofino.modules.TestModule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({
        PortofinoSupport.class, PortofinoDispatcherSupport.class,
        PortofinoJerseyAutoConfiguration.class, ElementsAutoConfiguration.class,
        DatabaseModule.class, PostgresqlModule.class,
        ResourceActionsModule.class, CrudModule.class,
        TestModule.class
})
public class TestPortofinoModuleApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(TestPortofinoModuleApplication.class, args);
    }

}
