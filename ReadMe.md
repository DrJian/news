# News #

>这是一个SpringMVC项目，里面使用的Spring版本为4.1.2，这个项目是一个Spring,SpringMVC,Mybatis结合的SSM项目测试，项目是一个新闻类型的网站，里面用到了许多自己以前没有尝试过的新东西，包括了bootstrap，ajax，自然也有基本的html,css，jsp整个网站的规划以及数据库的设计均由一人完成，因为只是自己练手的项目，所有会有很多不足，希望各位见谅，会不定时进行更新，这个项目很适合各位初学者们参考，代码的注释部分还不是很完善，以后慢慢跟进。

##2016-2-14##

今天是第一次上传，目前网站的基本架构已搭起来，功能还没有做全，部分页面缺少以及页面做的不是很漂亮，但是学习还是可以的，下一次上传带ajax的部分，即添加新的新闻部分，这一部分自己还在做，在基本功能做完后，会把整个规划思路发给大家。
下面为本次的主要情况

- Maven项目，使用的Spring,mybaits，jar等版本信息在pom.xml中查看
- 三个主要实体类，newsinfo,topic,manager
- 4层:dao,service,controller,views
- 部分jsp页面也加入了不规范的js语法
- 可以参考对于web项目的路径等基本但又会造成困扰问题的解决
- 本次整体结构简单，各位可以理一理自己的思路

###开发环境###
- STS(Spring Tool Suite)-3.7.2版本
- JDK版本1.8
- bootstrap版本见项目中的具体页面,好像是3.x
- mybatis 3.x
- mysql 5.5
##2016-3-1##
- 新添加了对于新闻添加界面的ajax的使用，即AddNews.html，修改了由于之JS文件引入顺序造成的页面无法正常显示的情况，补充了mysql建库的数据填充脚本，位于resource/sql中。
- 由原来使用下载好的tomcat7版本，改为使用maven-plugin即插件版本的tomcat7，如果使用JDK8这里的maven-tomcat-plugin要使用2.2及以上版本！！！！

###大家有什么问题欢迎发邮件到###
> JianHong.Dlut@outlook.com