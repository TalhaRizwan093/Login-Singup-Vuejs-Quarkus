import Vue from 'vue'
import App from './App.vue'
import router from './router'

import 'bootstrap/dist/css/bootstrap.min.css'
import '@/assets/css/main.css'

// import VueAxios from 'vue-axios';
 import axios from 'axios'
// Vue.use(VueAxios);
Vue.prototype.$http = axios

Vue.config.productionTip = false

new Vue({
  router,
  render: h => h(App)
}
).$mount('#app')
