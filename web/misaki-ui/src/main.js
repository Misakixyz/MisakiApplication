import { createApp } from 'vue'
// import './style.css'
import App from './App.vue'
import router from './router'
import axios from 'axios'
import VueAxios from 'vue-axios'
import api from './http/api'
import i18n from './i18n'
// import VueI18n from 'vue-i18n'

import store from './store'
import global from './utils/global'
import ElementUI from 'element-plus'
import 'element-plus/theme-chalk/index.css'
import'./mock/index'
import 'font-awesome/css/font-awesome.min.css'


const app = createApp(App);

app.config.globalProperties.$api = api
app.config.globalProperties.global = global

// app.use(api)
app.use(ElementUI)
.use(i18n)
.use(store)
.use(router)
.use(VueAxios, axios, )
.mount('#app')
app.config.globalProperties.$axios=axios
