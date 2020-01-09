package com.alibaba.common.config.mvc;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class DefualtMvcConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedMethods("GET", "HEAD", "POST", "PUT", "PATCH", "DELETE","OPTIONS", "TRACE")
                .allowCredentials(true)
                .allowedOrigins("*")
                .maxAge(3600*24);
    }

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        FastJsonHttpMessageConverter convert = new FastJsonHttpMessageConverter();
        FastJsonConfig config = new FastJsonConfig();
        config.setSerializerFeatures(SerializerFeature.PrettyFormat,
                                    SerializerFeature.WriteDateUseDateFormat,
                                    SerializerFeature.WriteMapNullValue,
                                    SerializerFeature.WriteNullStringAsEmpty,
                                    SerializerFeature.WriteNullListAsEmpty,
                                    SerializerFeature.WriteNullBooleanAsFalse);
        List<MediaType> mediaTypes = new ArrayList<>();
        mediaTypes.add(MediaType.ALL);
        convert.setSupportedMediaTypes(mediaTypes);
        convert.setFastJsonConfig(config);

        converters.add(convert);
    }
}
