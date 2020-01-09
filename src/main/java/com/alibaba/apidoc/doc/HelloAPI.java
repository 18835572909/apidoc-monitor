package com.alibaba.apidoc.doc;

public class HelloAPI {

    /**
     * @api {GET} /hello/defaultUser 获取默认用户
     * @apiName DefaultUser
     * @apiGroup Hello
     * @apiVersion 1.0.0
     * @apiDescription
     *  获取默认用户信息
     * @apiParam {String} [name] 姓名
     * @apiParam {String} username 用户名
     * @apiParam {int=0,1} sex 性别，0：女 1：男
     * @apiParam {int} [age=18] 年龄
     *
     * @apiParamExample {json} 请求样例：
     *   /hello/defaultUser?name=张山&username=zshang&sex=1&age=25
     *
     * @apiSuccessExample {json} Success-Response:
     * {"code":0,"message":"操作成功","data":{"id":"1fe521a5b0c74581913bb7530af151ec","name":"张格","age":0,"address":null,"sex":0,"failure":false,"optime":"2020-01-08 21:16:37","username":"zg123456","password":"123456"}}
     *
     * @apiErrorExample {json} Error-Response:
     * {"code":1,"message":"请求失败"}
     *
     * @apiSuccess {Integer} code    状态码，0：请求成功 1：请求失败
     * @apiSuccess {String} message   提示信息
     * @apiSuccess {Object} data    返回数据
     */

    /**
     * @api {POST} /hello/userList 初始化用户列表
     * @apiName UserList
     * @apiGroup Hello
     * @apiVersion 1.0.0
     * @apiDescription
     *  获取默认用户信息,请求方式表单提交
     * @apiParam {String} name 姓名
     * @apiParam {int} age 年龄
     *
     * @apiParamExample {json} 请求样例：
     *   /hello/userList?name=张山&age=25
     *
     * @apiSuccessExample {json} Success-Response:
     * {"code":0,"message":"操作成功","data":[{"id":"e2836d3354304f0a959dec3f55efd3cf","name":"李一","age":0,"address":null,"sex":0,"failure":false,"optime":"2020-01-08 22:59:18","username":"ly12356","password":"123456"},{"id":"fc4feb1823104970906340edacb3c5b3","name":"赵二","age":0,"address":null,"sex":0,"failure":false,"optime":"2020-01-08 22:59:18","username":"zr12356","password":"123456"},{"id":"e69e36a0044440cf8f9f6803ac4e9d5f","name":"张三","age":0,"address":null,"sex":0,"failure":false,"optime":"2020-01-08 22:59:18","username":"zs12356","password":"123456"}]}
     *
     * @apiErrorExample {json} Error-Response:
     * {"code":1,"message":"请求失败"}
     *
     * @apiSuccess {Integer} code    状态码，0：请求成功 1：请求失败
     * @apiSuccess {String} message   提示信息
     * @apiSuccess {Object} data    用户信息
     */
}
