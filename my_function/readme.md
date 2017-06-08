### 为Jmeter开发Function插件

注意事项
1. 继承AbstractFunction，并实现其中的抽象方法和父级接口中的方法。
2. 包名必须是 \*.jmeter.functions.* 否则jmeter扫描不到。
3. getArgumentDesc() 获取本函数的参数描述，如果没有描述，则需要返回与参数对应个数的空字符串。
4. 
