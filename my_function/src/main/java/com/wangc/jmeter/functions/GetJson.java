package com.wangc.jmeter.functions;

import org.apache.jmeter.engine.util.CompoundVariable;
import org.apache.jmeter.functions.AbstractFunction;
import org.apache.jmeter.functions.InvalidVariableException;
import org.apache.jmeter.samplers.SampleResult;
import org.apache.jmeter.samplers.Sampler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by wangchao on 2017/6/8.
 * 输入一个key，一个value，返回 {"key":"value"} 这样的结果
 */
public class GetJson extends AbstractFunction {

    private static final Logger logger = LoggerFactory.getLogger(GetJson.class);
    private static final List<String> desc = new LinkedList<String>();
    private static final String KEY = "__getJson";
    private Object[] values = null;

    static {
        desc.add("The key of json");
        desc.add("The value of json");
    }

    /*界面上的参数*/
    private CompoundVariable keyJson;
    private CompoundVariable valueJson;


    /*调用函数需要返回的东西*/
    public String execute(SampleResult sampleResult, Sampler sampler) throws InvalidVariableException {
        String jsonString = new StringBuilder("{\"")
                .append(keyJson.execute().trim())
                .append("\":\"")
                .append(valueJson.execute().trim())
                .append("\"}")
                .toString();

        return jsonString;
    }

    /*参数校验，参数为所有参数元素的集合*/
    public void setParameters(Collection<CompoundVariable> collection) throws InvalidVariableException {
        checkParameterCount(collection, 2);//校验参数的个数
        values = collection.toArray();
        keyJson = (CompoundVariable) values[0];
        valueJson = (CompoundVariable) values[1];
    }

    /*
    * 返回函数的名字
    * */
    public String getReferenceKey() {
        return KEY;
    }

    /*
    * 返回包含参数描述的列表，如果不想写描述，需要返回与参数对应数量空白字符的列表
    * */
    public List<String> getArgumentDesc() {
        return desc;
    }
}
