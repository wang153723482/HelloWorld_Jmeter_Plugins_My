package com.wangc;

import org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by wangchao on 2016/8/10.
 */
public class TestLog4j2 extends AbstractJavaSamplerClient {
    static Logger logger = LogManager.getLogger(TestLog4j2.class.getName());
    
    @Override
    public SampleResult runTest(JavaSamplerContext javaSamplerContext) {
        logger.info("this is a normal information log4j2");
        logger.info( Thread.currentThread().getId() );

        SampleResult sampleResult = new SampleResult();
        sampleResult.sampleStart();
        
        sampleResult.setSuccessful(true);
        sampleResult.sampleEnd();
        return sampleResult;
    }
}
