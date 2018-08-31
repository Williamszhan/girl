#### 属性配置
- @Value    配置内容注入
- @Component    分组
- @ConfigurationProperties  分组

- 多环境配置

#### Controller的使用
- @Controller    处理http请求
- @RestController    Spring4之后新家的注解，原来返回json需要@ResponseBody配合@Controller
- @RequestMapping    配置url映射

- @PathVariable     获取url中的数据
- @RequestParam     获取请求参数的值
- @GetMapping       组合注解

#### Spring-Data-Jpa

- RESTful API设计
----
|请求类型|请求路径|功能|
|----|----|----|
|GET|/girls|获取女生列表|
|POST|/girls|创建一个女生|
|GET|/girls/id|通过id查询一个女生|
|PUT|/girls/id|通过id更新一个女生|
|DELETE|/girls/id|通过id删除一个女生|

#### 单元测试

- mvn clean package -Dmaven.test.skip=true  跳过单元测试打包

#### API文档

**简要描述：** 

- 查询所有女生列表

**请求URL：** 
- ` /girls`
  
**请求方式：**
- GET

**请求示例：**
- /girls

```
# 列表查询
编号：id
cup：cupSize
年龄：age
价格：money
```

**参数：** 

|参数名|必选|类型|说明|
|:----    |:---|:----- |-----   |
| |  | |   |# girl
