$(
		function PostJson(event){
			//定义form到JSON对象字符串的转换
			function FormToJson(){
				var o = {};    
				var o1={};
				   var formArray = $("#UpdateNewsForm").serializeArray();    
				   $.each(formArray, function() {    
				       if (o[this.name]) {    
				           if (!o[this.name].push) {    
				               o[this.name] = [o[this.name]];    
				           }    
				           o[this.name].push(this.value.trim() || '');    
				       } else {    
				           o[this.name] = this.value.trim() || '';    
				       }    
				   });
				   /**
				    * @author Meng
				    * @param 字符串形式
				    * @return Json对象
				    * 第二种转换字符串的方式，得到序列化后的字符串，
				    */
				   /*var formArray = $("#UpdateNewsForm").serialize();
				   var fisrtSplit = formArray.split("&");
				   $.each(firstSplit,function(){
					   var s=this.split("=");
					   o1[s[0]]=s[1];
				   })*/
//				   o['createDate']='111';
				   o['author_id']=$("#author_id").val();
				   o['news_id']=$("#news_id").val();
				   
//				   o['news_id']=0;
				   delete o['topic_name'];
				   var name=$("#topic_name").val();
				   console.log(name);
				   if(name==="热点新闻"){
					   o['topic_id']=1;
				   }else if(name==="军事新闻"){
					   o['topic_id']=2;
				   }else if(name==="娱乐新闻"){
					   o['topic_id']=3;
				   }else if(name==="经济新闻"){
					   o['topic_id']=4;
				   }else if(name==="科技新闻"){
					   o['topic_id']=5;
				   }else{
					   o['topic_id']=6;
				   }
				   return JSON.stringify(o); 
			}
			$("#UpdateClick").click(
					function postJson(event){
						//阻止表单的默认提交行为
						event.preventDefault();
						//获取需要进行传输的json数据
						var formContent = FormToJson();
						console.log(formContent);
						$.ajax(
						{
							contentType : "application/json",
							url:"/news/UpdateNews",
							type:"POST",
							dataType:"json",
							data:formContent,
							success:function(data){
								if(data.isSuccess==="true"){
									alert("U succeed");
									window.location.href='/news/resources/html/transfer.html';
								}else{
									alert("U failed");
									window.location.href='/news/resources/html/transfer.html';
								}
							},
						}		
						);
						
					}
					)
		}
)