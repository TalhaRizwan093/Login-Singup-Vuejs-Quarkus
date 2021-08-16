<template>
    <div class="vue-tempalte">
        <form>
            <h3>Sign Up</h3>

            <div class="form-group">
                <label>Username</label>
                <input type="text" v-model="user.user_name" class="form-control form-control-lg"/>
            </div>

            <div class="form-group">
                <label>Email address</label>
                <input type="email" v-model="user.email" class="form-control form-control-lg" />
            </div>

            <div class="form-group">
                <label>Activation code</label>
                <input type="password" v-model="user.branch_code" class="form-control form-control-lg" />
                <p> Call 011-92-21-32446978 to get activation code</p> 
            </div>
     
            <button type="submit" class="btn btn-dark btn-lg btn-block" @click.prevent="signup()">Sign Up</button>

            <p class="forgot-password text-right">
                Already registered 
                <router-link :to="{name: 'login'}">sign in?</router-link>
            </p>
        </form>


</div>

</template>


<script>
// imports
import axios from 'axios'

export default {
  data() {
    return {
      user: {
       user_name: '',
        email: '',
        branch_code:''
      }
    }},
    methods:{
        signup(){
    
            axios.post("http://localhost:8081/Signup",  this.user)
                .then(response => {
                    if(response.data)
                    {  this.$router.push('/login')
                        console.log("hasd")

                    }

                }).catch(error => console.log(error))
                .finally(console.log("here"))
                
          

        }

    }
  
};

</script>

