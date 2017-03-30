package com.wangc;

import org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

import java.util.Random;

/**
 * Created by wangchao on 2016/10/26.
 */
public class TestRandom extends AbstractJavaSamplerClient {
    private static Random random = new Random();
    
    @Override
    public SampleResult runTest(JavaSamplerContext javaSamplerContext) {
        SampleResult sampleResult = new SampleResult();
        sampleResult.sampleStart();
        sampleResult.setResponseData(String.valueOf(random.nextDouble()),null);
        sampleResult.setSuccessful(true);
        
        sampleResult.sampleEnd();
        return sampleResult;
    }
}
