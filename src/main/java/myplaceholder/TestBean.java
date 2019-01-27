package myplaceholder;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public class TestBean {
    @Value("${jdbc.url}")
    public String jdbcurl;

    @Value("God")
    public String god;

    @Value("#{systemProperties['os.name']}")
    public String os;

    @Value("#{ T(java.lang.Math).random() * 10000}")
    public String randString;
}
