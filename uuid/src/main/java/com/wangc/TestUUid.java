package com.wangc;

import org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

import java.util.Date;
import java.util.UUID;

/**
 * Created by wangchao on 2016/10/11.
 */
public class TestUUid extends AbstractJavaSamplerClient {
    @Override
    public SampleResult runTest(JavaSamplerContext javaSamplerContext) {
        SampleResult results = new SampleResult();
        results.sampleStart();

        results.setResponseData(UUID.randomUUID().toString(),null);
        results.setDataType("text");
        results.setSampleLabel("java_lavel_wangc");

        results.setSuccessful(true);
        results.sampleEnd();

/*

            SampleResult results = new SampleResult();

            results.setResponseCode("200");
            results.setResponseMessage("OK");
            results.setSampleLabel("label_java");

                results.setSamplerData("samplerDate");

                results.setResponseData("resultData", null);
                results.setDataType("text");

            results.sampleStart();

            */
/*long sleep = this.sleepTime;
            if ((this.sleepTime > 0L) && (this.sleepMask > 0L))
            {
                long start = System.currentTimeMillis();

                sleep = this.sleepTime + start % this.sleepMask;
            }*//*


            try
            {
//                if (sleep > 0L)
//                    TimeUnit.MILLISECONDS.sleep(sleep);

                results.setSuccessful(true);
            } */
/*catch (InterruptedException e) {
//                LOG.warn("JavaTest: interrupted.");
                results.setSuccessful(true);
            } *//*
catch (Exception e) {
//                LOG.error("JavaTest: error during sample", e);
                results.setSuccessful(false);
            }
            finally {
                results.sampleEnd();
            }
*/

            
            return results;

    }
}
