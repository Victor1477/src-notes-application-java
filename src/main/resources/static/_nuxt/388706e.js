(window.webpackJsonp=window.webpackJsonp||[]).push([[6,3],{308:function(e,t,o){var content=o(315);content.__esModule&&(content=content.default),"string"==typeof content&&(content=[[e.i,content,""]]),content.locals&&(e.exports=content.locals);(0,o(113).default)("2c403720",content,!0,{sourceMap:!1})},314:function(e,t,o){"use strict";o(308)},315:function(e,t,o){var r=o(112)((function(i){return i[1]}));r.push([e.i,".spinner-container .spinner[data-v-4c12bebb]{animation:spin-4c12bebb .7s linear infinite;border:2px solid #fff;border-radius:50%;border-top:none}@keyframes spin-4c12bebb{0%{transform:rotate(0deg)}to{transform:rotate(1turn)}}",""]),r.locals={},e.exports=r},323:function(e,t,o){var content=o(329);content.__esModule&&(content=content.default),"string"==typeof content&&(content=[[e.i,content,""]]),content.locals&&(e.exports=content.locals);(0,o(113).default)("1d2a9f1c",content,!0,{sourceMap:!1})},325:function(e,t,o){"use strict";o.r(t);o(87);var r=o(1).a.extend({props:{size:{default:"1rem",type:String}}}),n=(o(314),o(50)),component=Object(n.a)(r,(function(){var e=this,t=e._self._c;e._self._setupProxy;return t("div",{staticClass:"spinner-container"},[t("div",{staticClass:"spinner",style:"height:".concat(e.size,"; width:").concat(e.size,";")})])}),[],!1,null,"4c12bebb",null);t.default=component.exports},328:function(e,t,o){"use strict";o(323)},329:function(e,t,o){var r=o(112)((function(i){return i[1]}));r.push([e.i,".form-container[data-v-3525ce3c]{display:flex;justify-content:center}.form-container form[data-v-3525ce3c]{display:grid;grid-template-rows:repeat(2,3.7rem) 2.5rem;margin-top:25vh;grid-gap:1rem;gap:1rem;width:15rem}.form-container form .form-group[data-v-3525ce3c]{border:1px solid #000;border-radius:.2rem;display:flex;flex-direction:column;justify-content:center;padding:1rem;position:relative}.form-container form .form-group label[data-v-3525ce3c]{font-weight:700;transition:all .2s}.form-container form .form-group input[data-v-3525ce3c]{background-color:inherit;border:none;bottom:0;font-size:1rem;left:0;opacity:0;outline:none;position:absolute;right:0;top:0}.form-container form .form-group.active label[data-v-3525ce3c]{position:absolute;translate:-.5rem -.7rem;z-index:1}.form-container form .form-group.active input[data-v-3525ce3c]{opacity:1;position:relative;top:.6rem}.form-container form .form-group:focus-within label[data-v-3525ce3c]{position:absolute;translate:-.5rem -.7rem;z-index:1}.form-container form .form-group:focus-within input[data-v-3525ce3c]{opacity:1;position:relative;top:.6rem}.form-container form button[data-v-3525ce3c]{align-items:center;background:linear-gradient(90deg,#00aaf0,#000,#00aaf0);border:none;border-radius:.3rem;color:#fff;display:flex;font-size:1rem;font-weight:700;justify-content:center}.form-container form button[data-v-3525ce3c]:hover{background:linear-gradient(90deg,#0af,#141414,#0af);font-size:1.1rem}",""]),r.locals={},e.exports=r},332:function(e,t,o){"use strict";o.r(t);o(17);var r=o(1).a.extend({data:function(){return{isLoading:!1,form:{username:"",password:""}}},methods:{onSubmit:function(){var e=this;this.isLoading=!0,this.$axios.post("/login",this.form).then((function(t){var data=t.data;data&&(e.$store.dispatch("setToken",data.token),e.$router.push("/"))})).catch((function(){})).finally((function(){e.isLoading=!1}))},onChange:function(e){""!==e.target.value?e.target.parentNode.classList.add("active"):e.target.parentNode.classList.remove("active")}}}),n=(o(328),o(50)),component=Object(n.a)(r,(function(){var e=this,t=e._self._c;e._self._setupProxy;return t("div",{staticClass:"form-container"},[t("form",{on:{submit:function(t){return t.preventDefault(),e.onSubmit()}}},[t("div",{staticClass:"form-group"},[t("label",{attrs:{for:"register-application-username"}},[e._v("Username")]),e._v(" "),t("input",{directives:[{name:"model",rawName:"v-model",value:e.form.username,expression:"form.username"}],attrs:{type:"text",name:"notes-application-username"},domProps:{value:e.form.username},on:{change:function(t){return e.onChange(t)},input:function(t){t.target.composing||e.$set(e.form,"username",t.target.value)}}})]),e._v(" "),t("div",{staticClass:"form-group"},[t("label",{attrs:{for:"password"}},[e._v("Password")]),e._v(" "),t("input",{directives:[{name:"model",rawName:"v-model",value:e.form.password,expression:"form.password"}],attrs:{type:"password",name:"password"},domProps:{value:e.form.password},on:{change:function(t){return e.onChange(t)},input:function(t){t.target.composing||e.$set(e.form,"password",t.target.value)}}})]),e._v(" "),t("button",{attrs:{type:"submit"}},[e.isLoading?t("LoadingSpinner",{attrs:{size:"1.5rem"}}):t("p",[e._v("Login")])],1)])])}),[],!1,null,"3525ce3c",null);t.default=component.exports;installComponents(component,{LoadingSpinner:o(325).default})}}]);