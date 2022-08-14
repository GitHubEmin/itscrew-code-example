package org.itscrew.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @author it_screw
 * @date 2022/8/14 21:35
 * @description 这个配置类的作用相当于 applicationContext.xml
 */

@Configuration
@ComponentScan(basePackages = "org.itscrew",useDefaultFilters = true,excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class)})
public class SpringConfig {
}
