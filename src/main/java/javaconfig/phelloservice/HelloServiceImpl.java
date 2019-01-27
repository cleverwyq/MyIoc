package javaconfig.phelloservice;

import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;


@Service
public class HelloServiceImpl implements InitializingBean {
    private Log log = LogFactory.getLog( this.getClass());
    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("After Prop set");
    }
}
