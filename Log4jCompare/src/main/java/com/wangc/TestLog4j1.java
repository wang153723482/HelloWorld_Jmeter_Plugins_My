package com.wangc;


import org.apache.avalon.excalibur.logger.Log4JConfLoggerManager;
import org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Created by wangchao on 2016/8/11.
 */
public class TestLog4j1 extends AbstractJavaSamplerClient {
    
    private static Logger logger = Logger.getLogger(TestLog4j1.class);


    @Override
    public SampleResult runTest(JavaSamplerContext javaSamplerContext){
        
        logger.info("this is a normal information log4j1");
        logger.info(Thread.currentThread().getId());

        SampleResult results = new SampleResult();
        results.sampleStart();

        results.setSuccessful(true);
        results.sampleEnd();
        
        return results;
    }
}
