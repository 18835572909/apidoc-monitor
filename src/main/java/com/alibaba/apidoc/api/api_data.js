define({ "api": [
  {
    "type": "GET",
    "url": "/hello/defaultUser",
    "title": "获取默认用户",
    "name": "DefaultUser",
    "group": "Hello",
    "version": "1.0.0",
    "description": "<p>获取默认用户信息</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": true,
            "field": "name",
            "description": "<p>姓名</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "username",
            "description": "<p>用户名</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "allowedValues": [
              "0",
              "1"
            ],
            "optional": false,
            "field": "sex",
            "description": "<p>性别，0：女 1：男</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": true,
            "field": "age",
            "defaultValue": "18",
            "description": "<p>年龄</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "请求样例：",
          "content": "/hello/defaultUser?name=张山&username=zshang&sex=1&age=25",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\"code\":0,\"message\":\"操作成功\",\"data\":{\"id\":\"1fe521a5b0c74581913bb7530af151ec\",\"name\":\"张格\",\"age\":0,\"address\":null,\"sex\":0,\"failure\":false,\"optime\":\"2020-01-08 21:16:37\",\"username\":\"zg123456\",\"password\":\"123456\"}}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "code",
            "description": "<p>状态码，0：请求成功 1：请求失败</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "message",
            "description": "<p>提示信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>返回数据</p>"
          }
        ]
      }
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "{\"code\":1,\"message\":\"请求失败\"}",
          "type": "json"
        }
      ]
    },
    "filename": "./doc/HelloAPI.java",
    "groupTitle": "Hello"
  },
  {
    "type": "POST",
    "url": "/hello/userList",
    "title": "初始化用户列表",
    "name": "UserList",
    "group": "Hello",
    "version": "1.0.0",
    "description": "<p>获取默认用户信息,请求方式表单提交</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "name",
            "description": "<p>姓名</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "age",
            "description": "<p>年龄</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "请求样例：",
          "content": "/hello/userList?name=张山&age=25",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\"code\":0,\"message\":\"操作成功\",\"data\":[{\"id\":\"e2836d3354304f0a959dec3f55efd3cf\",\"name\":\"李一\",\"age\":0,\"address\":null,\"sex\":0,\"failure\":false,\"optime\":\"2020-01-08 22:59:18\",\"username\":\"ly12356\",\"password\":\"123456\"},{\"id\":\"fc4feb1823104970906340edacb3c5b3\",\"name\":\"赵二\",\"age\":0,\"address\":null,\"sex\":0,\"failure\":false,\"optime\":\"2020-01-08 22:59:18\",\"username\":\"zr12356\",\"password\":\"123456\"},{\"id\":\"e69e36a0044440cf8f9f6803ac4e9d5f\",\"name\":\"张三\",\"age\":0,\"address\":null,\"sex\":0,\"failure\":false,\"optime\":\"2020-01-08 22:59:18\",\"username\":\"zs12356\",\"password\":\"123456\"}]}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "code",
            "description": "<p>状态码，0：请求成功 1：请求失败</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "message",
            "description": "<p>提示信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>用户信息</p>"
          }
        ]
      }
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "{\"code\":1,\"message\":\"请求失败\"}",
          "type": "json"
        }
      ]
    },
    "filename": "./doc/HelloAPI.java",
    "groupTitle": "Hello"
  }
] });
