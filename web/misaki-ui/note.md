### axios mock 404
 - 在main.js中引入mock
`import './mock/mock'`
 - mock.js中使用网址
    ```
    import Mock from 'mockjs'

    Mock.mock('/user','post', {
        'name': '@name', // 随机生成姓名
        'name': '@email', // 随机生成邮箱
        'age|1-10': 5, // 年龄1-10之间
    })
    Mock.mock('/menu','post', {
        'id': '@increment', // id自增
        'name': 'menu', // 名称为menu
        'order|1-20': 5, // 排序1-20之间
    })
    ```
    其中的地址需要如上形式  
    不能使用"http://localhost:8080/"  
 - 在vue页面中,写成如下形式
    ```
    getMenu() {
        axios.post('/menu').then(res => { alert(JSON.stringify(res.data)) })
        .catch(err => {
            this.$message.error(err.message)
            console.log(err)
            })
        }
    ```

### ./与../的区别
用法上:
- ./

### token问题
- 使用res.data.token即可
    ```
    <script>
    // import mock from '../mock/index'
    import Cookies from "js-cookie"
    import router from '../router'
    export default {
        name: 'Login',
        methods: {
        login() {
            this.$api.login.login().then(function(res) {
    　　　　　　 alert(res.data.token)
                Cookies.set('token', res.data.token) // 放置token到Cookie
                router.push('/')  // 登录成功，跳转到主页
            }).catch(function(res) {
                alert(res);
            });
        }
        }
    }
    </script>
    ```

### 出现require not define 的时候
- 改用new URL
    ```
    const i18n = createI18n({
    locale: 'zh_cn',
    messages: {
        'zh_cn': new URL('../assets/languages/zh_cn.json',import.meta.url),
        'en_us': require('../assets/languages/en_us.json')
    }
    })
    ```

##问题:
1. 首页ui不应该出现 "单击-弹窗显示",而是直接显示