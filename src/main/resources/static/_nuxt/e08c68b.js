(window.webpackJsonp=window.webpackJsonp||[]).push([[5,2],{308:function(t,e,n){var content=n(315);content.__esModule&&(content=content.default),"string"==typeof content&&(content=[[t.i,content,""]]),content.locals&&(t.exports=content.locals);(0,n(113).default)("18da0364",content,!0,{sourceMap:!1})},309:function(t,e,n){"use strict";n.d(e,"a",(function(){return c}));var o=n(148),r=n(147),c=(n(26),n(68),n(87),Object(o.a)((function t(e,n){Object(r.a)(this,t),this.component='<div\n      class="dynamic-info-popup"\n      style="\n        background-color: #50c850;\n        text-align: center;\n        position: fixed;\n        border-radius: 1rem;\n        padding: 1rem;\n        font-size: 1.2rem;\n        margin: auto;\n        top: 1.5rem;\n        width: 20%;\n        max-width: 20%;\n        left: 40%;\n        z-index: 300;\n      "\n    >\n      message\n    </div>';var html=document.querySelector("html"),o=document.createElement("div");this.component=this.component.replace("message",e),n&&(this.component=this.component.replace("#50c850","#ff3232")),o.innerHTML=this.component,html.appendChild(o),setTimeout((function(){null==html||html.removeChild(o)}),4e3)})))},313:function(t,e,n){var content=n(327);content.__esModule&&(content=content.default),"string"==typeof content&&(content=[[t.i,content,""]]),content.locals&&(t.exports=content.locals);(0,n(113).default)("cb9bbcda",content,!0,{sourceMap:!1})},314:function(t,e,n){"use strict";n(308)},315:function(t,e,n){var o=n(112)((function(i){return i[1]}));o.push([t.i,".container[data-v-167a8000]{align-items:center;background-color:rgba(0,0,0,.75);display:flex;flex-direction:column;height:100%;justify-content:center;position:absolute;width:100%;z-index:100}.container .popup-box[data-v-167a8000]{background:#dcdcdc;border-radius:1rem;height:12rem;position:relative;width:24rem}.container .popup-box h3[data-v-167a8000]{margin-top:1rem;text-align:center}.container .popup-box h3 p[data-v-167a8000]{font-weight:400;margin-top:.3rem}.container .popup-box .action-buttons[data-v-167a8000]{bottom:1rem;display:flex;gap:1rem;position:absolute;right:1rem}.container .popup-box .action-buttons button[data-v-167a8000]{border:none;border-radius:.5rem;color:#fff;font-size:1rem;padding:.5rem 1rem}.container .popup-box .action-buttons button[data-v-167a8000]:active{font-size:.9rem}.container .popup-box .action-buttons .confirm-btn[data-v-167a8000]{background-color:#c83232}.container .popup-box .action-buttons .confirm-btn[data-v-167a8000]:hover{background-color:#e63232}.container .popup-box .action-buttons .cancel-btn[data-v-167a8000]{background-color:#3232c8}.container .popup-box .action-buttons .cancel-btn[data-v-167a8000]:hover{background-color:#3232f0}",""]),o.locals={},t.exports=o},316:function(t,e,n){"use strict";n.d(e,"a",(function(){return c}));var o=n(148),r=n(147),c=Object(o.a)((function t(){Object(r.a)(this,t)}))},318:function(t,e,n){"use strict";n.r(e);var o=n(1).a.extend({props:{notesName:{type:String}},methods:{confirm:function(){this.$emit("confirm")},close:function(){this.$emit("close")}}}),r=(n(314),n(50)),component=Object(r.a)(o,(function(){var t=this,e=t._self._c;t._self._setupProxy;return e("div",{staticClass:"container"},[e("div",{staticClass:"popup-box"},[e("h3",[t._v("\n      Confirm deletion\n      "),e("p",[t._v(t._s(t.notesName))])]),t._v(" "),e("div",{staticClass:"action-buttons"},[e("button",{staticClass:"confirm-btn",on:{click:function(e){return t.confirm()}}},[t._v("Confirm")]),t._v(" "),e("button",{staticClass:"cancel-btn",on:{click:function(e){return t.close()}}},[t._v("Cancel")])])])])}),[],!1,null,"167a8000",null);e.default=component.exports},326:function(t,e,n){"use strict";n(313)},327:function(t,e,n){var o=n(112)((function(i){return i[1]}));o.push([t.i,"main[data-v-74b2d8be]{background-color:#282828;display:grid;grid-template-columns:1fr 1fr;grid-template-rows:3.5rem auto;position:relative}main[data-v-74b2d8be] ::-webkit-scrollbar{width:.5rem}main[data-v-74b2d8be] ::-webkit-scrollbar-thumb{background-color:#000;border-radius:1rem}main[data-v-74b2d8be] ::-webkit-scrollbar-track{background-color:#787878;border-radius:1rem}main input[data-v-74b2d8be]{align-self:center;background-color:#969696;border:none;border-radius:1rem;font-size:1rem;justify-self:end;outline:none;padding:.4rem;text-align:center;width:75%}main input[data-v-74b2d8be]::-moz-placeholder{color:#000}main input[data-v-74b2d8be]::placeholder{color:#000}main .action-buttons[data-v-74b2d8be]{align-self:center;justify-self:end;margin-right:1rem}main .action-buttons button[data-v-74b2d8be]{border:none;border-bottom:2px solid #000;border-radius:.2rem;color:#fff;font-size:1.1rem;padding:.5rem 3rem;transition:all 50ms linear}main .action-buttons button[data-v-74b2d8be]:active{font-size:1rem}main .action-buttons button.red[data-v-74b2d8be]{background-color:#c83232}main .action-buttons button.red[data-v-74b2d8be]:hover{background-color:#e63232}main .action-buttons button.green[data-v-74b2d8be]{background-color:#32c832}main .action-buttons button.green[data-v-74b2d8be]:hover{background-color:#32e632}main textarea[data-v-74b2d8be]{background-color:#323232;border:1px solid #000;color:#dcdcdc;font-size:1rem;grid-column:span 2;letter-spacing:.5px;line-height:1.4rem;outline:none;padding:.5rem;resize:none}@media(max-width:60rem){main[data-v-74b2d8be]{grid-template-columns:100%;grid-template-rows:3.5rem 3.5rem auto}.action-buttons[data-v-74b2d8be]{grid-row:1/2}input[data-v-74b2d8be]{grid-row:2/3;justify-self:center!important}textarea[data-v-74b2d8be]{grid-row:3/4}}",""]),o.locals={},t.exports=o},332:function(t,e,n){"use strict";n.r(e);n(42),n(33),n(43),n(70),n(71),n(44),n(34);var o=n(25),r=(n(150),n(17),n(1)),c=n(316),d=n(309);function l(t,e){var n=Object.keys(t);if(Object.getOwnPropertySymbols){var o=Object.getOwnPropertySymbols(t);e&&(o=o.filter((function(e){return Object.getOwnPropertyDescriptor(t,e).enumerable}))),n.push.apply(n,o)}return n}var m=r.a.extend({props:{current:{type:Object,default:new c.a}},data:function(){return{currentNote:new c.a,showConfirmDeletionPopup:!1}},watch:{current:function(t){this.showConfirmDeletionPopup=!1,this.currentNote=function(t){for(var e=1;e<arguments.length;e++){var n=null!=arguments[e]?arguments[e]:{};e%2?l(Object(n),!0).forEach((function(e){Object(o.a)(t,e,n[e])})):Object.getOwnPropertyDescriptors?Object.defineProperties(t,Object.getOwnPropertyDescriptors(n)):l(Object(n)).forEach((function(e){Object.defineProperty(t,e,Object.getOwnPropertyDescriptor(n,e))}))}return t}({},t)}},methods:{onSave:function(){var t=this;try{this.currentNote.name=this.formatName(this.currentNote.name)}catch(t){}var e={headers:{Authorization:this.$store.getters.token}};this.$axios.$post("/notes",this.currentNote,e).then((function(n){t.currentNote=n,t.$axios.$get("/notes",e).then((function(e){t.$store.dispatch("loadNotes",e)})),new d.a("Saved")})).catch((function(){new d.a("Failed on Save",!0)}))},onDelete:function(){var t=this,e={headers:{Authorization:this.$store.getters.token}};this.$axios.$delete("/notes/"+this.currentNote.id,e).then((function(){t.$axios.$get("/notes",e).then((function(e){t.$store.dispatch("loadNotes",e),new d.a("Deleted")}))})).catch((function(){new d.a("Failed on Delete",!0)})).finally((function(){t.showConfirmDeletionPopup=!1,t.$emit("close")}))},formatName:function(t){var e=t.split("");return e[0]=e[0].toUpperCase(),e.join("")}}}),f=m,v=(n(326),n(50)),component=Object(v.a)(f,(function(){var t=this,e=t._self._c;t._self._setupProxy;return e("main",[e("input",{directives:[{name:"model",rawName:"v-model",value:t.currentNote.name,expression:"currentNote.name"}],attrs:{name:"noteName",placeholder:"Name",autocomplete:"off"},domProps:{value:t.currentNote.name},on:{input:function(e){e.target.composing||t.$set(t.currentNote,"name",e.target.value)}}}),t._v(" "),e("div",{staticClass:"action-buttons"},[e("button",{staticClass:"red",on:{click:function(e){t.showConfirmDeletionPopup=!0}}},[t._v("Delete")]),t._v(" "),e("button",{staticClass:"green",on:{click:function(e){return t.onSave()}}},[t._v("Save")])]),t._v(" "),e("textarea",{directives:[{name:"model",rawName:"v-model",value:t.currentNote.notes,expression:"currentNote.notes"}],attrs:{name:"notes",id:"notes",spellcheck:"false"},domProps:{value:t.currentNote.notes},on:{input:function(e){e.target.composing||t.$set(t.currentNote,"notes",e.target.value)}}}),t._v(" "),t.showConfirmDeletionPopup?e("ConfirmDeletionPopup",{attrs:{notesName:t.currentNote.name},on:{confirm:function(e){return t.onDelete()},close:function(e){t.showConfirmDeletionPopup=!1}}}):t._e()],1)}),[],!1,null,"74b2d8be",null);e.default=component.exports;installComponents(component,{ConfirmDeletionPopup:n(318).default})}}]);