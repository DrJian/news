$(
		function PostJson(event){
			//定义form到JSON对象字符串的转换
			function FormToJson(){
				var o = {};    
				   var formArray = $("#AddNewsForm").serializeArray();    
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
				   o['createdate']='111';
				   o['author_id']=1;
				   o['news_id']=0;
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
			$("#submit1").click(
					function postJson(event){
						//阻止表单的默认提交行为
						event.preventDefault();
						//获取需要进行传输的json数据
						var formContent = FormToJson();
						console.log(formContent);
						$.ajax(
						{
							contentType : "application/json",
							url:"/news/AddNews",
							type:"POST",
							dataType:"json",
							data:formContent,
							success:function(data){
								console.log(data);
								if(data.result=="success"){
									alert("添加成功")
									window.location.href='/news/resources/html/AddNews.html';
								}else{
									alert("添加失败")
									window.location.href='/news/resources/html/AddNews.html';
								}
							},
							error:function(){
								console.log("未收到数据");
								alert("添加失败")
								window.location.href='/news/resources/html/AddNews.html';
							}
						}		
						);
						
					}
					)
		}
)